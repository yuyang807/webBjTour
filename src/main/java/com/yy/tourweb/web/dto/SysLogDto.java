package com.yy.tourweb.web.dto;

import java.util.Date;

/**
  * 日志表(sys_log)映射Dto
  * @version 2017-02-15 10:52:10
  * */ 
public class SysLogDto implements IDto {
    /**
     * 编号
     * */
    private String id;
    /**
     * 日志类型
     * */
    private String type;
    /**
     * 日志标题
     * */
    private String title;
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
    private String startCreateDate;
    /**
     * 范围查询创建时间使用
     * */
    private String endCreateDate;
    /**
     * 操作ip地址
     * */
    private String remoteAddr;
    /**
     * 用户代理
     * */
    private String userAgent;
    /**
     * 请求uri
     * */
    private String requestUri;
    /**
     * 操作方式
     * */
    private String method;
    /**
     * 操作提交的数据
     * */
    private String params;
    /**
     * 异常信息
     * */
    private String exception;
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
     * setType 日志类型
     * */
    public void setType(String type) {
        this.type=type;
    }

    /**
     * getType 日志类型
     * */
    public String getType() {
        return type;
    }

    /**
     * setTitle 日志标题
     * */
    public void setTitle(String title) {
        this.title=title;
    }

    /**
     * getTitle 日志标题
     * */
    public String getTitle() {
        return title;
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
    public void setStartcreateDate(String startCreateDate) {
        this.startCreateDate=startCreateDate;
    }

    /**
     * getStartcreateDate 创建时间
     * */
    public String getStartcreateDate() {
        return startCreateDate;
    }

    /**
     * setEndcreateDate 创建时间
     * */
    public void setEndcreateDate(String endCreateDate) {
        this.endCreateDate=endCreateDate;
    }

    /**
     * getEndcreateDate 创建时间
     * */
    public String getEndcreateDate() {
        return endCreateDate;
    }

    /**
     * setRemoteAddr 操作ip地址
     * */
    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr=remoteAddr;
    }

    /**
     * getRemoteAddr 操作ip地址
     * */
    public String getRemoteAddr() {
        return remoteAddr;
    }

    /**
     * setUserAgent 用户代理
     * */
    public void setUserAgent(String userAgent) {
        this.userAgent=userAgent;
    }

    /**
     * getUserAgent 用户代理
     * */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * setRequestUri 请求uri
     * */
    public void setRequestUri(String requestUri) {
        this.requestUri=requestUri;
    }

    /**
     * getRequestUri 请求uri
     * */
    public String getRequestUri() {
        return requestUri;
    }

    /**
     * setMethod 操作方式
     * */
    public void setMethod(String method) {
        this.method=method;
    }

    /**
     * getMethod 操作方式
     * */
    public String getMethod() {
        return method;
    }

    /**
     * setParams 操作提交的数据
     * */
    public void setParams(String params) {
        this.params=params;
    }

    /**
     * getParams 操作提交的数据
     * */
    public String getParams() {
        return params;
    }

    /**
     * setException 异常信息
     * */
    public void setException(String exception) {
        this.exception=exception;
    }

    /**
     * getException 异常信息
     * */
    public String getException() {
        return exception;
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