package com.malicn.server.domain.coupon;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class Coupon extends BasePo {

    /** 抵用券状态 1未使用未绑定 2未使用已绑定 3已使用 4已过期 **/
    public static final Byte STA_WSY_WBD = 1;
    public static final Byte STA_WSY_YBD = 2;
    public static final Byte STA_YSY = 3;
    public static final Byte STA_YGQ = 4;

    public static final BigDecimal OPEN_VIP_AMOUNT = new BigDecimal("400");

    private Long id;
    private Long userId;
    private String name;
    private BigDecimal amount;
    private Date expiredTime;
    private Byte status;
    private String useConditions;
    private Long orderId;
}