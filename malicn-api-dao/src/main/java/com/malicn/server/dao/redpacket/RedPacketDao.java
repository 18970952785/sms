package com.malicn.server.dao.redpacket;

import com.malicn.server.domain.redpacket.RedPacket;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by dingchangjiang on 2017/5/24.
 */
public interface RedPacketDao {
    /**
     * 列举我的所有红包
     * */
    public List<RedPacket> listMyRedPackets(Long userId);

    /**
     * 通过红包id获取我的红包
     * */
    public RedPacket getRedPacketById(Long redPacketId);

    /**
     * 更新红包的状态
     * */
    public void updateRedPacketStatus(@Param("redPacketId") Long redPacketId,@Param("status") Integer status);

    /**
     * 没有领取的红包过期
     * */
    public Integer expiredUnReceiveRedPacket(Date now);

    /**
     * 未领取红包，limit 1 只需要一条
     * @param userId    司机ID
     * @return
     */
    RedPacket getUnclaimedRdPk(Long userId);
}
