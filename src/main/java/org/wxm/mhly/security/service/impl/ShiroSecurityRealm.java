package org.wxm.mhly.security.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.wxm.mhly.security.service.SecurityService;
import org.wxm.mhly.security.view.UserDetail;
import org.wxm.mhly.security.view.VSysMenu;

/**
 * <b>标题: </b>自定义Shiro用户权限信息封装类 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-21 下午2:45:14 <br/>
 * <b>修改记录: </b>
 * 
 */
public class ShiroSecurityRealm extends AuthorizingRealm {

    Logger logger = LoggerFactory.getLogger(this.getClass()); // 日志

    @Autowired
    private SecurityService securityService; // 用户权限SERVICE接口

    /**
     * 
     * <b>标题: </b>验证当前登录的Subject <br/>
     * <b>描述: </b>方法的调用时机为LoginController.login()方法中执行Subject.login()时 <br/>
     * <b>版本: </b>1.0 <br/>
     * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
     * <b>时间: </b>2016-8-15 下午7:12:36 <br/>
     * <b>修改记录: </b>
     * 
     * @param authcToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        // 获取基于用户名和密码的令牌
        // 实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
        // 两个token的引用都是一样的
        UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
        // 用户名
        String username = String.valueOf(token.getPrincipal());
        // 密码
        String password = new String((char[]) token.getCredentials());

        logger.info("验证当前Subject时获取到token为" + ReflectionToStringBuilder.toString(token, ToStringStyle.MULTI_LINE_STYLE));

        // 根据用户名查询用户信息，包括角色、权限信息
        UserDetail userDetails = securityService.findUserByUsername(username);

        // 没有返回登录用户名对应的SimpleAuthenticationInfo对象时,就会在LoginController中抛出UnknownAccountException异常
        if (null == userDetails) {
            return null;
        }

        // 声明用户信息
        UserDetail user = new UserDetail();
        // 复制用户信息
        BeanUtils.copyProperties(userDetails, user);

        // 菜单信息
        List<VSysMenu> menus = securityService.findMenuByUserId(user.getId());
        user.setMenus(menus);

        // 封装返回对象
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user, password, ByteSource.Util.bytes(username), this.getName());
        return simpleAuthenticationInfo;
    }

    /**
     * 
     * <b>标题: </b>为当前登录的Subject授予角色和权限 <br/>
     * <b>描述: </b>授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用. <br/>
     * <b>版本: </b>1.0 <br/>
     * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
     * <b>时间: </b>2016-8-21 下午9:12:07 <br/>
     * <b>修改记录: </b>
     * 
     * @see 经测试:本例中该方法的调用时机为需授权资源被访问时
     * @see 经测试:并且每次访问需授权资源时都会执行该方法中的逻辑,这表明本例中默认并未启用AuthorizationCache
     * @see 个人感觉若使用了Spring3.1开始提供的ConcurrentMapCache支持,则可灵活决定是否启用AuthorizationCache
     * @see 比如说这里从数据库获取权限信息时,先去访问Spring3.1提供的缓存,而不使用Shior提供的AuthorizationCache
     * 
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        // 从 principals获取主身份信息
        // 将getPrimaryPrincipal方法返回值转为真实身份类型（在上边的doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中身份类型），
        // UserDetail userDetail = (UserDetail) principals.getPrimaryPrincipal();

        // 单独定一个集合对象
        List<String> permissions = new ArrayList<String>();

        // 查到权限数据，返回授权信息(要包括 上边的permissions)
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        // 将上边查询到授权信息填充到simpleAuthorizationInfo对象中
        simpleAuthorizationInfo.addStringPermissions(permissions);

        // 若该方法什么都不做直接返回null的话,就会导致任何用户访问/admin/listUser.jsp时都会自动跳转到unauthorizedUrl指定的地址
        // 详见applicationContext.xml中的<bean id="shiroFilter">的配置
        return simpleAuthorizationInfo;
    }

    /**
     * 更新用户授权信息缓存.
     */
    public void clearCachedAuthorizationInfo(String principal) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
        clearCachedAuthorizationInfo(principals);
    }

    /**
     * 清除所有用户授权信息缓存.
     */
    public void clearAllCachedAuthorizationInfo() {
        Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
        if (cache != null) {
            for (Object key : cache.keys()) {
                cache.remove(key);
            }
        }
    }
}
