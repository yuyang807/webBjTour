package com.yy.tourweb.web.dto;

import java.util.Date;
import com.yy.tourweb.web.dto.IDto;

/**
  * 用户表(sys_user)映射Dto
  * @version 2017-09-07  * */ 
public class SysUserDto implements IDto {
    /**
     * 编号
     * */
    private String id;
    /**
     * 归属公司
     * */
    private String companyId;
    /**
     * 归属部门
     * */
    private String officeId;
    /**
     * 登录名
     * */
    private String loginName;
    /**
     * 密码
     * */
    private String password;
    /**
     * 工号
     * */
    private String no;
    /**
     * 姓名
     * */
    private String name;
    /**
     * 邮箱
     * */
    private String email;
    /**
     * 电话
     * */
    private String phone;
    /**
     * 手机
     * */
    private String mobile;
    /**
     * 用户类型
     * */
    private String userType;
    /**
     * 用户头像
     * */
    private String photo;
    /**
     * 最后登陆ip
     * */
    private String loginIp;
    /**
     * 最后登陆时间
     * */
    private Date loginDate;
    /**
     * 范围查询最后登陆时间使用
     * */
    private Date startLoginDate;
    /**
     * 范围查询最后登陆时间使用
     * */
    private Date endLoginDate;
    /**
     * 是否可登录
     * */
    private String loginFlag;
    /**
     * 创建者
     * */
    private String createBy;
    /**
     * 创建时间
     * */
    private Date createDate;
    /**
     * 范围查询创建时间使用
     * */
    private Date startCreateDate;
    /**
     * 范围查询创建时间使用
     * */
    private Date endCreateDate;
    /**
     * 更新者
     * */
    private String updateBy;
    /**
     * 更新时间
     * */
    private Date updateDate;
    /**
     * 范围查询更新时间使用
     * */
    private Date startUpdateDate;
    /**
     * 范围查询更新时间使用
     * */
    private Date endUpdateDate;
    /**
     * 备注信息
     * */
    private String remarks;
    /**
     * 删除标记
     * */
    private String delFlag;
    /**
     * 排序字段加排序规则组合体columnName desc
     * */
    private String orderByStr;
    /**
     * setId 编号
     * */
    public void setId(String id) {
        this.id=id;
    }

    /**
     * getId 编号
     * */
    public String getId() {
        return id;
    }

    /**
     * setCompanyId 归属公司
     * */
    public void setCompanyId(String companyId) {
        this.companyId=companyId;
    }

    /**
     * getCompanyId 归属公司
     * */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * setOfficeId 归属部门
     * */
    public void setOfficeId(String officeId) {
        this.officeId=officeId;
    }

    /**
     * getOfficeId 归属部门
     * */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * setLoginName 登录名
     * */
    public void setLoginName(String loginName) {
        this.loginName=loginName;
    }

    /**
     * getLoginName 登录名
     * */
    public String getLoginName() {
        return loginName;
    }

    /**
     * setPassword 密码
     * */
    public void setPassword(String password) {
        this.password=password;
    }

    /**
     * getPassword 密码
     * */
    public String getPassword() {
        return password;
    }

    /**
     * setNo 工号
     * */
    public void setNo(String no) {
        this.no=no;
    }

    /**
     * getNo 工号
     * */
    public String getNo() {
        return no;
    }

    /**
     * setName 姓名
     * */
    public void setName(String name) {
        this.name=name;
    }

    /**
     * getName 姓名
     * */
    public String getName() {
        return name;
    }

    /**
     * setEmail 邮箱
     * */
    public void setEmail(String email) {
        this.email=email;
    }

    /**
     * getEmail 邮箱
     * */
    public String getEmail() {
        return email;
    }

    /**
     * setPhone 电话
     * */
    public void setPhone(String phone) {
        this.phone=phone;
    }

    /**
     * getPhone 电话
     * */
    public String getPhone() {
        return phone;
    }

    /**
     * setMobile 手机
     * */
    public void setMobile(String mobile) {
        this.mobile=mobile;
    }

    /**
     * getMobile 手机
     * */
    public String getMobile() {
        return mobile;
    }

    /**
     * setUserType 用户类型
     * */
    public void setUserType(String userType) {
        this.userType=userType;
    }

