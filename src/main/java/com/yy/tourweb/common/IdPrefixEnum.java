package com.yy.tourweb.common;


/**
 * 编号前缀
 *
 * @author yy
 * @since 2017-10-22
 */
public enum IdPrefixEnum {

    ID_PREFIX_LINE("10"),
    ID_PREFIX_PIC("20"),
    ID_PREFIX_CAR("30"),
    ID_PREFIX_SHOW("40"),
    ID_PREFIX_ADDITION("50"),
    ID_PREFIX_LINEKIND("60"),
    ID_PREFIX_GUIDE("70"),
    ID_PREFIX_MEMBER("80"),
    ID_PREFIX_CARKIND("90"),
    ID_PREFIX_CARKIND_SERVICE("11");

    private String code;

    IdPrefixEnum(String code) {
        this.code = code;
    }
    
    public static IdPrefixEnum getEnum(String code) {
        for (IdPrefixEnum e : IdPrefixEnum.values()) {
            if (code.equals(e.getCode() + "")) {
                return e;
            }
        }
        return null;
    }

	public String getCode() {
		return code;
	}

}

