package com.yy.tourweb.web.dto;

import java.math.BigDecimal;
import java.util.Date;
import com.yy.tourweb.web.dto.IDto;

/**
  * 机构表(sys_office)映射Dto
  * @version 2017-09-07  * */ 
public class SysOfficeDto implements IDto {
    /**
     * 编号
     * */
    private String id;
    /**
     * 父级编号
     * */
    private String parentId;
    /**
     * 所有父级编号
     * */
    private String parentIds;
    /**
     * 名称
     * */
    private String name;
    /**
     * 排序
     * */
    private BigDecimal sort;
    /**
     * 归属区域
     * */
    private String areaId;
    /**
     * 区域编码
     * */
    private String code;
    /**
     * 机构类型
     * */
    private String type;
    /**
     * 机构等级
     * */
    private String grade;
    /**
     * 联系地址
     * */
    private String address;
    /**
     * 邮政编码
     * */
    private String zipCode;
    /**
     * 负责人
     * */
    private String master;
    /**
     * 电话
     * */
    private String phone;
    /**
     * 传真
     * */
    private String fax;
    /**
     * 邮箱
     * */
    private String email;
    /**
     * 是否启用
     * */
    private String useable;
    /**
     * 主负责人
     * */
    private String primaryPerson;
    /**
     * 副负责人
     * */
    private String deputyPerson;
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
     * setParentId 父级编号
     * */
    public void setParentId(String parentId) {
        this.parentId=parentId;
    }

    /**
     * getParentId 父级编号
     * */
    public String getParentId() {
        return parentId;
    }

    /**
     * setParentIds 所有父级编号
     * */
    public void setParentIds(String parentIds) {
        this.parentIds=parentIds;
    }

    /**
     * getParentIds 所有父级编号
     * */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * setName 名称
     * */
    public void setName(String name) {
        this.name=name;
    }

    /**
     * getName 名称
     * */
    public String getName() {
        return name;
    }

    /**
     * setSort 排序
     * */
    public void setSort(BigDecimal sort) {
        this.sort=sort;
    }

    /**
     * getSort 排序
     * */
    public BigDecimal getSort() {
        return sort;
    }

    /**
     * setAreaId 归属区域
     * */
    public void setAreaId(String areaId) {
        this.areaId=areaId;
    }

    /**
     * getAreaId 归属区域
     * */
    public String getAreaId() {
        return areaId;
    }

    /**
     * setCode 区域编码
     * */
    public void setCode(String code) {
        this.code=code;
    }

    /**
     * getCode 区域编码
     * */
    public String getCode() {
        return code;
    }

    /**
     * setType 机构类型
     * */
    public void setType(String type) {
        this.type=type;
    }

    /**
     * getType 机构类型
     * */
    public String getType() {
        return type;
    }

    /**
     * setGrade 机构等级
     * */
    public void setGrade(String grade) {
        this.grade=grade;
    }

    /**
     * getGrade 机构等级
     * */
    public String getGrade() {
        return grade;
    }

    /**
     * setAddress 联系地址
     * */
    public void setAddress(String address) {
        this.address=address;
    }

    /**
     * getAddress 联系地址
     * */
    public String getAddress() {
        return address;
    }

    /**
     * setZipCode 邮政编码
     * */
    public void setZipCode(String zipCode) {
        this.zipCode=zipCode;
    }

    /**
     * getZipCode 邮政编码
     * */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * setMaster 负责人
     * */
    public void setMaster(String master) {
        this.master=master;
    }

    /**
     * getMaster 负责人
     * */
    public String getMaster() {
        return master;
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
     * setFax 传真
     * */
    public void setFax(String fax) {
        this.fax=fax;
    }

    /**
     * getFax 传真
     * */
    public String getFax() {
        return fax;
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
     * setUseable 是否启用
     * */
    public void setUseable(String useable) {
        this.useable=useable;
    }

    /**
     * getUseable 是否启用
     * */
    public String getUseable() {
        return useable;
    }

    /**
     * setPrimaryPerson 主负责人
     * */
    public void setPrimaryPerson(String primaryPerson) {
        this.primaryPerson=primaryPerson;
    }

    /**
     * getPrimaryPerson 主负责人
     * */
    public String getPrimaryPerson() {
        return primaryPerson;
    }

    /**
     * setDeputyPerson 副负责人
     * */
    public void setDeputyPerson(String deputyPerson) {
        this.deputyPerson=deputyPerson;
    }

    /**
     * getDeputyPerson 副负责人
     * */
    public String getDeputyPerson() {
        return deputyPerson;
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