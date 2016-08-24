package org.wxm.core.base.bean;

/**
 * <b>标题: </b> 通用属性基类 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b> 1.0 <br/>
 * <b>作者: </b> 吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b> 2016-4-1 下午11:56:44 <br/>
 * <b>修改记录: </b>
 */

public class BaseFieldInfo extends BaseUUID {
    private String remark; // 备注
    private String createdBy; // 创建人
    private String createdAt; // 创建日期
    private String reviserId; // 更新人
    private String reviseDate; // 更新日期
    private String isValid; // 是否有效[0:否][1:是]

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getReviserId() {
        return reviserId;
    }

    public void setReviserId(String reviserId) {
        this.reviserId = reviserId;
    }

    public String getReviseDate() {
        return reviseDate;
    }

    public void setReviseDate(String reviseDate) {
        this.reviseDate = reviseDate;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

}
