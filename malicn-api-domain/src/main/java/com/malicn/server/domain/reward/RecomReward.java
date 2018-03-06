package com.malicn.server.domain.reward;

import com.malicn.server.domain.BasePo;
import com.malicn.server.enums.vip.VipName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by xieqiujin on 2017/7/7.
 * @modify  qun.xu
 * @date 2017.07.07
 * @描述： OrderReward 推荐奖励实体
 */
@Data
public class RecomReward extends BasePo {
    //主键
    private Long id;
    //推荐人ID
    private Long userId;
    //被推荐人ID
    private Long refereeId;
    //完成订单ID
    private Long orderId;
    //完成订单吨数
    private BigDecimal weight;
    //奖励金额
    private BigDecimal amount;

    //推荐人
    private Long vipId;
    //推荐名称
    private VipName vipName;

    //创建月份
    private String createTimeMonth;
}
