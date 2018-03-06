package com.malicn.server.domain.cloudStorage;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author xieqiujin
 * @date 2017/10/24
 */
@Data
public class CloudStorage extends BasePo{

    public static final byte WRZ = 0;   //未认证
    public static final byte YRZ = 1;   //已认证

    public static final byte LCK = 1;   //冷藏库
    public static final byte LDK = 2;   //冷冻库
    public static final byte QDK = 3;   //气调库

    private Long id;

    private String companyName;

    private String storageName;

    private Integer cityId;

    private String cityName;

    private Date storageCreateTime;

    private String storageAddress;

    private Byte billingMode;

    private BigDecimal refPriceMin;

    private BigDecimal refPriceMax;

    private String applicant;

    private String applicantContact;

    private String applicantConTel;

    private Byte trafficSetting;

    private Byte trafficDistance;

    private Byte mainEntrWidth;

    private Byte aisleWidth;

    private Byte parkWall;

    private Byte isAccessCon;

    private BigDecimal adPrice;


    private String securityTerm;

    private Byte isWorkspace;

    private Byte isFrozenMarket;

    private Byte edificeType;

    private String storageFunc;

    private Byte storageTemp;

    private Byte cryogenMode;

    private BigDecimal storageCapacity;

    private BigDecimal conArea;

    private Byte highLevel;

    private Byte storageHigh;

    private Byte platform;

    private Byte siteWidth;

    private Byte parking;

    private Integer holeCount;

    private Byte isChargePillar;

    private Integer chargeCount;

    private Byte isFireFiling;

    private String fireSystem;

    private Byte propertyManage;

    private String storageComName;

//    2018年1月3日13:57:44  zdd
    private BigDecimal loadingFee;

    private BigDecimal scanCodeFee;

    private BigDecimal colorSepFee;
    //管理费
    private String manageFee;

    private Byte isAuth;

    private Integer creator;

    private String frontImg;

    public static Boolean convertIsAuth(byte isAuth) {
        Boolean isAuthBoolean = false;
        switch (isAuth) {
            case YRZ:
                isAuthBoolean = true;
                break;
        }
        return isAuthBoolean;
    }

    public static String convertStorageFunc(byte storageFunc) {
        String storageFuncStr = "";
        switch (storageFunc) {
            case LCK:
                storageFuncStr = "冷藏库";
                break;
            case LDK:
                storageFuncStr = "冷冻库";
                break;
            case QDK:
                storageFuncStr = "气调库";
                break;
        }
        return storageFuncStr;
    }
}
