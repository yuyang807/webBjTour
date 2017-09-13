package com.yy.tourweb.web.dto;

import com.yy.tourweb.web.dto.IDto;

/**
  * 角色-菜单(sys_role_menu)映射Dto
  * @version 2017-09-07  * */ 
public class SysRoleMenuDto implements IDto {
    /**
     * 角色编号
     * */
    private String roleId;
    /**
     * 菜单编号
     * */
    private String menuId;
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
     * setMenuId 菜单编号
     * */
    public void setMenuId(String menuId) {
        this.menuId=menuId;
    }

    /**
     * getMenuId 菜单编号
     * */
    public String getMenuId() {
        return menuId;
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