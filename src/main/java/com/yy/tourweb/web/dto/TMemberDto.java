package com.yy.tourweb.web.dto;

import java.util.Date;

import com.yy.tourweb.web.dto.IDto;

/**
  * 用户表(t_member)映射Dto
  * @version 2017-09-16  * */ 
public class TMemberDto implements IDto {
    /**
     * 
     * */
    private Long id;
    /**
     * 会员编号
     * */
    private Integer memberNo;
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
     * 
     * */
    private String passportNum;
    /**
     * 电话
     * */
    private String phoneNum;
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
    
    private Date createDate;
    
    private Date updateDate;
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

    /**
     * setPassportNum 
     * */
    public void setPassportNum(String passportNum) {
        this.passportNum=passportNum;
    }

    /**
     * getPassportNum 
     * */
    public String getPassportNum() {
        return passportNum;
    }

    /**
     * setPhoneNum 电话
     * */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum=phoneNum;
    }

    /**
     * getPhoneNum 电话
     * */
    public String getPhoneNum() {
        return phoneNum;
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
     * 排序字段加排序规则组合体columnName desc
     * */
    public void setOrderByStr(String orderByStr) {
        this.orderByStr=orderByStr;
    }

    public String getOrderByStr() {
        return orderByStr;
    }

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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

}