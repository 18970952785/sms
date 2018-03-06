package com.malicn.server.enums.vehicle;

/**
 * Created by xieqiujin on 2017/5/26.
 */
public enum  VehicleType {
    cold(1, "冷藏车"),
    common(2, "普通车");

    private Integer code;
    private String value;

    VehicleType(Integer code, String value){
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

    public static VehicleType get(Integer code) {
        for (VehicleType item : values()) {
            if (code.intValue() == item.getCode().intValue()) {
                return item;
            }
        }
        return null;
    }

    public static VehicleType get(String value) {
        for (VehicleType item : values()) {
            if (value.toLowerCase().equals(item.getValue())) {
                return item;
            }
        }
        return null;
    }
}
