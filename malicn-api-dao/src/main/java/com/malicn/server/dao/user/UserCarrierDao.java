package com.malicn.server.dao.user;

import com.malicn.server.domain.user.UserCarrier;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 车主表DAO接口
 * @author yuanfei
 * @since: 2017-4-26 20:32:17
 * @version 1.0
 */
public interface UserCarrierDao {

    /**
     * 修改车主余额,在基础金额上面累加
     * @param carrierId 车主ID
     * @param carrierAmount 车主到款金额
     * @return  执行条数
     */
    int updateBalance(@Param("carrierId") Long carrierId,
                      @Param("carrierAmount") BigDecimal carrierAmount);


    /**
     * 验收的时候修改车主余额,在基础金额上面累加
     * @param balance 车主余额
     * @param preBalance 车主预付款
     * @return  执行条数
     */
    int updateBalanceByAccept(@Param("carrierId") Long carrierId,
                              @Param("balance") BigDecimal balance,
                              @Param("preBalance") BigDecimal preBalance);

    /**
     * 新增车主
     * @param userCarrier
     * @return
     */
    int saveUserCarrier(UserCarrier userCarrier);

    int insertSelective(UserCarrier userCarrier);

    /**
     * 修改车主
     * @param userCarrier
     * @return
     */
    int updateUserCarrier(UserCarrier userCarrier);

    /**
     * 根据车辆id查询所属承运商、经纪人名称
     * @param vehicleId 车辆id
     * @return
     */
    List<UserCarrier> listUserCarriersByVehicleId(Long vehicleId);

    /**
     * 查询车主   不包括于丽君
     * @param carrierId
     * @return
     */
    UserCarrier getUserCarrierByUserId(Long carrierId);

    /**
     * 验收时查询车主，查询于丽君
     * @param carrierId
     * @return
     */
    UserCarrier getUserCarrier(Long carrierId);


    //======================================CMS 新增方法 ============================================================

    /**
     * 修改车主余额,在基础金额上面累加
     * @param carrierId 车主ID
     * @param carrierAmount 车主到款金额
     * @return  执行条数
     */
    int initCarrierBalance(@Param("carrierId") Long carrierId,
                      @Param("carrierAmount") BigDecimal carrierAmount);

    /**
     * 回滚订单时从车主pre_balance减去该条订单的carrier_amount
     * @param carrierId     车主Id
     * @param carrierAmount 车主金额（订单表中的车主金额）
     * @return
     */
    int minusCarrierBalance(@Param("carrierId") Long carrierId,
                            @Param("carrierAmount") BigDecimal carrierAmount);

}