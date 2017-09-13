package com.yy.tourweb.common;


/**
 * 交易状态枚举
 * @author yanghj
 * @since 2016-01-06
 */
public enum TradestatusEnum{
    
    TRADESTATUS_CREATE("1","创建"), 
    TRADESTATUS_SUCCESS("2","成功"), 
    TRADESTATUS_FAIL("3","失败"), 
    TRADESTATUS_CANCEL("4","撤销"),
    TRADESTATUS_DEALING("5","处理中"),
    TRADESTATUS_CHONGZHENG("6","已冲正"),
    TRADESTATUS_CHONGZHENGFAIL("7","冲正失败"),
    TRADESTATUS_CLOSE("99","交易关闭");
    private String code;
    private String desc;
    
    TradestatusEnum(String code, String desc) {
       this.code = code;
       this.desc = desc;
   }
   
   public String getCode() {
       return code;
   }
   
   public String getDesc(){
       return desc;
   }
}

