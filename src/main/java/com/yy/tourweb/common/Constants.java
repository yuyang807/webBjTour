package com.yy.tourweb.common;

import com.yy.tourweb.util.PropertiesUtil;



public class Constants {
    
    /**
     * 首页推荐线路list
     */
    public static final String REDIS_LINE_MAIN = "tour.line.main";
    
    /**
     * 所有线路列表
     */
    public static final String REDIS_LINE_ALL = "tour.line.all";
    
    /**
     * 首页轮播图片地址
     */
    public static final String REDIS_PIC_MAIN = "tour.pic.main";
    
    /**
     * 线路编号
     * */
    public static final String REDIS_LINE_ID = "tour.line.";
    
    /**
     * 线路所含附加项
     */
    public static final String REDIS_LINE_ADD = "tour.line.add.";
    
    /**
     * 线路不含的附加项
     */
    public static final String REDIS_LINE_UN_ADD = "tour.line.unAdd.";
    
    /**
     * 客户端IP前缀
     */
    public static final String REDIS_CLINET_IP = "cip.";
    
    /**
     * 缓存线路有效时间
     */
    public static final long LINE_EXPIRED_TIME = Long.parseLong(PropertiesUtil.getValue("application","line.expired.time"));
    
    /**
     * 缓存轮播图片地址有效时间
     */
    public static final long MAINPIC_EXPIRED_TIME = Long.parseLong(PropertiesUtil.getValue("application","mainPic.expired.time"));

	public static final String WARN_EMAIL = PropertiesUtil.getValue("application", "warn.email");
    
    
    
}
