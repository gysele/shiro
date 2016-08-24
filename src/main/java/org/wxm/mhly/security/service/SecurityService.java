package org.wxm.mhly.security.service;

import java.util.List;

import org.wxm.mhly.security.view.UserDetail;
import org.wxm.mhly.security.view.VSysMenu;

/**
 * <b>标题: </b>用户权限SERVICE接口 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-19 下午9:14:55 <br/>
 * <b>修改记录: </b>
 * 
 */
public interface SecurityService {
    /**
     * 
     * <b>标题: </b>根据用户名查找用户 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
     * <b>时间: </b>2016-8-19 下午9:15:33 <br/>
     * <b>修改记录: </b>
     * 
     * @param username
     *            用户名
     * @return
     */
    public UserDetail findUserByUsername(String username);

    /**
     * 
     * <b>标题: </b>根据用户ID查找菜单 <br/>
     * <b>描述: </b> <br/>
     * <b>版本: </b>V1.0 <br/>
     * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
     * <b>时间: </b>2016-8-20 上午12:24:57 <br/>
     * <b>修改记录: </b>
     * 
     * @param userId
     *            用户ID
     * @return
     */
    public List<VSysMenu> findMenuByUserId(String userId);
}
