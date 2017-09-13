package com.yy.tourweb.common;


/**
 * 移动支付类型枚举（生成二维码用）
 *
 * @author yanghj
 * @since 2016-01-08
 */
public enum SquarePayTypeEnum {
    PAY_TYPE_POS_DAY_1("1", "pos收单T+1"),
    PAY_TYPE_ALIPAY("2", "支付宝"),
    PAY_TYPE_WECHAT("3", "微信"),
    PAY_TYPE_QBLIFE("4", "钱包生活");

    private final String code;
    private final String desc;

    SquarePayTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static SquarePayTypeEnum getEnum(String code) {
        for (SquarePayTypeEnum e : SquarePayTypeEnum.values()) {
            if (code.equals(e.getCode())) {
                return e;
            }
        }
        return null;
    }
}

