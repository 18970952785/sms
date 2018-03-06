package com.malicn.server.dao.vehicle;

import com.malicn.server.domain.vehicle.VehlRoute;
import org.apache.ibatis.annotations.Param;

public interface VehlRouteDao {
    int deleteByPrimaryKey(Long id);

    int insert(VehlRoute record);

    int insertSelective(VehlRoute record);

    VehlRoute selectByPrimaryKey(Long id);

    VehlRoute getByVidAndStaIdAndArrId(@Param("vid")Long vid,
                                       @Param("sid")Integer sid,
                                       @Param("aid")Integer aid);

    int updateByPrimaryKeySelective(VehlRoute record);

    int updateByPrimaryKey(VehlRoute record);
}