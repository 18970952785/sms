package com.malicn.server.domain.cmsorder;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zengdingding on 2017/7/27.
 */
@Data
public class CmsOrderInfo {
    /**
     * 订单号
     */
    public long orderId;
    /**
     * 发货地
     */
    public String startName;
    /**
     * 冷库地址
     */
    public String startAddress;
    /**
     * 收货地
     */
    public String arriveName;
    /**
     * 收货冷库地址
     */
    public String arriveAddress;
    /**
     * 总重量
     */
    public BigDecimal weight;

    /**
     * 流控中照片
     */
    public String flowControlPics;

    /**
     * 司机姓名
     */
    public String driverName;
    /**
     * 司机手机号码
     */
    public String driverMobile;
    /**
     * 车牌号
     */
    public String plateNo;
    /**
     * 司机照片
     */
    public String driverImg;
    /**
     * 车辆照片
     */
    public String vehicleImg;
    /**
     * 订单创建时间
     */
    public Date createTime;
    /*
     * 订单完成时间
     */
    private Date endTime;

}
