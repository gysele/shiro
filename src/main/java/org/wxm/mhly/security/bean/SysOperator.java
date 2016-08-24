package org.wxm.mhly.security.bean;

import org.wxm.core.base.bean.BaseFieldInfo;

/**
 * <b>标题: </b>系统操作POJO类 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-15 下午11:42:06 <br/>
 * <b>修改记录: </b>
 * 
 */
public class SysOperator extends BaseFieldInfo {
    private String opCode; // 操作代码
    private String opName; // 操作名称
    private Integer opOrder; // 排序

    public String getOpCode() {
        return opCode;
    }

    public void setOpCode(String opCode) {
        this.opCode = opCode;
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName;
    }

    public Integer getOpOrder() {
        return opOrder;
    }

    public void setOpOrder(Integer opOrder) {
        this.opOrder = opOrder;
    }

}
