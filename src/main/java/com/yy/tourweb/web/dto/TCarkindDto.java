package com.yy.tourweb.web.dto;

import com.yy.tourweb.web.dto.IDto;

/**
  * 车类型表(t_carkind)映射Dto
  * @version 2017-09-16  * */ 
public class TCarkindDto implements IDto {
    /**
     * 
     * */
    private Long id;
    /**
     * 车类型编号
     * */
    private Integer carTypeNo;
    /**
     * 车类型(适用几人)
     * */
    private String carTypeName;
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
     * setCarTypeNo 车类型编号
     * */
    public void setCarTypeNo(Integer carTypeNo) {
        this.carTypeNo=carTypeNo;
    }

    /**
     * getCarTypeNo 车类型编号
     * */
    public Integer getCarTypeNo() {
        return carTypeNo;
    }

    /**
     * setCarTypeName 车类型(适用几人)
     * */
    public void setCarTypeName(String carTypeName) {
        this.carTypeName=carTypeName;
    }

    /**
     * getCarTypeName 车类型(适用几人)
     * */
    public String getCarTypeName() {
        return carTypeName;
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
     * 排序字段加排序规则组合体columnName desc
     * */
    public void setOrderByStr(String orderByStr) {
        this.orderByStr=orderByStr;
    }

    public String getOrderByStr() {
        return orderByStr;
    }

}