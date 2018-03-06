package com.malicn.server.dao.vehicle;

import com.malicn.server.domain.vehicle.DriverVehicleLog;

/**
 * @description: 车辆司机绑定日志表DAO接口
 * @author yuanfei
 * @since: 2017-5-2 9:49:12
 * @version 1.0
 */
public interface DriverVehicleLogDao {

    /**
     * 新增车辆司机绑定日志
     * @param driverVehicleLog
     * @return
     */
    int saveDriverVehicleLog(DriverVehicleLog driverVehicleLog);

    /**
     * 修改车辆司机绑定日志
     * @param driverVehicleLog
     * @return
     */
    int updateDriverVehicleLog(DriverVehicleLog driverVehicleLog);
}