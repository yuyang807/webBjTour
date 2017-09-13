package com.yy.tourweb.web.dto;

import java.util.Date;

/**
  * 省份信息表(sys_province)映射Dto
  * @version 2017-02-15 10:52:10
  * */ 
public class SysProvinceDto implements IDto {
    /**
     * 
     * */
    private Long provinceId;
    /**
     * 
     * */
    private String provinceName;
    /**
     * 
     * */
    private Date createDate;
    /**
     * 范围查询使用
     * */
    private String startCreateDate;
    /**
     * 范围查询使用
     * */
    private String endCreateDate;
    /**
     * 
     * */
    private Date updateDate;
    /**
     * 范围查询使用
     * */
    private String startUpdateDate;
    /**
     * 范围查询使用
     * */
    private String endUpdateDate;
    /**
     * 排序字段加排序规则组合体columnName desc
     * */
    private String orderByStr;
    /**
     * setProvinceId 
     * */
    public void setProvinceId(Long provinceId) {
        this.provinceId=provinceId;
    }

    /**
     * getProvinceId 
     * */
    public Long getProvinceId() {
        return provinceId;
    }

    /**
     * setProvinceName 
     * */
    public void setProvinceName(String provinceName) {
        this.provinceName=provinceName;
    }

    /**
     * getProvinceName 
     * */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * setCreateDate 
     * */
    public void setCreateDate(Date createDate) {
        this.createDate=createDate;
    }

    /**
     * getCreateDate 
     * */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * setStartcreateDate 
     * */
    public void setStartcreateDate(String startCreateDate) {
        this.startCreateDate=startCreateDate;
    }

    /**
     * getStartcreateDate 
     * */
    public String getStartcreateDate() {
        return startCreateDate;
    }

    /**
     * setEndcreateDate 
     * */
    public void setEndcreateDate(String endCreateDate) {
        this.endCreateDate=endCreateDate;
    }

    /**
     * getEndcreateDate 
     * */
    public String getEndcreateDate() {
        return endCreateDate;
    }

    /**
     * setUpdateDate 
     * */
    public void setUpdateDate(Date updateDate) {
        this.updateDate=updateDate;
    }

    /**
     * getUpdateDate 
     * */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * setStartupdateDate 
     * */
    public void setStartupdateDate(String startUpdateDate) {
        this.startUpdateDate=startUpdateDate;
    }

    /**
     * getStartupdateDate 
     * */
    public String getStartupdateDate() {
        return startUpdateDate;
    }

    /**
     * setEndupdateDate 
     * */
    public void setEndupdateDate(String endUpdateDate) {
        this.endUpdateDate=endUpdateDate;
    }

    /**
     * getEndupdateDate 
     * */
    public String getEndupdateDate() {
        return endUpdateDate;
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