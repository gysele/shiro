package org.wxm.mhly.security.web;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <b>标题: </b> <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-21 下午3:04:48 <br/>
 * <b>修改记录: </b>
 * 
 */
@Controller
public class SecurityController {

    @RequestMapping("/loginPage")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(String username, String password) {
        String result = "login";
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        Subject currentUser = SecurityUtils.getSubject();
        try {
            System.out.println("----------------------------");
            if (!currentUser.isAuthenticated()) {
                token.setRememberMe(true);
                currentUser.login(token);
            }
            System.out.println("result: " + result);
            result = "index";
        } catch (Exception e) {
            result = "login";
        }
        return result;
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    /**
     * 登出
     * 
     * @return
     */
    @RequestMapping(value = "/logout")
    public String logout() {
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
        return "login";
    }
}
