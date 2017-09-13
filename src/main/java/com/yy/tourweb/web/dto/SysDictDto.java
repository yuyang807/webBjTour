package com.yy.tourweb.web.dto;

import java.math.BigDecimal;
import java.util.Date;
import com.yy.tourweb.web.dto.IDto;

/**
  * 字典表(sys_dict)映射Dto
  * @version 2017-09-07  * */ 
public class SysDictDto implements IDto {
    /**
     * 编号
     * */
    private String id;
    /**
     * 数据值
     * */
    private String value;
    /**
     * 标签名
     * */
    private String label;
    /**
     * 类型
     * */
    private String type;
    /**
     * 描述
     * */
    private String description;
    /**
     * 排序（升序）
     * */
    private BigDecimal sort;
    /**
     * 父级编号
     * */
    private String parentId;
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
     * setValue 数据值
     * */
    public void setValue(String value) {
        this.value=value;
    }

    /**
     * getValue 数据值
     * */
    public String getValue() {
        return value;
    }

    /**
     * setLabel 标签名
     * */
    public void setLabel(String label) {
        this.label=label;
    }

    /**
     * getLabel 标签名
     * */
    public String getLabel() {
        return label;
    }

    /**
     * setType 类型
     * */
    public void setType(String type) {
        this.type=type;
    }

    /**
     * getType 类型
     * */
    public String getType() {
        return type;
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
     * setSort 排序（升序）
     * */
    public void setSort(BigDecimal sort) {
        this.sort=sort;
    }

    /**
     * getSort 排序（升序）
     * */
    public BigDecimal getSort() {
        return sort;
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