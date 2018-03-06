package com.malicn.server.support.vip;

import com.malicn.server.enums.vip.VipName;

import java.math.BigDecimal;

/**
 * Created by yanghuoyun on 2017/7/10.
 */
public class OwnerVip extends Vip {

    //开通冷运管家所需金额
    public static BigDecimal PRICE = new BigDecimal(1999.00);

    //开通冷运管家有效期限 天数
    public static Integer DAY = 180;

    public static Integer ID = 1;

    public static String TITLE_TEXT = "冷运管家1999元/6个月";

    public static String NAME = VipName.manageOwner.name();

}
