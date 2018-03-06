package com.malicn.server.dao.sys;


import com.malicn.server.domain.sys.CargoCategory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CargoCategoryDao {
    List<CargoCategory> listCargoCtgory();

    String [] listCargoCtgoryById(@Param("cargoCtgtrIds") Integer [] cargoCtgtrIds);

    Integer [] listCargoCtgoryByName(@Param("cargoCtgtrNames") String [] cargoCtgtrNames);
}