    /**
     * getUserType 用户类型
     * */
    public String getUserType() {
        return userType;
    }

    /**
     * setPhoto 用户头像
     * */
    public void setPhoto(String photo) {
        this.photo=photo;
    }

    /**
     * getPhoto 用户头像
     * */
    public String getPhoto() {
        return photo;
    }

    /**
     * setLoginIp 最后登陆ip
     * */
    public void setLoginIp(String loginIp) {
        this.loginIp=loginIp;
    }

    /**
     * getLoginIp 最后登陆ip
     * */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * setLoginDate 最后登陆时间
     * */
    public void setLoginDate(Date loginDate) {
        this.loginDate=loginDate;
    }

    /**
     * getLoginDate 最后登陆时间
     * */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * setStartloginDate 最后登陆时间
     * */
    public void setStartloginDate(Date startLoginDate) {
        this.startLoginDate=startLoginDate;
    }

    /**
     * getStartloginDate 最后登陆时间
     * */
    public Date getStartloginDate() {
        return startLoginDate;
    }

    /**
     * setEndloginDate 最后登陆时间
     * */
    public void setEndloginDate(Date endLoginDate) {
        this.endLoginDate=endLoginDate;
    }

    /**
     * getEndloginDate 最后登陆时间
     * */
    public Date getEndloginDate() {
        return endLoginDate;
    }

    /**
     * setLoginFlag 是否可登录
     * */
    public void setLoginFlag(String loginFlag) {
        this.loginFlag=loginFlag;
    }

    /**
     * getLoginFlag 是否可登录
     * */
    public String getLoginFlag() {
        return loginFlag;
    }

    /**
     * setCreateBy 创建者
     * */
    public void setCreateBy(String createBy) {
        this.createBy=createBy;
    }

    /**
     * getCreateBy 创建者
     * */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * setCreateDate 创建时间
     * */
    public void setCreateDate(Date createDate) {
        this.createDate=createDate;
    }

    /**
     * getCreateDate 创建时间
     * */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * setStartcreateDate 创建时间
     * */
    public void setStartcreateDate(Date startCreateDate) {
        this.startCreateDate=startCreateDate;
    }

    /**
     * getStartcreateDate 创建时间
     * */
    public Date getStartcreateDate() {
        return startCreateDate;
    }

    /**
     * setEndcreateDate 创建时间
     * */
    public void setEndcreateDate(Date endCreateDate) {
        this.endCreateDate=endCreateDate;
    }

    /**
     * getEndcreateDate 创建时间
     * */
    public Date getEndcreateDate() {
        return endCreateDate;
    }

    /**
     * setUpdateBy 更新者
     * */
    public void setUpdateBy(String updateBy) {
        this.updateBy=updateBy;
    }

    /**
     * getUpdateBy 更新者
     * */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * setUpdateDate 更新时间
     * */
    public void setUpdateDate(Date updateDate) {
        this.updateDate=updateDate;
    }

    /**
     * getUpdateDate 更新时间
     * */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * setStartupdateDate 更新时间
     * */
    public void setStartupdateDate(Date startUpdateDate) {
        this.startUpdateDate=startUpdateDate;
    }

    /**
     * getStartupdateDate 更新时间
     * */
    public Date getStartupdateDate() {
        return startUpdateDate;
    }

    /**
     * setEndupdateDate 更新时间
     * */
    public void setEndupdateDate(Date endUpdateDate) {
        this.endUpdateDate=endUpdateDate;
    }

    /**
     * getEndupdateDate 更新时间
     * */
    public Date getEndupdateDate() {
        return endUpdateDate;
    }

    /**
     * setRemarks 备注信息
     * */
    public void setRemarks(String remarks) {
        this.remarks=remarks;
    }

    /**
     * getRemarks 备注信息
     * */
    public String getRemarks() {
        return remarks;
    }

    /**
     * setDelFlag 删除标记
     * */
    public void setDelFlag(String delFlag) {
        this.delFlag=delFlag;
    }

    /**
     * getDelFlag 删除标记
     * */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 排序字段加排序规则组合体columnName desc
     * */
    public void setOrderByStr(String orderByStr) {
        this.orderByStr=orderByStr;
    }

    public String getOrderByStr() {
        return orderByStr;
    }

}