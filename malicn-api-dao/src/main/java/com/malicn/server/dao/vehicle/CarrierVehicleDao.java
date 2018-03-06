package com.malicn.server.dao.vehicle;

import com.malicn.server.domain.vehicle.CarrierVehicle;
import org.apache.ibatis.annotations.Param;

/**
 * @description: 车辆-司机关联关系表DAO接口
 * @author yuanfei
 * @since: 2017-4-26 20:22:53
 * @version 1.0
 */
public interface CarrierVehicleDao {

    /**
     * 新增车辆-司机关联关系
     * @param carrierVehicle
     * @return
     */
    int saveVehicleDriver(CarrierVehicle carrierVehicle);

    /**
     * 更新车辆-司机关联关系
     * @param carrierVehicle
     * @return
     */
    int updateVehicleDriver(CarrierVehicle carrierVehicle);

    int updateCarrierIdByIds(@Param("oldDriverId") Long oldDriverId,@Param("newDriverId") Long newDriverId, @Param("vehicleId") Long vehicleId);

    int delete(Long id);

    CarrierVehicle getByCarrIdAndVhlId(@Param("carrId")Long carrId,
                                       @Param("vhlId")Long vhlId);

    CarrierVehicle getByCarrIdAndDriverId(@Param("carrId")Long carrId,
                                       @Param("vhlId")Long driverId);

    /**
     * 解除车主和司机的关系
     * @param carrierId 车主ID
     * @param vehicleId 车辆ID
     * @return
     */
    int deleteByPersonalDriver(@Param("carrierId") Long carrierId,
                               @Param("vehicleId") Long vehicleId);

    /**
     * @author qun.xu
     * @desc   取于丽君之外的报价人
     * @param vehicleId
     * @return
     */
    CarrierVehicle getCarrierExpectYULIIJUN(@Param("vehicleId") Long vehicleId);



}
