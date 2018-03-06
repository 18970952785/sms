package com.malicn.server.dao.coupon;

import com.malicn.server.domain.coupon.Coupon;
import com.malicn.server.domain.order.Order;
import com.malicn.server.domain.vip.UserVip;
import com.malicn.server.enums.vip.VipName;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface CouponDao {


    /**
     * 查询我的抵用券列表
     * @param userId 用户ID
     * @return
     */
    List<Coupon> selectByUserId(long userId);

    /**
     * 查询可用抵用券
     * @param userId 用户id
     * @return 可用的抵用券列表
     */
    List<Coupon> listMyUsableCoupon(@Param("userId") Long userId);

    /**
     * 过期未使用抵用券
     * @param now 服务器当前时间
     * @return 更新数量
     */
    int expiredUnUseCoupon(@Param("now") Date now);

    /**
     * 查询抵用券详情
     * @param couponId
     * @return 抵用券对象
     */
    Coupon getConponById(long couponId);

    /**
     * 将抵用券绑定订单ID
     * @param couponId  抵用券ID
     * @param orderId   订单ID
     * @return 执行条数
     */
    int updateOrderIdById(@Param("orderId") long orderId,
                          @Param("couponId") long couponId);

    /**
     * 根据用户id、订单id和抵用券状态获取金额
     * @param userId 用户id
     * @param orderId 订单id
     * @param status 抵用券状态
     * @return 抵用券列表
     */
    List<Coupon> getCouponByUserIdAndOrderId(@Param("userId") Long userId,
                                             @Param("orderId") Long orderId,
                                             @Param("status") Byte status);

    /**
     * 更新抵用券
     * @param coupon 抵用券对象
     * @return
     */
    int update(Coupon coupon);

    /**
     * 使用抵用券
     * @param couponId 抵用券对象
     * @return
     */
    int updateCouponUsed(@Param("id")Long couponId,
                         @Param("orderId")Long orderId);


    /**
     * 根据orderId查询抵用券金额
     * @param orderId 订单ID
     * @return
     */
    Coupon getAmountByOrderId(Long orderId);

    /**
     * 根据orderId查询抵用券
     * @param orderId 订单ID
     * @return
     */
    Coupon getCouponByOrderId(Long orderId);


    /**
     * 插入老库的抵用券
     * @param coupon
     * @return
     */
    int insertSynCoupon(Coupon coupon);

    int updateSynCoupon(Coupon coupon);

    /**
     * 每个月一号给已开通冷运管家的货主发送抵用券
     * @param list 已开通的冷运管家用户
     * @return
     */
    int insertCouponByOwnerVip(@Param("list") List<UserVip> list,
                               @Param("coupon") Coupon coupon);

    /**
     * 新增插入抵用券的方法
     * @param coupon
     * @return
     */
    int insert(Coupon coupon);




    //------------------------CMS1.3.0新增方法----------------------

    /**
     * 根据订单中的订单号查询可用的抵用券
     * @param
     */
    List<Coupon>  getListByOrderList(@Param("list") List<Order>list);

    /**
     * 根据订单中的货主查询可用的抵用券
     * @param
     */
    List<Coupon>  getListByOwnerList(@Param("list") List<Order>list);

}