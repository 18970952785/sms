package com.malicn.server.dao.vehicle;

import com.malicn.server.domain.vehicle.DriverVehicle;
import com.malicn.server.domain.vehicle.Vehicle;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VehicleDao {

    /**
     * 新增车辆
     * @param vehicle   车辆对象
     * @return
     */
    int saveVehicle(Vehicle vehicle);

    /**
     * 新增车辆
     * @param vehicle   车辆对象
     * @return
     */
    int insertSelective(Vehicle vehicle);

    /**
     * 修改车辆信息
     * @param vehicle   车辆对象
     * @return
     */
    int updateVehicle(Vehicle vehicle);

    /**
     * 物理删除车辆信息
     * @param id   车辆id
     * @return
     */
    int deletedByphciol(Long id);

//    /**
//     * 逻辑删除车辆信息
//     * @param id   车辆id
//     * @return
//     */
//    int deletedVehicle(Long id);

    Vehicle getByPlateNo(String pltNo);

    /**
     * 根据司机id获得他驾驶车辆的车牌号
     * @param driverId
     * @return
     */
    List<String> getPlateNoByDriverId(Long driverId);

    /**
     * 根据司机ID查询,该方法是为了司机端，个体司机调用
     * 查询个体司机的车辆信息
     * @return
     */
    Vehicle getByPersonalDriver(Long driverId);

    /**
     * 根据司机id获得车辆id
     * @param driverId 司机id
     * @return
     */
    List<Long> getVehicleIdByDriverId(Long driverId);

    /**
     * 删除车辆
     * @param vehicleId 车辆ID
     * @return
     */
    int deleteVehicle(Long vehicleId);

    /**
     * 根据车牌号、司机ID、车辆ID查询车辆
     * @param plateNo
     * @param driverId
     * @param vehicleId
     * @return
     */
    Vehicle getVehicleByPLNoUIdVId(@Param("plateNo") String plateNo,
                                      @Param("driverId") Long driverId,
                                      @Param("vehicleId") Long vehicleId);


    //-------------------------------------CMS 系统所使用dao ----------------------------------------


    Vehicle selectById(@Param("vehicleId") Long vehicleId);

    /**
     * @author qun.xu
     * @param
     * @return
     * @desc 根据关键词查询wd查询司机的车辆信息
     */
    List<DriverVehicle> listByKeyWord(String wd);

    /**
     * @param
     * @return
     * @desc 根据关键词查询wd查询司机的车辆信息
     */
    List<DriverVehicle> listVehicle(@Param("authStatus") Byte authStatus,
                                    @Param("plateNo") String plateNo);

    /**
     * 根据车辆Id查询司机和车辆信息
     * @param vehicleId
     * @return
     */
    DriverVehicle getDriverVehicleById(Long vehicleId);

    Vehicle getByLicenseNo(String licenceNo);

    int updateAuthStatus(@Param("vehicleId") Long vehicleId,
                                @Param("authStatus") byte authStatus);
}