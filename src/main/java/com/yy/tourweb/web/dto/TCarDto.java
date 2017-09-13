package com.yy.tourweb.web.dto;

import com.yy.tourweb.web.dto.IDto;

/**
  * 车辆表(t_car)映射Dto
  * @version 2017-09-07  * */ 
public class TCarDto implements IDto {
    /**
     * 
     * */
    private Long id;
    /**
     * 车编号
     * */
    private Integer carNo;
    /**
     * 车型
     * */
    private String carName;
    /**
     * 适合人数(1-2、3-5等)
     * */
    private String suitableNum;
    /**
     * 五环内半天价格(元)
     * */
    private Integer halfDayPrice;
    /**
     * 五环内一天价格(元)
     * */
    private Integer fullDayPrice;
    /**
     * 去慕田峪价格
     * */
    private Integer mtyPrice;
    /**
     * 去金山岭价格
     * */
    private Integer jslPrice;
    /**
     * 接送机/站价格
     * */
    private Integer transferPrice;
    /**
     * 行李个数
     * */
    private Integer suitcasesNum;
    /**
     * 随身行李个数
     * */
    private Integer carryonNum;
    /**
     * 主图id
     * */
    private Integer pid;
    /**
     * 排序字段加排序规则组合体columnName desc
     * */
    private String orderByStr;
    /**
     * setId 
     * */
    public void setId(Long id) {
        this.id=id;
    }

    /**
     * getId 
     * */
    public Long getId() {
        return id;
    }

    /**
     * setCarNo 车编号
     * */
    public void setCarNo(Integer carNo) {
        this.carNo=carNo;
    }

    /**
     * getCarNo 车编号
     * */
    public Integer getCarNo() {
        return carNo;
    }

    /**
     * setCarName 车型
     * */
    public void setCarName(String carName) {
        this.carName=carName;
    }

    /**
     * getCarName 车型
     * */
    public String getCarName() {
        return carName;
    }

    /**
     * setSuitableNum 适合人数(1-2、3-5等)
     * */
    public void setSuitableNum(String suitableNum) {
        this.suitableNum=suitableNum;
    }

    /**
     * getSuitableNum 适合人数(1-2、3-5等)
     * */
    public String getSuitableNum() {
        return suitableNum;
    }

    /**
     * setHalfDayPrice 五环内半天价格(元)
     * */
    public void setHalfDayPrice(Integer halfDayPrice) {
        this.halfDayPrice=halfDayPrice;
    }

    /**
     * getHalfDayPrice 五环内半天价格(元)
     * */
    public Integer getHalfDayPrice() {
        return halfDayPrice;
    }

    /**
     * setFullDayPrice 五环内一天价格(元)
     * */
    public void setFullDayPrice(Integer fullDayPrice) {
        this.fullDayPrice=fullDayPrice;
    }

    /**
     * getFullDayPrice 五环内一天价格(元)
     * */
    public Integer getFullDayPrice() {
        return fullDayPrice;
    }

    /**
     * setMtyPrice 去慕田峪价格
     * */
    public void setMtyPrice(Integer mtyPrice) {
        this.mtyPrice=mtyPrice;
    }

    /**
     * getMtyPrice 去慕田峪价格
     * */
    public Integer getMtyPrice() {
        return mtyPrice;
    }

    /**
     * setJslPrice 去金山岭价格
     * */
    public void setJslPrice(Integer jslPrice) {
        this.jslPrice=jslPrice;
    }

    /**
     * getJslPrice 去金山岭价格
     * */
    public Integer getJslPrice() {
        return jslPrice;
    }

    /**
     * setTransferPrice 接送机/站价格
     * */
    public void setTransferPrice(Integer transferPrice) {
        this.transferPrice=transferPrice;
    }

    /**
     * getTransferPrice 接送机/站价格
     * */
    public Integer getTransferPrice() {
        return transferPrice;
    }

    /**
     * setSuitcasesNum 行李个数
     * */
    public void setSuitcasesNum(Integer suitcasesNum) {
        this.suitcasesNum=suitcasesNum;
    }

    /**
     * getSuitcasesNum 行李个数
     * */
    public Integer getSuitcasesNum() {
        return suitcasesNum;
    }

    /**
     * setCarryonNum 随身行李个数
     * */
    public void setCarryonNum(Integer carryonNum) {
        this.carryonNum=carryonNum;
    }

    /**
     * getCarryonNum 随身行李个数
     * */
    public Integer getCarryonNum() {
        return carryonNum;
    }

    /**
     * setPid 主图id
     * */
    public void setPid(Integer pid) {
        this.pid=pid;
    }

    /**
     * getPid 主图id
     * */
    public Integer getPid() {
        return pid;
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