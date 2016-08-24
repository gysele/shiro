package org.wxm.mhly.security.bean;

import org.wxm.core.base.bean.BaseFieldInfo;

/**
 * <b>标题: </b>系统菜单POJO类 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-15 下午11:37:21 <br/>
 * <b>修改记录: </b>
 * 
 */
public class SysMenu extends BaseFieldInfo {
    private String menuName; // 菜单名称
    private String parentId; // 父ID
    private String menuUrl; // 菜单URL
    private String picUrl; // 图片URL
    private String menuCss; // 菜单CSS样式
    private String menuIconCss; // 菜单Icon样式
    private Integer menuOrder; // 排序

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getMenuCss() {
        return menuCss;
    }

    public void setMenuCss(String menuCss) {
        this.menuCss = menuCss;
    }

    public String getMenuIconCss() {
        return menuIconCss;
    }

    public void setMenuIconCss(String menuIconCss) {
        this.menuIconCss = menuIconCss;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

}
