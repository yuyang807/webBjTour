package com.yy.tourweb.common;



/**
 * 连锁性质 0:非连锁商户 1:连锁商户
 * @author yanghj
 * @since 2016-03-19
 */
public enum ChainTypeEnum{
    
    /**
     * 非连锁商户
     * */
    CHAIN_TYPE_0(0,"非连锁商户"), 
    /**
     * 连锁商户
     * */
    CHAIN_TYPE_1(1,"连锁商户"); 
    
    private final int code;
    private final String desc;
    
    ChainTypeEnum(int code, String desc) {
       this.code = code;
       this.desc = desc;
   }
   
   public int getCode() {
       return code;
   }
   
   public String getDesc(){
       return desc;
   }
   
   public static ChainTypeEnum getEnum(int code) {
       for(ChainTypeEnum e : ChainTypeEnum.values()) {
           if (code == e.getCode()) {
               return e;
           }
       }
       return null;
   }
 
}

