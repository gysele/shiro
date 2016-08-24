package org.wxm.mhly.security.bean;

import org.wxm.core.base.bean.BaseFieldInfo;

/**
 * <b>标题: </b>系统用户POJO类 <br/>
 * <b>描述: </b> <br/>
 * <b>版本: </b>V1.0 <br/>
 * <b>作者: </b>吴晓敏 15109870670@139.com <br/>
 * <b>时间: </b>2016-8-15 下午8:16:25 <br/>
 * <b>修改记录: </b>
 * 
 */
public class SysUser extends BaseFieldInfo {
    private String username; // 用户名
    private String password; // 密码
    private String cnName; // 中文姓名
    private String enName; // 英文姓名
    private String cellphone; // 手机号码
    private String userTel; // 固话号码
    private String userEmail; // 邮箱
    private String userAddr; // 联系地址
    private String userGender; // 性别[0:未知][1:男][2:女]
    private String userBirthday; // 生日
    private String userPicUrl; // 用户头像地址
    private String isSysAdmin; // 是否超级管理员[0,否][1,是]
    private String isLocked; // 是否锁定[0:否][1:是]
    private String accountExpiredDate; // 账号过期日期
    private String credentialsExpiredDate; // 密码过期日期
    private Integer userOrder; // 排序

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPicUrl() {
        return userPicUrl;
    }

    public void setUserPicUrl(String userPicUrl) {
        this.userPicUrl = userPicUrl;
    }

    public String getIsSysAdmin() {
        return isSysAdmin;
    }

    public void setIsSysAdmin(String isSysAdmin) {
        this.isSysAdmin = isSysAdmin;
    }

    public String getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(String isLocked) {
        this.isLocked = isLocked;
    }

    public String getAccountExpiredDate() {
        return accountExpiredDate;
    }

    public void setAccountExpiredDate(String accountExpiredDate) {
        this.accountExpiredDate = accountExpiredDate;
    }

    public String getCredentialsExpiredDate() {
        return credentialsExpiredDate;
    }

    public void setCredentialsExpiredDate(String credentialsExpiredDate) {
        this.credentialsExpiredDate = credentialsExpiredDate;
    }

    public Integer getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(Integer userOrder) {
        this.userOrder = userOrder;
    }

}
