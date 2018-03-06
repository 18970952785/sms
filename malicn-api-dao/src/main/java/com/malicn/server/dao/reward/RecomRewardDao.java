package com.malicn.server.dao.reward;

import com.malicn.server.dao.balance.BaseQueryDTO;
import com.malicn.server.domain.reward.OrderReward;
import com.malicn.server.domain.reward.RecomReward;
import com.malicn.server.enums.vip.VipName;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by xieqiujin on 2017/7/8.
 */
public interface RecomRewardDao {

    /**
     * 查询用户累计推荐订单奖励
     * @param vipId
     * @return
     */
    BigDecimal countRecomReward(Long vipId);


    /**
     * 查询推荐人的奖励列表
     * @param queryDTO
     * @return
     */
    List<RecomReward> getRecomRewards(BaseQueryDTO queryDTO);


    /**
     * 月份统计-查询推荐人的奖励列表
     * @param queryDTO
     * @return
     */
    List<RecomReward> getRecomRewardsMonth(BaseQueryDTO queryDTO);



    /**
     * 查询推荐人的奖励列表
     * @param recomUserId  第一个Id为被推荐人Id,
     *                     第二个为推荐人Id,查询每个人完成的总吨数
     * @return
     */
    BigDecimal getSumRecomRewards( @Param("userId")Long userId,
                                   @Param("recomUserId")Long recomUserId,
                                   @Param("vipName")VipName vipName);

    /**
     * 保存推荐奖励
     * @param
     * @return
     */
    void  saveRecomReward(RecomReward recomReward);

}
