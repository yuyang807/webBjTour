package com.yy.tourweb.web.dto;

import com.yy.tourweb.web.dto.IDto;

/**
  * 图片表(t_pic)映射Dto
  * @version 2017-09-10  * */ 
public class TPicDto implements IDto {
    /**
     * 
     * */
    private Long id;
    /**
     * 线路编号
     * */
    private Integer lineNo;
    /**
     * 文件路径
     * */
    private String fileUrl;
    /**
     * 文件md5值
     * */
    private String md5;
    /**
     * 是否为主图(0:否；1:是)
     * */
    private Integer isMain;
    /**
     * 主页轮播图
     * */
    private Integer isMainAll;
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
     * setFileUrl 文件路径
     * */
    public void setFileUrl(String fileUrl) {
        this.fileUrl=fileUrl;
    }

    /**
     * getFileUrl 文件路径
     * */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * setMd5 文件md5值
     * */
    public void setMd5(String md5) {
        this.md5=md5;
    }

    /**
     * getMd5 文件md5值
     * */
    public String getMd5() {
        return md5;
    }

    /**
     * setIsMain 是否为主图(0:否；1:是)
     * */
    public void setIsMain(Integer isMain) {
        this.isMain=isMain;
    }

    /**
     * getIsMain 是否为主图(0:否；1:是)
     * */
    public Integer getIsMain() {
        return isMain;
    }

    /**
     * setIsMainAll 主页轮播图
     * */
    public void setIsMainAll(Integer isMainAll) {
        this.isMainAll=isMainAll;
    }

    /**
     * getIsMainAll 主页轮播图
     * */
    public Integer getIsMainAll() {
        return isMainAll;
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