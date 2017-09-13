package com.yy.tourweb.common;


/**
 * 支付类型枚举
 *
 * @author yanghj
 * @since 2016-01-08
 */
public enum PayTypeEnum {

    PAY_TYPE_POS_DAY_1("1", "POS收单T+1"),
    PAY_TYPE_ALIPAY("2", "支付宝"),
    PAY_TYPE_WECHAT("3", "微信"),
    PAY_TYPE_QBLIFE("4", "钱包生活"),
    PAY_TYPE_POS_DAY_0("5", "POS收单T+0"),
    PAY_TYPE_CASH("6", "现金");

    private String code;
    private String desc;

    PayTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static PayTypeEnum getEnum(String code) {
        for (PayTypeEnum e : PayTypeEnum.values()) {
            if (code.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }
}

