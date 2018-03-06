package com.malicn.server.domain.drivermatch;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


/**
 * @author qun.xu
 * @desc   车辆匹配
 */
@Data
public  class DriverMatch {


    public static final String WALK_ORDER_LINK="肖俏";


    private Long id;
    private Long orderId;
    private String userName;
    private String userMobile;
    private Long carrierId;
    private String carrierMobile;
    private String carrierName;
    private Long driverId;
    private String driverMobile;
    private String driverName;
    private String pltateNo;
    private Long vehicleId;
    private Byte vhcleType;
    private BigDecimal length;
    private BigDecimal minTmp;
    private Integer startId;
    private String startName;
    private Integer arriveId;
    private String arriveName;
    private BigDecimal ratedWght;
    private String result;
    private String comment;
    private BigDecimal ownerFrght;
    private BigDecimal totalOwnerPrice;
    private BigDecimal carriFrght;
    private BigDecimal totalCarriPrice;
    private Date arrivalDate;
    private String creator;
    private Date createTime;
    private String updater;
    private Date updateTime;
    private Byte isLock;
    private Byte isDelete;
    private String logComName;
    private String logComContact;
    private String logComConTel;






    
    



}
