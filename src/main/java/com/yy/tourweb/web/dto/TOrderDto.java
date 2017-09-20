package com.yy.tourweb.web.dto;

import java.util.Date;
import com.yy.tourweb.web.dto.IDto;

/**
  * 订单表(t_order)映射Dto
  * @version 2017-09-20  * */ 
public class TOrderDto implements IDto {
    /**
     * 
     * */
    private Long id;
    /**
     * 订单号
     * */
    private String orderNo;
    /**
     * 酒店名称
     * */
    private String hotelName;
    /**
     * 酒店电话
     * */
    private String hotelTel;
    /**
     * 酒店地址
     * */
    private String hotelAddress;
    /**
     * 到达日期
     * */
    private Date arrivalDate;
    /**
     * 范围查询到达日期使用
     * */
    private Date startArrivalDate;
    /**
     * 范围查询到达日期使用
     * */
    private Date endArrivalDate;
    /**
     * 到达航班号
     * */
    private String aAirplanNum;
    /**
     * 离开日期
     * */
    private Date departureDate;
    /**
     * 范围查询离开日期使用
     * */
    private Date startDepartureDate;
    /**
     * 范围查询离开日期使用
     * */
    private Date endDepartureDate;
    /**
     * 离开航班号
     * */
    private String dAirplanNum;
    /**
     * 订单开始日期
     * */
    private Date startDate;
    /**
     * 范围查询订单开始日期使用
     * */
    private Date startStartDate;
    /**
     * 范围查询订单开始日期使用
     * */
    private Date endStartDate;
    /**
     * 行程开始时间(时:分:秒)
     * */
    private String startTime;
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
     * 演出1编号
     * */
    private Integer showNo1;
    /**
     * 演出2编号
     * */
    private Integer showNo2;
    /**
     * 演出总价钱
     * */
    private Integer showPrice;
    /**
     * 接机车类型
     * */
    private Integer pickupCarTypeNo;
    /**
     * 送机车类型
     * */
    private Integer dropoffCarTypeNo;
    /**
     * 车编号
     * */
    private Integer carNo;
    /**
     * 车总价格
     * */
    private Integer carPrice;
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
     * 其他说明信息
     * */
    private String instructions;
    /**
     * 会员编号
     * */
    private Integer memberNo;
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
     * setOrderNo 订单号
     * */
    public void setOrderNo(String orderNo) {
        this.orderNo=orderNo;
    }

    /**
     * getOrderNo 订单号
     * */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * setHotelName 酒店名称
     * */
    public void setHotelName(String hotelName) {
        this.hotelName=hotelName;
    }

    /**
     * getHotelName 酒店名称
     * */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * setHotelTel 酒店电话
     * */
    public void setHotelTel(String hotelTel) {
        this.hotelTel=hotelTel;
    }

    /**
     * getHotelTel 酒店电话
     * */
    public String getHotelTel() {
        return hotelTel;
    }

