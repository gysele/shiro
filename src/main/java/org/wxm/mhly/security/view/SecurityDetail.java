package org.wxm.mhly.security.view;

import java.util.List;

/**
 * <b>标题: </b>用户权限信息 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-16 下午10:16:14 <br/>
 * <b>修改记录: </b>
 * 
 */
public class SecurityDetail {
    private String menuUrl; // 菜单URL
    private List<String> opCodes; // 操作代码

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public List<String> getOpCodes() {
        return opCodes;
    }

    public void setOpCodes(List<String> opCodes) {
        this.opCodes = opCodes;
    }
}
