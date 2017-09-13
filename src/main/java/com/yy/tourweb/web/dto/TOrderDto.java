package com.yy.tourweb.web.dto;

import java.util.Date;
import com.yy.tourweb.web.dto.IDto;

/**
  * 订单表(t_order)映射Dto
  * @version 2017-09-11  * */ 
public class TOrderDto implements IDto {
    /**
     * 线路编号
     * */
    private Long id;
    /**
     * 总价
     * */
    private Integer totalPrice;
    /**
     * 成人价格
     * */
    private Integer adultNum;
    /**
     * cut10%的儿童个数
     * */
    private Integer teenagerNum;
    /**
     * cut20%儿童价格
     * */
    private Integer childNum;
    /**
     * 免费儿童价格
     * */
    private Integer babyNum;
    /**
     * 线路编号
     * */
    private Integer lineNo;
    /**
     * 线路总价钱
     * */
    private Integer linePrice;
    /**
     * 演出编号
     * */
    private Integer showNo;
    /**
     * 演出总价钱
     * */
    private Integer showPrice;
    /**
     * 车编号
     * */
    private Integer carNo;
    /**
     * 车总价格
     * */
    private Integer carPrice;
    /**
     * 车服务的天数(当选择半天则为空)
     * */
    private Integer carDay;
    /**
     * 导游服务编号
     * */
    private Integer guideNo;
    /**
     * 导游服务总价格
     * */
    private Integer guidPrice;
    /**
     * 导游服务天数(当选择半天导游服务，则为null)
     * */
    private Integer guideDay;
    /**
     * 订单状态(1:创建待确认;2:已确认待服务;3:已服务;4:已拒绝)
     * */
    private Integer orderStatus;
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
     * 修改时间
     * */
    private Date updateDate;
    /**
     * 范围查询修改时间使用
     * */
    private Date startUpdateDate;
    /**
     * 范围查询修改时间使用
     * */
    private Date endUpdateDate;
    /**
     * 排序字段加排序规则组合体columnName desc
     * */
    private String orderByStr;
    /**
     * setId 线路编号
     * */
    public void setId(Long id) {
        this.id=id;
    }

    /**
     * getId 线路编号
     * */
    public Long getId() {
        return id;
    }

    /**
     * setTotalPrice 总价
     * */
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice=totalPrice;
    }

    /**
     * getTotalPrice 总价
     * */
    public Integer getTotalPrice() {
        return totalPrice;
    }

    /**
     * setAdultNum 成人价格
     * */
    public void setAdultNum(Integer adultNum) {
        this.adultNum=adultNum;
    }

    /**
     * getAdultNum 成人价格
     * */
    public Integer getAdultNum() {
        return adultNum;
    }

    /**
     * setTeenagerNum cut10%的儿童个数
     * */
    public void setTeenagerNum(Integer teenagerNum) {
        this.teenagerNum=teenagerNum;
    }

    /**
     * getTeenagerNum cut10%的儿童个数
     * */
    public Integer getTeenagerNum() {
        return teenagerNum;
    }

    /**
     * setChildNum cut20%儿童价格
     * */
    public void setChildNum(Integer childNum) {
        this.childNum=childNum;
    }

    /**
     * getChildNum cut20%儿童价格
     * */
    public Integer getChildNum() {
        return childNum;
    }

    /**
     * setBabyNum 免费儿童价格
     * */
    public void setBabyNum(Integer babyNum) {
        this.babyNum=babyNum;
    }

    /**
     * getBabyNum 免费儿童价格
     * */
    public Integer getBabyNum() {
        return babyNum;
    }

    /**
     * setLineNo 线路编号
     * */
    public void setLineNo(Integer lineNo) {
        this.lineNo=lineNo;
    }

    /**
     * getLineNo 线路编号
     * */
    public Integer getLineNo() {
        return lineNo;
    }

    /**
     * setLinePrice 线路总价钱
     * */
    public void setLinePrice(Integer linePrice) {
        this.linePrice=linePrice;
    }

    /**
     * getLinePrice 线路总价钱
     * */
    public Integer getLinePrice() {
        return linePrice;
    }

    /**
     * setShowNo 演出编号
     * */
    public void setShowNo(Integer showNo) {
        this.showNo=showNo;
    }

    /**
     * getShowNo 演出编号
     * */
    public Integer getShowNo() {
        return showNo;
    }

    /**
     * setShowPrice 演出总价钱
     * */
    public void setShowPrice(Integer showPrice) {
        this.showPrice=showPrice;
    }

    /**
     * getShowPrice 演出总价钱
     * */
    public Integer getShowPrice() {
        return showPrice;
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
     * setCarPrice 车总价格
     * */
    public void setCarPrice(Integer carPrice) {
        this.carPrice=carPrice;
    }

    /**
     * getCarPrice 车总价格
     * */
    public Integer getCarPrice() {
        return carPrice;
    }

    /**
     * setCarDay 车服务的天数(当选择半天则为空)
     * */
    public void setCarDay(Integer carDay) {
        this.carDay=carDay;
    }

    /**
     * getCarDay 车服务的天数(当选择半天则为空)
     * */
    public Integer getCarDay() {
        return carDay;
    }

    /**
     * setGuideNo 导游服务编号
     * */
    public void setGuideNo(Integer guideNo) {
        this.guideNo=guideNo;
    }

    /**
     * getGuideNo 导游服务编号
     * */
    public Integer getGuideNo() {
        return guideNo;
    }

    /**
     * setGuidPrice 导游服务总价格
     * */
    public void setGuidPrice(Integer guidPrice) {
        this.guidPrice=guidPrice;
    }

    /**
     * getGuidPrice 导游服务总价格
     * */
    public Integer getGuidPrice() {
        return guidPrice;
    }

    /**
     * setGuideDay 导游服务天数(当选择半天导游服务，则为null)
     * */
    public void setGuideDay(Integer guideDay) {
        this.guideDay=guideDay;
    }

    /**
     * getGuideDay 导游服务天数(当选择半天导游服务，则为null)
     * */
    public Integer getGuideDay() {
        return guideDay;
    }

    /**
     * setOrderStatus 订单状态(1:创建待确认;2:已确认待服务;3:已服务;4:已拒绝)
     * */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus=orderStatus;
    }

    /**
     * getOrderStatus 订单状态(1:创建待确认;2:已确认待服务;3:已服务;4:已拒绝)
     * */
    public Integer getOrderStatus() {
        return orderStatus;
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
     * setUpdateDate 修改时间
     * */
    public void setUpdateDate(Date updateDate) {
        this.updateDate=updateDate;
    }

    /**
     * getUpdateDate 修改时间
     * */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * setStartupdateDate 修改时间
     * */
    public void setStartupdateDate(Date startUpdateDate) {
        this.startUpdateDate=startUpdateDate;
    }

    /**
     * getStartupdateDate 修改时间
     * */
    public Date getStartupdateDate() {
        return startUpdateDate;
    }

    /**
     * setEndupdateDate 修改时间
     * */
    public void setEndupdateDate(Date endUpdateDate) {
        this.endUpdateDate=endUpdateDate;
    }

    /**
     * getEndupdateDate 修改时间
     * */
    public Date getEndupdateDate() {
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