package com.malicn.server.enums.sys;

/**
 * 系统类别
 *
 * @author WangYang
 * @version 1.0
 * @datetime 2015/11/9 10:38
 */
public enum CompareEnums {

    equal("=="),
    gt(">"),
    gte(">="),
    lt("<"),
    lte("<=");

    private String value;

    CompareEnums(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static CompareEnums get(String value) {
        if(value==null){
            return null;
        }
        for (CompareEnums item : values()) {
            if (value.toLowerCase().equals(item.getValue())) {
                return item;
            }
        }
        return null;
    }
}