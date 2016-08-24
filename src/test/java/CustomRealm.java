import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * <b>标题: </b> <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-14 下午7:35:47 <br/>
 * <b>修改记录: </b>
 * 
 */
public class CustomRealm extends AuthorizingRealm {
    // 用户认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // authenticationToken为用户输入信息
        String userCode = (String) authenticationToken.getPrincipal();
        // 模拟数据库操作查询用户
        if (!userCode.equals("ycy")) {
            return null;
        }
        // 查询密码为111
        String password = "222";

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userCode, password, "customRealm");

        return info;
    }

    // 用户授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

}
