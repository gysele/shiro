import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.util.Factory;
import org.junit.Test;

/**
 * <b>标题: </b> <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-14 下午7:02:50 <br/>
 * <b>修改记录: </b>
 * 
 */
public class AuthenticationTest {
    // 用户登录和退出
   // @Test
    public void testLoginAndLoginOut() {
        // 创建一个securityManager 通过ini文件创建
        Factory<SecurityManager> securityManagerFactory = new IniSecurityManagerFactory("classpath:shrio-frist.ini");
        // XMLSecurityManager
        // 创建SecurityManager
        SecurityManager securityManager = securityManagerFactory.getInstance();
        // 将SecurityManager创建到生成环境中
        SecurityUtils.setSecurityManager(securityManager);
        // 从SecurityUtils 构建一个subject
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        // 认证提交认证token
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("ycy", "222");
        // 执行认证提交认证
        try {
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException ex) {
            ex.printStackTrace();
        }
        System.out.println("是否通过认证：" + subject.isAuthenticated());
        // 退出
        subject.logout();
        System.out.println("是否通过认证：" + subject.isAuthenticated());
    }

    // 用户登录和退出(自定义realm)
    @Test
    public void testCustomRealm() {
        // 创建一个securityManager 通过ini文件创建
        Factory<SecurityManager> securityManagerFactory = new IniSecurityManagerFactory("classpath:shrio-realm.ini");
        // XMLSecurityManager
        // 创建SecurityManager
        SecurityManager securityManager = securityManagerFactory.getInstance();
        // 将SecurityManager创建到生成环境中
        SecurityUtils.setSecurityManager(securityManager);
        // 从SecurityUtils 构建一个subject
        org.apache.shiro.subject.Subject subject = SecurityUtils.getSubject();
        // 认证提交认证token
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("ycy", "222");
        // 执行认证提交认证
        try {
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException ex) {
            ex.printStackTrace();
        }
        System.out.println("是否通过认证：" + subject.isAuthenticated());
        // 退出
        subject.logout();
        System.out.println("是否通过认证：" + subject.isAuthenticated());
    }
}
