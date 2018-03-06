package com.malicn.server.dao.location;


import com.malicn.server.domain.location.DriverLocation;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface DriverLocationDao {

    /**
     * 保存司机定位信息
     * @param driverLocation
     * @return
     */
    int saveDriverLocation(DriverLocation driverLocation);


    /**
     * 司机运行轨迹
     * @param mobile
     * @param strDate
     * @param endDate
     * @return
     */
    List<DriverLocation> getDriverRoute(@Param("mobile")String mobile,
                                        @Param("strDate") Date strDate,
                                        @Param("endDate") Date endDate);
}