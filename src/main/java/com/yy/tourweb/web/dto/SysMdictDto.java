package com.yy.tourweb.web.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
  * 多级字典表(sys_mdict)映射Dto
  * @version 2017-02-15 10:52:10
  * */ 
public class SysMdictDto implements IDto {
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
     * 描述
     * */
    private String description;
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
    private String startCreateDate;
    /**
     * 范围查询创建时间使用
     * */
    private String endCreateDate;
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
    private String startUpdateDate;
    /**
     * 范围查询更新时间使用
     * */
    private String endUpdateDate;
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
     * setDescription 描述
     * */
    public void setDescription(String description) {
        this.description=description;
    }

    /**
     * getDescription 描述
     * */
    public String getDescription() {
        return description;
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
    public void setStartcreateDate(String startCreateDate) {
        this.startCreateDate=startCreateDate;
    }

    /**
     * getStartcreateDate 创建时间
     * */
    public String getStartcreateDate() {
        return startCreateDate;
    }

    /**
     * setEndcreateDate 创建时间
     * */
    public void setEndcreateDate(String endCreateDate) {
        this.endCreateDate=endCreateDate;
    }

    /**
     * getEndcreateDate 创建时间
     * */
    public String getEndcreateDate() {
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
    public void setStartupdateDate(String startUpdateDate) {
        this.startUpdateDate=startUpdateDate;
    }

    /**
     * getStartupdateDate 更新时间
     * */
    public String getStartupdateDate() {
        return startUpdateDate;
    }

    /**
     * setEndupdateDate 更新时间
     * */
    public void setEndupdateDate(String endUpdateDate) {
        this.endUpdateDate=endUpdateDate;
    }

    /**
     * getEndupdateDate 更新时间
     * */
    public String getEndupdateDate() {
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