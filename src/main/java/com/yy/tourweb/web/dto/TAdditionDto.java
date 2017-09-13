package com.yy.tourweb.web.dto;

import com.yy.tourweb.web.dto.IDto;

/**
  * 线路产品附加项表(t_addition)映射Dto
  * @version 2017-09-11  * */ 
public class TAdditionDto implements IDto {
    /**
     * 
     * */
    private Long id;
    /**
     * 附加项编号
     * */
    private Integer addNo;
    /**
     * 附加项内容
     * */
    private String addValue;
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
     * setAddNo 附加项编号
     * */
    public void setAddNo(Integer addNo) {
        this.addNo=addNo;
    }

    /**
     * getAddNo 附加项编号
     * */
    public Integer getAddNo() {
        return addNo;
    }

    /**
     * setAddValue 附加项内容
     * */
    public void setAddValue(String addValue) {
        this.addValue=addValue;
    }

    /**
     * getAddValue 附加项内容
     * */
    public String getAddValue() {
        return addValue;
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