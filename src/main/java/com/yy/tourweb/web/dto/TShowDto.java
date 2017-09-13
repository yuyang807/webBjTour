package com.yy.tourweb.web.dto;

import com.yy.tourweb.web.dto.IDto;

/**
  * 节目单价表(t_show)映射Dto
  * @version 2017-09-07  * */ 
public class TShowDto implements IDto {
    /**
     * 
     * */
    private Long id;
    /**
     * 节目编号
     * */
    private Integer showNo;
    /**
     * 节目名称
     * */
    private String showName;
    /**
     * 座位
     * */
    private String rows;
    /**
     * 价格
     * */
    private Integer showPrice;
    /**
     * 备注
     * */
    private String remark;
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
     * setShowNo 节目编号
     * */
    public void setShowNo(Integer showNo) {
        this.showNo=showNo;
    }

    /**
     * getShowNo 节目编号
     * */
    public Integer getShowNo() {
        return showNo;
    }

    /**
     * setShowName 节目名称
     * */
    public void setShowName(String showName) {
        this.showName=showName;
    }

    /**
     * getShowName 节目名称
     * */
    public String getShowName() {
        return showName;
    }

    /**
     * setRows 座位
     * */
    public void setRows(String rows) {
        this.rows=rows;
    }

    /**
     * getRows 座位
     * */
    public String getRows() {
        return rows;
    }

    /**
     * setShowPrice 价格
     * */
    public void setShowPrice(Integer showPrice) {
        this.showPrice=showPrice;
    }

    /**
     * getShowPrice 价格
     * */
    public Integer getShowPrice() {
        return showPrice;
    }

    /**
     * setRemark 备注
     * */
    public void setRemark(String remark) {
        this.remark=remark;
    }

    /**
     * getRemark 备注
     * */
    public String getRemark() {
        return remark;
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