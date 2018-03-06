package com.malicn.server.domain.order;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderDetail extends BasePo{

    /** 明细ID **/
    private Long id;

    /** 订单ID **/
    private Long orderId;

    /** 费用名称 **/
    private String name;

    /** 费用金额 **/
    private BigDecimal amount;

    /** 创建人 **/
    private String creator;
}