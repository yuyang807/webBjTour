package com.yy.tourweb.web.dto;

import java.util.Date;
import com.yy.tourweb.web.dto.IDto;

/**
  * 角色表(sys_role)映射Dto
  * @version 2017-09-07  * */ 
public class SysRoleDto implements IDto {
    /**
     * 编号
     * */
    private String id;
    /**
     * 归属机构
     * */
    private String officeId;
    /**
     * 角色名称
     * */
    private String name;
    /**
     * 英文名称
     * */
    private String enname;
    /**
     * 角色类型
     * */
    private String roleType;
    /**
     * 数据范围
     * */
    private String dataScope;
    /**
     * 是否系统数据
     * */
    private String isSys;
    /**
     * 是否可用
     * */
    private String useable;
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
     * setOfficeId 归属机构
     * */
    public void setOfficeId(String officeId) {
        this.officeId=officeId;
    }

    /**
     * getOfficeId 归属机构
     * */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * setName 角色名称
     * */
    public void setName(String name) {
        this.name=name;
    }

    /**
     * getName 角色名称
     * */
    public String getName() {
        return name;
    }

    /**
     * setEnname 英文名称
     * */
    public void setEnname(String enname) {
        this.enname=enname;
    }

    /**
     * getEnname 英文名称
     * */
    public String getEnname() {
        return enname;
    }

    /**
     * setRoleType 角色类型
     * */
    public void setRoleType(String roleType) {
        this.roleType=roleType;
    }

    /**
     * getRoleType 角色类型
     * */
    public String getRoleType() {
        return roleType;
    }

    /**
     * setDataScope 数据范围
     * */
    public void setDataScope(String dataScope) {
        this.dataScope=dataScope;
    }

    /**
     * getDataScope 数据范围
     * */
    public String getDataScope() {
        return dataScope;
    }

    /**
     * setIsSys 是否系统数据
     * */
    public void setIsSys(String isSys) {
        this.isSys=isSys;
    }

    /**
     * getIsSys 是否系统数据
     * */
    public String getIsSys() {
        return isSys;
    }

    /**
     * setUseable 是否可用
     * */
    public void setUseable(String useable) {
        this.useable=useable;
    }

    /**
     * getUseable 是否可用
     * */
    public String getUseable() {
        return useable;
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