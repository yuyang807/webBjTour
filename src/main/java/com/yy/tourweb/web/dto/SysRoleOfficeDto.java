package com.yy.tourweb.web.dto;

import com.yy.tourweb.web.dto.IDto;

/**
  * 角色-机构(sys_role_office)映射Dto
  * @version 2017-09-07  * */ 
public class SysRoleOfficeDto implements IDto {
    /**
     * 角色编号
     * */
    private String roleId;
    /**
     * 机构编号
     * */
    private String officeId;
    /**
     * 排序字段加排序规则组合体columnName desc
     * */
    private String orderByStr;
    /**
     * setRoleId 角色编号
     * */
    public void setRoleId(String roleId) {
        this.roleId=roleId;
    }

    /**
     * getRoleId 角色编号
     * */
    public String getRoleId() {
        return roleId;
    }

    /**
     * setOfficeId 机构编号
     * */
    public void setOfficeId(String officeId) {
        this.officeId=officeId;
    }

    /**
     * getOfficeId 机构编号
     * */
    public String getOfficeId() {
        return officeId;
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