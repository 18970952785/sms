package com.malicn.server.dao.reward;

import com.malicn.server.domain.reward.Reward;

import java.util.List;

/**
 * @描述：  查询所有的奖励条件
 * @author  qun.xu
 * @date 2017.07.07
 */
public interface RewardDao {

    /**
     * @描述:  查询所有的奖励
     * @author qun.xu
     * @date 2017.07.11
     */
    List<Reward> getAllRewards();

    /**
     * @描述:  查询特定类型的奖励
     * @author qun.xu
     * @date 2017.07.11
     */
    List<Reward> getRewardsByType(Byte type);
}
