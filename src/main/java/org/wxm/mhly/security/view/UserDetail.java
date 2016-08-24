package org.wxm.mhly.security.view;

import java.util.List;

import org.wxm.mhly.security.bean.SysUser;

/**
 * <b>标题: </b>用户权限 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-15 下午8:44:55 <br/>
 * <b>修改记录: </b>
 * 
 */
public class UserDetail extends SysUser {
    private String roleCode; // 角色编号
    private String menuUrl; // 菜单URL
    private String opCode; // 操作代码

    /**
     * 验证信息，暂不用
     */
    private boolean isAccountNonExpired; // 用户账号是否没过期[true:是][false:否]
    private boolean isCredentialsNonExpired; // 用户密码是否没过期[true:是][false:否]
    private boolean isAccountNonLocked; // 用户账号是否没被锁定[true:是][false:否]
    private boolean isEnabled; // 用户是否有效[true:是][false:否]

    /**
     * 权限信息
     */
    private List<VSysMenu> menus; // 菜单

    /*****************************
     * Getter And Setter Methods *
     *****************************/

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    public void setAccountNonExpired(boolean isAccountNonExpired) {
        this.isAccountNonExpired = isAccountNonExpired;
    }

    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
        this.isCredentialsNonExpired = isCredentialsNonExpired;
    }

    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    public void setAccountNonLocked(boolean isAccountNonLocked) {
        this.isAccountNonLocked = isAccountNonLocked;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public List<VSysMenu> getMenus() {
        return menus;
    }

    public void setMenus(List<VSysMenu> menus) {
        this.menus = menus;
    }

}
