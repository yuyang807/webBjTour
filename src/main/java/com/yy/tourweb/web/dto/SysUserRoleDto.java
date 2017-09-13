package com.yy.tourweb.web.dto;

import com.yy.tourweb.web.dto.IDto;

/**
  * 用户-角色(sys_user_role)映射Dto
  * @version 2017-09-07  * */ 
public class SysUserRoleDto implements IDto {
    /**
     * 用户编号
     * */
    private String userId;
    /**
     * 角色编号
     * */
    private String roleId;
    /**
     * 排序字段加排序规则组合体columnName desc
     * */
    private String orderByStr;
    /**
     * setUserId 用户编号
     * */
    public void setUserId(String userId) {
        this.userId=userId;
    }

    /**
     * getUserId 用户编号
     * */
    public String getUserId() {
        return userId;
    }

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
     * 排序字段加排序规则组合体columnName desc
     * */
    public void setOrderByStr(String orderByStr) {
        this.orderByStr=orderByStr;
    }

    public String getOrderByStr() {
        return orderByStr;
    }

}