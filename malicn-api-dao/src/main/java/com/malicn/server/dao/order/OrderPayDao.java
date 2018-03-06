package com.malicn.server.dao.order;

import com.malicn.server.domain.order.OrderPay;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 支付宝支付
 * @author: yuanfei
 * @since: 2017/4/11 10:00
 * @version: v1.0
 */
public interface OrderPayDao {


    /**
     * 新增订单支付
     * @param orderPay
     * @return
     */
    int saveOrderPay(OrderPay orderPay);

    /**
     * 修改订单支付
     * @param orderPay
     * @return
     */
    int updateOrderPay(OrderPay orderPay);

    /**
     * 更新订单支付结果
     * @param orderPay
     * @return
     */
    int updateNotifyOrderPay(OrderPay orderPay);

    /**
     * 删除订单支付
     * @param orderPayId 订单支付id
     * @return
     */
    int deleteOrderPay(long orderPayId);

    /**
     * 根据主键id查订单支付信息
     * @param id 主键id
     * @return 订单支付对象
     */
    OrderPay getOrderPayById(Long id);

    /**根据orderId查询已经支付成功了的订单信息
     * @param relatedId   订单ID
     * @return
     */
    OrderPay getSuccessOrderPay(Long relatedId);
}