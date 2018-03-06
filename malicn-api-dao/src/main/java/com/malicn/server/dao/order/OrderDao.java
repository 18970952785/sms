package com.malicn.server.dao.order;

import com.malicn.server.domain.order.Order;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface OrderDao {

    /**************************************货主端Dao Start**********************************************/
    /**
     * 创建订单
     * @param order 订单对象
     * @return 执行条数 0失败 1成功
     */
    int saveOrder(Order order);

    int insertSelective(Order order);

    /**
     * 查询订单详情
     * @param orderId   订单ID
     * @return  订单对象
     */
    Order getOrderById(long orderId);

    /**
     * 检测该用户是否首单
     * @param userId
     * @return
     */
    int countOrders(long userId);


    /**
     * 计算用户待确定订单数
     * @param userId
     * @return
     */
    int countDqdOrders(long userId);

    /**
     * 计算司机未完成订单数
     * @param driverId
     * @return
     */
    int countUnDoneOrders(long driverId);

    /**
     * 根据状态查询订单列表
     * @param status 订单状态
     * @param userId 用户id-即货主id
     * @return 订单列表对象
     */
    List<Order> listOrdersByStatus(@Param("status") Integer status, @Param("userId") Long userId);

    /**
     * 货主验收
     * @param orderId   订单ID
     * @return  执行条数
     */
    int acceptByOrderId(@Param("status") byte status,
                        @Param("orderId") long orderId);

    /**
     * 删除订单
     * @param orderId   订单ID
     * @return  执行条数
     */
    int removeByOrderId(long orderId);

    /**
     * 搜索订单
     * @param startRegionId 开始城市ID
     * @param arriveRegionId    到达城市ID
     * @param userId    用户ID
     * @return  订单列表
     */
    List<Order> listOrderByParams(@Param("startRegionId")Integer startRegionId,
                                  @Param("arriveRegionId")Integer arriveRegionId,
                                  @Param("userId")long userId);

    /**
     * 根据订单ID查询 车主到款金额 和车主ID
     * @param orderId
     * @return
     */
    Order getOrderInfo(Long orderId);

    /**
     * 根据用户id、订单id获取货主应付金额
     * @param userId 用户id
     * @param orderId 订单id
     * @return 应付金额
     */
    BigDecimal getOwnerAmountByUserIdAndOrderId(@Param("userId") Long userId,
                                                @Param("orderId") Long orderId);

    /**
     * 根据userId 查询待支付和待验收的订单
     * @param userId 用户ID
     * @return  订单集合
     */
    List<Order> getOrderByStatus(Long userId);

    /**
     * 查询所有正在处理的订单的总金额
     * @param userId    用户ID
     * @return  sum(订单总价)
     */
    BigDecimal getCountOrdingTotalAmount(Long userId);

    /**
     * 更新订单状态
     * @param status 订单状态
     * @return
     */
    int updateOrderStatus(@Param("orderId") Long orderId,
                          @Param("status") Byte status,
                          @Param("discountAmount") BigDecimal discountAmount,
                          @Param("ownerAmount") BigDecimal ownerAmount);

    /**
     * 更新订单状态
     * @param status 订单状态
     * @return
     */
    int updateChargeStatusAndStatus(@Param("orderId") Long orderId,
                          @Param("status") Byte status,
                          @Param("discountAmount") BigDecimal discountAmount,
                          @Param("ownerAmount") BigDecimal ownerAmount,
                          @Param("chargeStatus") Byte chargeStatus);

    /**
     * 用户最近一条订单
     * @param userId    用户ID
     * @return          订单
     */
    Order getLatelyOrder(@Param("userId") Long userId,
                         @Param("startId")Integer startId,
                         @Param("arriveId")Integer arriveId);

    /**
     * 更新更新时间
     * 因为线下汇款并没有操作ml_order表,所以update_time没有更新，所以我们手动更新ml_order表的update_time
     * @param orderId   订单ID
     * @return
     */
    int updateUpdateTime(Long orderId);

    /**
     * 根据userId 查询首单的订单
     * @param userId
     * @return
     */
    Order getFirstOrders(Long userId);

    /**
     * 保存补充订单信息
     * @param order
     * @return
     */
    int updateOrderBySupplement(Order order);

    int updateOrderChange(Long orderId);
    /**************************************货主端Dao End**********************************************/



    /**************************************车主端Dao Start**********************************************/

    /**
     * 查询车主订单列表
     * @param status 订单状态
     * @param userId 用户id-即车主id
     * @param from 来源  1-货主端   2-车主端   3-企业司机
     * @return 订单列表对象
     */
    List<Order> listOrdersByStatusForCarrier(@Param("status") Integer status, @Param("userId") Long userId, @Param("from") Integer from);

    /**
     * 查询车主的待支付和待验收的订单
     * @param userId 车主ID
     * @return  订单集合
     */
    List<Order> getOrderByStatusForCarrier(Long userId);
    /**
     * 搜索订单
     * @param startRegionId     开始城市
     * @param arriveRegionId    到达城市
     * @param userId            车主ID
     * @return                  订单List
     */
    List<Order> listOrderByParamsForCarrier(@Param("startRegionId")Integer startRegionId,
                                            @Param("arriveRegionId")Integer arriveRegionId,
                                            @Param("userId")long userId,
                                            @Param("from")Integer from);

    /**
     * 查询待卸货订单数量
     * @param driverId  司机ID
     * @return
     */
    int countDXHOrders(Long driverId);

    /**
     * 查询代揽收订单数量
     * @param driverId  司机ID
     * @return
     */
    int countDLSOrders(Long driverId);

    /**
     * 查询未完成的订单
     * @param vehicleId
     * @return
     */
    int countWWCOrders(Long vehicleId);
    /**************************************车主端Dao End***********************************************/



    /**** 司机端 2.2.0 超级司机 ****/
    /**
     * 超级司机配货量明细
     * @param userId    司机ID
     * @param createTime 开通会员日期
     * @param expiredDate 会员到期日期
     * @return
     */
    List<Order> listDriverMath(@Param("userId") Long userId,
                               @Param("createTime") Date createTime,
                               @Param("expiredDate") Date expiredDate);

    /**** 司机端 2.2.0 超级司机 ****/
    /**
     * 超级司机累计配货量
     * @param userId    司机ID
     * @param createTime 开通会员日期
     * @param expiredDate 会员到期日期
     * @return
     */
    BigDecimal getTotalWeight(@Param("userId") Long userId,
                               @Param("createTime") Date createTime,
                               @Param("expiredDate") Date expiredDate);





    //----------------CMS订单新增方法------------------------------------------

    /**
     *  根据订单的IDS查询
     */
    List<Order> listByIdsAndStatus (@Param("list") List<Long> ids,@Param("status") Byte status,@Param("ownerMobile") String mobile);

    /**
     * 查询需要补充的订单
     */
    List<Order> listOrderBySupplement(@Param("orderIds") String orderIds,
                                      @Param("ownerMobile") String ownerMobile,
                                      @Param("orderStatus") Byte orderStatus);

    /**
     * 取消订单
     */
    int cancelOrder(@Param("orderId") Long orderId,
                    @Param("reason") String reason,
                    @Param("isInvalid") Byte isInvalid,
                    @Param("reasonType") Byte reasonType,
                    @Param("isTest") Byte isTest);

    /**
     * 货主、路线查询
     * @param ownerId
     * @return
     */
    List<Order> listByRoute(@Param("ownerId") Long ownerId,
                            @Param("startId") int startId,
                            @Param("arriveId") int arriveId);

    /**
     * 确认订单
     * 曾丁丁
     * @param order
     * @return
     */
    int updateOrderByConfirm(Order order);


    /**
     *  根据订单的IDS查询
     */
    List<Order> listByIdsDisDriverIdAndCarrier (@Param("list") List<Long> ids);


    /**
     * @author qun.xu
     * @desc 查询通知的订单
     */
    List<Order> listNoticeOrders ();

    /**
     * @author qun.xu
     * @desc 查询通知的订单数量，列表方法保留
     */
     int countNoticeOrders ();

    /**
     * 更新通知次数
     */
    void  updateNoticeCount();

    /**
     * 查询流控中的订单 代揽收，待支付，待卸货，待验收
     * @param orderStatus   订单状态
     * @param orderId       订单Id
     * @param ownerMobile   货主电话
     * @return
     */
    List<Order> listFlowOrders(@Param("orderStatus") String  orderStatus,
                               @Param("orderId") String orderId,
                               @Param("ownerMobile") String ownerMobile,
                               @Param("adminId") Integer adminId,
                               @Param("control") int control,
                               @Param("ingStatus") Byte ingStatus
                               );



    //查询所有订单
    List<Order> selectOrderAll(@Param("order") Order order,
                               @Param("orderTypeArray") Long [] orderTypeArray,
                               @Param("statusArray") Long [] statusArray);

    /**
     * 走单查询所有订单
     * @param order
     * @return
     */
    List<Order> selectWalkOrderAll(Order order);
    //查询已确定订单
    List<Order>   findAllFlowAllot(Order order);

    /**
     * @Description 订单导出
     *
     */
     List<Order> orderExcel(@Param("order") Order order,
                           @Param("orderTypeArray") Long [] orderTypeArray,
                           @Param("statusArray") Long [] statusArray);

    int updateStreamById(@Param("orderId") Long orderId,
                         @Param("streamAdminId") Integer streamAdminId,
                         @Param("streamType") Byte streamType);

    /**
     * 回滚订单，将订单状态更改为待确认
     * @param orderId
     * @return
     */
    int rollbackOrderById(@Param("orderId") Long orderId);

    /**
     * 更新订单重量
     * @param orderId
     * @param weight
     * @return
     */
    int updateWeightById(@Param("orderId") Long orderId,
                         @Param("weight") BigDecimal weight);

    /**
     * 调整订单费用，更新车主金额和货主金额
     * @param orderId       订单Id
     * @param carrierAmount 车主金额
     * @param totalAmount   货主金额
     * @return
     */
    int updateAmountById(@Param("orderId") Long orderId,
                         @Param("carrierAmount") BigDecimal carrierAmount,
                         @Param("totalAmount") BigDecimal totalAmount);


    //----------------------------CMS 1.3.0  财务----------------------------------

    /**
     * @author qun.xu
     * @desc  根据关键词搜索 ，20条
     */
    List<Order> queryOrderByKey(@Param("key") String key);





    List<Order> getOrders(@Param("userType") Byte userType,
                          @Param("userId") Long userId);


    /**
     * 获取运费结算单汇总的数据
     * @return
     */
    List<Order> getOwnerSettle();

    /**
     * 获取运费月结结算单汇总的数据
     * @return
     */
    List<Order> getFreightSettleDetail(@Param("startTime") Date startTime,@Param("endTime") Date endTime);


    /**
     * 获取运费票结结算单汇总的数据
     * @return
     */
    List<Order> getOwnerSettleDetail(@Param("startTime") Date startTime,@Param("endTime") Date endTime);

    /**
     * 更改订单的核销状态
     * @return
     */
    void updateChargeStatus(@Param("orderIdsStr") String orderIdsStr,@Param("chargeStatus") Byte chargeStatus);


    /**
     * 批量更改核销状态
     * @return
     */
    void updateChargeStatusBatch(@Param("list") List withOrderIdList);




    /**
     * 获取外来并且是有返现标识的订单
     */
    List<Order> getReturnForeign(@Param("group") Byte group, @Param("startTime") Date startTime, @Param("endTime")Date endTime);

    Order getSumAndCount(@Param("userId") Long userId, @Param("startTime") Date startTime, @Param("endTime")Date endTime);

    /**
     * 订单流控确认收款时，订单的状态变化
     */
    int updateBySureRec(  @Param("orderId") Long orderId,
                          @Param("status") Byte status,
                          @Param("discountAmount") BigDecimal discountAmount,
                          @Param("ownerAmount") BigDecimal ownerAmount,
                          @Param("chargeStatus") Byte chargeStatus
                          );


    /**
     * 当订单再确认收款使用了预付款需要存储该预付款流水ID
     */
    int updateDepositeId(  @Param("orderId") Long orderId, @Param("depositeDetailId")  Long depositeDetailId  );


    /**
     * 批量更新订单的付款状态，传递的参数为List返现单或者订单Ids
     */
    int updatePayStatusByList(@Param("list") List orders,Byte status);


    int updatePayStatusByListFKZ(List orders);

    /**
     * 保存导入订单
     * @param order
     * @return
     */
    int saveExcelOrder(Order order);

    //--------------@author qun.xu @desc 锁单列表--------------------------------------
    /**
     * 查询需要补充的订单
     */
    List<Order> listByLock(@Param("orderId") String orderId,
                           @Param("ownerMobile") String ownerMobile);



    /**
     * 唛头信息搜索订单信息列表
     * @param order
     * @return
     */
    List<Order> selectOrderByStatusAndOrderId(Order order);

    /**
     * @Author: lianrongxiang
     * @Description 编辑订单
     * @date 2017-12-13
     */
    int updateOrderType(Order order);

    /**
     * 新增违约时下拉订单
     * @param wd
     * @return
     */
    List<Order> getOrderRegret(@Param("wd")String wd);

    /**
     * 导出质检订单
     */
    List<Order> exportQaOrder(@Param("orderStatus")Byte orderStatus,
                              @Param("orderId")String orderId,
                              @Param("status")Byte status,
                              @Param("adminId") Integer adminId);
}