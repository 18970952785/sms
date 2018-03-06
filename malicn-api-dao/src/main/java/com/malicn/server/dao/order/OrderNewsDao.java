package com.malicn.server.dao.order;

import com.malicn.server.domain.order.OrderNews;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface OrderNewsDao {

    /**
     * 创建订单动态
     * @param  orderNews
     * @return 执行条数 0失败 1成功
     */
    int saveOrderNews(OrderNews orderNews);

    /**
     * 查询订单详情
     * @param orderNewsId   订单ID
     * @return  订单动态对象
     */
    OrderNews getOrderNews(int orderNewsId);

    /**
     * 查询最新动态
     * @param size 条数
     * @return 订单动态对象
     */
    List<OrderNews> listRecentBySize( @Param("fromTime") Date fromTime,
                                      @Param("endTime") Date endTime,
                                      @Param("size") Integer size);

}