package com.malicn.server.dao.order;


import com.malicn.server.domain.order.OrderTrack;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 跟踪订单
 */
public interface OrderTrackDao {

    /**
     * 跟踪订单
     * @param orderId   订单ID
     * @return
     */
    List<OrderTrack> listOrderTrack(Long orderId);

    /**
     * 更新跟踪订单
     * @param orderTrack 订单跟踪对象
     * @return  执行条数
     */
    int saveOrderTrack(OrderTrack orderTrack);

    int insertSelective(OrderTrack orderTrack);

    @MapKey("modelId")
    Map<Integer,OrderTrack> getTrackMapByOrderId(@Param("orderId") Long orderId);

    int deleteOrderTackByRollbackOrder(Long orderId);
}