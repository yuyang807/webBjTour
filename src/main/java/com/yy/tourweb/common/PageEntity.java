package com.yy.tourweb.common;

import java.io.Serializable;

public class PageEntity<T> implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * 页码
     * */
    private Integer page;
    /**
     * 页大小
     * */
    private Integer size;
    /**
     * 查询条件参数
     * */
    private T param;

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }
    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }
    public T getParam() {
        return param;
    }
    public void setParam(T param) {
        this.param = param;
    }
}
