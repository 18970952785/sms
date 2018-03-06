package com.malicn.server.dao.reward;

import com.malicn.server.dao.balance.BaseQueryDTO;
import com.malicn.server.domain.reward.OrderReward;
import com.malicn.server.domain.reward.RecomReward;
import com.malicn.server.domain.reward.Reward;
import com.malicn.server.domain.vip.UserVip;
import com.malicn.server.enums.vip.VipName;
import com.malicn.server.support.vip.Vip;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by xieqiujin on 2017/7/8.
 */
public interface OrderRewardDao {

    /**
     * 查询用户累计订单奖励
     * @param userId
     * @return
     */
    BigDecimal countOrderReward(Long userId);



    /**
     * 查询下单的奖励列表
     * @param queryDTO
     * @return
     */
    List<OrderReward> getOrderRewardList(BaseQueryDTO queryDTO);

    /**
     * 查询下单的奖励列表
     * @param queryDTO
     * @return
     */
    List<OrderReward> getOrderRewardListMonth(BaseQueryDTO queryDTO);


    /**
     * 查询上个月的奖励 0 否  1是  group
     * @return
     */
    List<OrderReward> getUpMonth(@Param("startDate") Date startDate,
                                 @Param("endDate") Date endDate,
                                 @Param("group") Byte group);

    /**
     * 根据用户Id查询
     * @param userId
     * @return
     */
    OrderReward getCountAndSum(@Param("userId") Long userId, @Param("vipName") VipName vipName);

    /**
     * 保存下单奖励
     * @param
     * @return
     */
    void  saveOrderReward(OrderReward orderReward);


}
