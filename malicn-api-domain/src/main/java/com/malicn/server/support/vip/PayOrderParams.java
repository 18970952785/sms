package com.malicn.server.support.vip;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by xieqiujin on 2017/7/12.
 */
@Data
public class PayOrderParams {
    private Long couponId;
    private BigDecimal totalAmount;
}
