package com.malicn.server.support.vip;

import com.malicn.server.enums.vip.VipName;

import java.math.BigDecimal;

/**
 * Created by yanghuoyun on 2017/7/10.
 */
public class DriverVip extends Vip {


    public static BigDecimal PRICE = new BigDecimal(500.00);

    public static Integer DAY = 90;

    public static Integer ID = 2;

    public static String TITLE_TEXT = "超级马力司机500元/3个月";

    public static String NAME = VipName.superDriver.name();


}
