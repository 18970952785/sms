package com.malicn.server.dao.sys;

import com.malicn.server.domain.bank.Bank;
import com.malicn.server.domain.sys.Region;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 */
public interface RegionDao {

    /**
     * 根据父级获取地区列表
     *
     * @param parentId
     * @return
     */
    List<Region> getRegionList(@Param("parentId") Integer parentId);

    /**
     * 微信公众号（h5）获取地区
     *
     * @return
     */
    List<Region> getRegionListH5();

    /**
     * 根据id获取地区
     *
     * @param id
     * @return
     */
    Region getRegionById(@Param("id") Integer id);

    Region getRegionByShortName(@Param("shortName") String shortName);

    //后台管理系统
    List<Region> getRegionCities();

    List<Region> selectCityName();


    /**
     * @param shortName
     * @return
     * @author qun.xu
     * @desc 获取报价者路线
     */
    Region getRegionRoute(@Param("shortName") String shortName);

    List<Region> getRegionByPidAndLevel(@Param("parentId") int parentId, @Param("level") Byte level);


    @MapKey("id")
    Map<Integer,Region> getRegionByList(List list);

    /**
     * 根据市获取省
     * @param id
     * @return
     */
    Region getParentById(Integer id);


    /**
     * 获取省市主键和名称
     */
    Region selectIdName(@Param("id") Integer id);
}