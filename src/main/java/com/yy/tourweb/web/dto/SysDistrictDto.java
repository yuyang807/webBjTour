package com.yy.tourweb.web.dto;

import java.util.Date;

/**
  * 区域信息表(sys_district)映射Dto
  * @version 2017-02-15 10:52:10
  * */ 
public class SysDistrictDto implements IDto {
    /**
     * 
     * */
    private Long districtId;
    /**
     * 
     * */
    private String districtName;
    /**
     * 
     * */
    private Long cityId;
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
    private Date updatDate;
    /**
     * 范围查询使用
     * */
    private String startUpdatDate;
    /**
     * 范围查询使用
     * */
    private String endUpdatDate;
    /**
     * 排序字段加排序规则组合体columnName desc
     * */
    private String orderByStr;
    /**
     * setDistrictId 
     * */
    public void setDistrictId(Long districtId) {
        this.districtId=districtId;
    }

    /**
     * getDistrictId 
     * */
    public Long getDistrictId() {
        return districtId;
    }

    /**
     * setDistrictName 
     * */
    public void setDistrictName(String districtName) {
        this.districtName=districtName;
    }

    /**
     * getDistrictName 
     * */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * setCityId 
     * */
    public void setCityId(Long cityId) {
        this.cityId=cityId;
    }

    /**
     * getCityId 
     * */
    public Long getCityId() {
        return cityId;
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
     * setUpdatDate 
     * */
    public void setUpdatDate(Date updatDate) {
        this.updatDate=updatDate;
    }

    /**
     * getUpdatDate 
     * */
    public Date getUpdatDate() {
        return updatDate;
    }

    /**
     * setStartupdatDate 
     * */
    public void setStartupdatDate(String startUpdatDate) {
        this.startUpdatDate=startUpdatDate;
    }

    /**
     * getStartupdatDate 
     * */
    public String getStartupdatDate() {
        return startUpdatDate;
    }

    /**
     * setEndupdatDate 
     * */
    public void setEndupdatDate(String endUpdatDate) {
        this.endUpdatDate=endUpdatDate;
    }

    /**
     * getEndupdatDate 
     * */
    public String getEndupdatDate() {
        return endUpdatDate;
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