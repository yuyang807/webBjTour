package com.yy.tourweb.web.dto;

import java.util.Date;

import com.yy.tourweb.web.dto.IDto;

/**
  * 留言表(t_advice)映射Dto
  * @version 2017-09-07  * */ 
public class TAdviceDto implements IDto {
    /**
     * 主键
     * */
    private Long id;
    /**
     * 邮箱地址
     * */
    private String emailAddress;
    /**
     * first name
     * */
    private String fName;
    /**
     * last name
     * */
    private String lName;
    /**
     * 咨询内容
     * */
    private String content;
    /**
     * ip地址第一位
     * */
    private Integer ip1;
    /**
     * ip地址第二位
     * */
    private Integer ip2;
    /**
     * ip地址第三位
     * */
    private Integer ip3;
    /**
     * ip地址第四位
     * */
    private Integer ip4;
    /**
     * 是否发送邮件通知（0:未发送，1:已发送）
     * */
    private Integer isInform;
    
    private Date createDate;
    
    private Date updateDate;
    
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
     * 关联线路id
     * */
    private Long lid;
    /**
     * 排序字段加排序规则组合体columnName desc
     * */
    private String orderByStr;
    /**
     * setId 主键
     * */
    public void setId(Long id) {
        this.id=id;
    }

    /**
     * getId 主键
     * */
    public Long getId() {
        return id;
    }

    /**
     * setEmailAddress 邮箱地址
     * */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress=emailAddress;
    }

    /**
     * getEmailAddress 邮箱地址
     * */
    public String getEmailAddress() {
        return emailAddress;
    }

    public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
     * setContent 咨询内容
     * */
    public void setContent(String content) {
        this.content=content;
    }

    /**
     * getContent 咨询内容
     * */
    public String getContent() {
        return content;
    }

    /**
     * setIp1 ip地址第一位
     * */
    public void setIp1(Integer ip1) {
        this.ip1=ip1;
    }

    /**
     * getIp1 ip地址第一位
     * */
    public Integer getIp1() {
        return ip1;
    }

    /**
     * setIp2 ip地址第二位
     * */
    public void setIp2(Integer ip2) {
        this.ip2=ip2;
    }

    /**
     * getIp2 ip地址第二位
     * */
    public Integer getIp2() {
        return ip2;
    }

    /**
     * setIp3 ip地址第三位
     * */
    public void setIp3(Integer ip3) {
        this.ip3=ip3;
    }

    /**
     * getIp3 ip地址第三位
     * */
    public Integer getIp3() {
        return ip3;
    }

    /**
     * setIp4 ip地址第四位
     * */
    public void setIp4(Integer ip4) {
        this.ip4=ip4;
    }

    /**
     * getIp4 ip地址第四位
     * */
    public Integer getIp4() {
        return ip4;
    }

    /**
     * setIsInform 是否发送邮件通知（0:未发送，1:已发送）
     * */
    public void setIsInform(Integer isInform) {
        this.isInform=isInform;
    }

    /**
     * getIsInform 是否发送邮件通知（0:未发送，1:已发送）
     * */
    public Integer getIsInform() {
        return isInform;
    }

    /**
     * setLid 关联线路id
     * */
    public void setLid(Long lid) {
        this.lid=lid;
    }

    /**
     * getLid 关联线路id
     * */
    public Long getLid() {
        return lid;
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