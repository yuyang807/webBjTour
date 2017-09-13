package com.yy.tourweb.web.dto;


/**
  * 银行基础信息(sys_bank_info)映射Dto
  * @version 2017-02-15 10:52:10
  * */ 
public class SysBankInfoDto implements IDto {
    /**
     * id
     * */
    private Long id;
    /**
     * 银行名称
     * */
    private String bankName;
    /**
     * 银行编码
     * */
    private Long bankCode;
    /**
     * 分支名称
     * */
    private String branchName;
    /**
     * 状态
     * */
    private Integer status;
    /**
     * 省份编码
     * */
    private Integer provinceCode;
    /**
     * 省名称
     * */
    private String provinceName;
    /**
     * 城市编码
     * */
    private Integer cityCode;
    /**
     * 城市名称
     * */
    private String cityName;
    /**
     * 排序字段加排序规则组合体columnName desc
     * */
    private String orderByStr;
    /**
     * setId id
     * */
    public void setId(Long id) {
        this.id=id;
    }

    /**
     * getId id
     * */
    public Long getId() {
        return id;
    }

    /**
     * setBankName 银行名称
     * */
    public void setBankName(String bankName) {
        this.bankName=bankName;
    }

    /**
     * getBankName 银行名称
     * */
    public String getBankName() {
        return bankName;
    }

    /**
     * setBankCode 银行编码
     * */
    public void setBankCode(Long bankCode) {
        this.bankCode=bankCode;
    }

    /**
     * getBankCode 银行编码
     * */
    public Long getBankCode() {
        return bankCode;
    }

    /**
     * setBranchName 分支名称
     * */
    public void setBranchName(String branchName) {
        this.branchName=branchName;
    }

    /**
     * getBranchName 分支名称
     * */
    public String getBranchName() {
        return branchName;
    }

    /**
     * setStatus 状态
     * */
    public void setStatus(Integer status) {
        this.status=status;
    }

    /**
     * getStatus 状态
     * */
    public Integer getStatus() {
        return status;
    }

    /**
     * setProvinceCode 省份编码
     * */
    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode=provinceCode;
    }

    /**
     * getProvinceCode 省份编码
     * */
    public Integer getProvinceCode() {
        return provinceCode;
    }

    /**
     * setProvinceName 省名称
     * */
    public void setProvinceName(String provinceName) {
        this.provinceName=provinceName;
    }

    /**
     * getProvinceName 省名称
     * */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * setCityCode 城市编码
     * */
    public void setCityCode(Integer cityCode) {
        this.cityCode=cityCode;
    }

    /**
     * getCityCode 城市编码
     * */
    public Integer getCityCode() {
        return cityCode;
    }

    /**
     * setCityName 城市名称
     * */
    public void setCityName(String cityName) {
        this.cityName=cityName;
    }

    /**
     * getCityName 城市名称
     * */
    public String getCityName() {
        return cityName;
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