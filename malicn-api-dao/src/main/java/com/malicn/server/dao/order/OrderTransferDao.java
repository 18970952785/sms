package com.malicn.server.dao.order;


import com.malicn.server.domain.order.OrderTransfer;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

public interface OrderTransferDao {

    /**
     * 填写转账信息
     * @param orderTransfer 转账domian
     * @return  执行数
     */
    int saveOrderTransfer(OrderTransfer orderTransfer);

    int insertSelective(OrderTransfer orderTransfer);

    /**
     * 根据订单ID查询转账信息
     * @param orderId   订单ID
     * @return  转账信息
     */
    OrderTransfer getByOrderId(long orderId);

    /**
     * 查询该用户最近一条转账联系人
     * @param userId
     * @return
     */
    OrderTransfer getLatelyContact(Long userId);


    /**
     * 获取单条转账信息
     * @param id
     * @return
     */
    OrderTransfer getById(@Param("id") Long id);

    /**
     * 查询所有转账信息
     * @param orderIdString
     * @param transName
     * @param mobile
     * @return
     */
    List<OrderTransfer> selectByPrimaryKeyAllList(@Param("orderIdString")String orderIdString,
                                                  @Param("transName") String transName,
                                                  @Param("mobile")String mobile,
                                                  @Param("statusString")String statusString );

    /**
     * 转账支付审核
     * @param id
     * @param remark
     * @param payAmount
     * @param status
     * @return
     */
    int updateStatus(@Param("id")Long id,
                               @Param("remark") String remark,
                               @Param("payAmount")BigDecimal payAmount,
                               @Param("status") Byte status);


}