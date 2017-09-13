package com.yy.tourweb.common;


/**
 * 结算模式枚举
 * @author yanghj
 * @since 2016-01-25
 */
public enum ClearTypeEnum {

    CLEAR_TYPE_1(1,"一清"),
    CLEAR_TYPE_2(2,"二清");

    private int code;
    private String desc;

    ClearTypeEnum(int code, String desc) {
       this.code = code;
       this.desc = desc;
       
   }
   
   public int getCode() {
       return code;
   }
   
   public String getDesc(){
       return desc;
   }
}

