package com.malicn.server.domain.reward;

import com.malicn.server.domain.BasePo;
import com.malicn.server.enums.vip.VipName;
import lombok.Data;

import java.math.BigDecimal;
/**
 * Created by xieqiujin on 2017/7/7.
 * @modify  qun.xu
 * @date 2017.07.07
 * @描述： OrderReward 订单奖励实体
 */
@Data
public class OrderReward extends BasePo{
    //主键
    private Long id;
    //订单用户ID
    private Long userId;
    //完成的订单ID
    private Long orderId;
    //完成订单重量
    private BigDecimal weight;
    //奖励金额
    private BigDecimal amount;

    private VipName vipName;

    private Long vipId;

    //获取奖励的月份
    private String createTimeMonth;

    private Integer countOrder;
    private BigDecimal sumAmount;
    private BigDecimal sumWeight;
}
