package org.wxm.mhly.security.bean;

import org.wxm.core.base.bean.BaseFieldInfo;

/**
 * <b>标题: </b>系统角色POJO类 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-15 下午9:46:06 <br/>
 * <b>修改记录: </b>
 * 
 */
public class SysRole extends BaseFieldInfo {
    private String roleCode; // 角色编号
    private String roleName; // 角色名称
    private String roleIconCss; // 角色Icon样式
    private Integer roleOrder; // 排序

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleIconCss() {
        return roleIconCss;
    }

    public void setRoleIconCss(String roleIconCss) {
        this.roleIconCss = roleIconCss;
    }

    public Integer getRoleOrder() {
        return roleOrder;
    }

    public void setRoleOrder(Integer roleOrder) {
        this.roleOrder = roleOrder;
    }

}
