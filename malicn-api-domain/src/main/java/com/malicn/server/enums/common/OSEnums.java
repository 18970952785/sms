package com.malicn.server.enums.common;

/**
 * 系统类别
 *
 * @author WangYang
 * @version 1.0
 * @datetime 2015/11/9 10:38
 */
public enum OSEnums {

    ANDROID(0,"android"),
    IOS(1,"ios");

    private Integer code;
    private String value;

        OSEnums(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static OSEnums get(Integer code) {
        for (OSEnums item : values()) {
            if (code.intValue() == item.getCode().intValue()) {
                return item;
            }
        }
        return null;
    }

    public static OSEnums get(String value) {
        for (OSEnums item : values()) {
            if (value.toLowerCase().equals(item.getValue())) {
                return item;
            }
        }
        return null;
    }

}