    /**
     * setHotelAddress 酒店地址
     * */
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress=hotelAddress;
    }

    /**
     * getHotelAddress 酒店地址
     * */
    public String getHotelAddress() {
        return hotelAddress;
    }

    /**
     * setArrivalDate 到达日期
     * */
    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate=arrivalDate;
    }

    /**
     * getArrivalDate 到达日期
     * */
    public Date getArrivalDate() {
        return arrivalDate;
    }

    /**
     * setStartarrivalDate 到达日期
     * */
    public void setStartarrivalDate(Date startArrivalDate) {
        this.startArrivalDate=startArrivalDate;
    }

    /**
     * getStartarrivalDate 到达日期
     * */
    public Date getStartarrivalDate() {
        return startArrivalDate;
    }

    /**
     * setEndarrivalDate 到达日期
     * */
    public void setEndarrivalDate(Date endArrivalDate) {
        this.endArrivalDate=endArrivalDate;
    }

    /**
     * getEndarrivalDate 到达日期
     * */
    public Date getEndarrivalDate() {
        return endArrivalDate;
    }

    /**
     * setAAirplanNum 到达航班号
     * */
    public void setAAirplanNum(String aAirplanNum) {
        this.aAirplanNum=aAirplanNum;
    }

    /**
     * getAAirplanNum 到达航班号
     * */
    public String getAAirplanNum() {
        return aAirplanNum;
    }

    /**
     * setDepartureDate 离开日期
     * */
    public void setDepartureDate(Date departureDate) {
        this.departureDate=departureDate;
    }

    /**
     * getDepartureDate 离开日期
     * */
    public Date getDepartureDate() {
        return departureDate;
    }

    /**
     * setStartdepartureDate 离开日期
     * */
    public void setStartdepartureDate(Date startDepartureDate) {
        this.startDepartureDate=startDepartureDate;
    }

    /**
     * getStartdepartureDate 离开日期
     * */
    public Date getStartdepartureDate() {
        return startDepartureDate;
    }

    /**
     * setEnddepartureDate 离开日期
     * */
    public void setEnddepartureDate(Date endDepartureDate) {
        this.endDepartureDate=endDepartureDate;
    }

    /**
     * getEnddepartureDate 离开日期
     * */
    public Date getEnddepartureDate() {
        return endDepartureDate;
    }

    /**
     * setDAirplanNum 离开航班号
     * */
    public void setDAirplanNum(String dAirplanNum) {
        this.dAirplanNum=dAirplanNum;
    }

    /**
     * getDAirplanNum 离开航班号
     * */
    public String getDAirplanNum() {
        return dAirplanNum;
    }

    /**
     * setStartDate 订单开始日期
     * */
    public void setStartDate(Date startDate) {
        this.startDate=startDate;
    }

    /**
     * getStartDate 订单开始日期
     * */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * setStartstartDate 订单开始日期
     * */
    public void setStartstartDate(Date startStartDate) {
        this.startStartDate=startStartDate;
    }

    /**
     * getStartstartDate 订单开始日期
     * */
    public Date getStartstartDate() {
        return startStartDate;
    }

    /**
     * setEndstartDate 订单开始日期
     * */
    public void setEndstartDate(Date endStartDate) {
        this.endStartDate=endStartDate;
    }

    /**
     * getEndstartDate 订单开始日期
     * */
    public Date getEndstartDate() {
        return endStartDate;
    }

    /**
     * setStartTime 行程开始时间(时:分:秒)
     * */
    public void setStartTime(String startTime) {
        this.startTime=startTime;
    }

    /**
     * getStartTime 行程开始时间(时:分:秒)
     * */
    public String getStartTime() {
        return startTime;
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
     * setShowNo1 演出1编号
     * */
    public void setShowNo1(Integer showNo1) {
        this.showNo1=showNo1;
    }

    /**
     * getShowNo1 演出1编号
     * */
    public Integer getShowNo1() {
        return showNo1;
    }

    /**
     * setShowNo2 演出2编号
     * */
    public void setShowNo2(Integer showNo2) {
        this.showNo2=showNo2;
    }

    /**
     * getShowNo2 演出2编号
     * */
    public Integer getShowNo2() {
        return showNo2;
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
     * setPickupCarTypeNo 接机车类型
     * */
    public void setPickupCarTypeNo(Integer pickupCarTypeNo) {
        this.pickupCarTypeNo=pickupCarTypeNo;
    }

    /**
     * getPickupCarTypeNo 接机车类型
     * */
    public Integer getPickupCarTypeNo() {
        return pickupCarTypeNo;
    }

    /**
     * setDropoffCarTypeNo 送机车类型
     * */
    public void setDropoffCarTypeNo(Integer dropoffCarTypeNo) {
        this.dropoffCarTypeNo=dropoffCarTypeNo;
    }

    /**
     * getDropoffCarTypeNo 送机车类型
     * */
    public Integer getDropoffCarTypeNo() {
        return dropoffCarTypeNo;
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
     * setInstructions 其他说明信息
     * */
    public void setInstructions(String instructions) {
        this.instructions=instructions;
    }

    /**
     * getInstructions 其他说明信息
     * */
    public String getInstructions() {
        return instructions;
    }

    /**
     * setMemberNo 会员编号
     * */
    public void setMemberNo(Integer memberNo) {
        this.memberNo=memberNo;
    }

    /**
     * getMemberNo 会员编号
     * */
    public Integer getMemberNo() {
        return memberNo;
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