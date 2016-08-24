package org.wxm.mhly.security.view;

import java.util.List;

import org.wxm.mhly.security.bean.SysRole;

/**
 * <b>标题: </b>系统角色视图类 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-15 下午9:50:57 <br/>
 * <b>修改记录: </b>
 * 
 */
public class VSysRole extends SysRole {
    private List<VSysMenu> menus;

    public List<VSysMenu> getMenus() {
        return menus;
    }

    public void setMenus(List<VSysMenu> menus) {
        this.menus = menus;
    }
}
