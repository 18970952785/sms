package com.malicn.server.dao.drivermatch;


import com.malicn.server.domain.drivermatch.DriverMatch;
import org.apache.ibatis.annotations.Param;


/**
 * @author qun.xu
 * @date 2017.09.04
 * @desc  司机匹配
 */
public interface DriverMatchDao {

    int saveDriverMatch(DriverMatch driverMatch);

    DriverMatch getByOrderId(@Param("orderId") Long orderId);

    int deleteByOrderId(Long orderId);

}
