package com.malicn.server.dao.route;

import com.malicn.server.domain.route.Route;
import com.malicn.server.domain.sys.Region;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: 路径询价Dao
 * @author: yuanfei
 * @since: 2017/4/10 11:20
 * @version: v1.0
 */
public interface RouteDao {

    int insertSelective(Route route);

    int updateByPrimaryKeySelective(Route route);

    /**
     * 获取所有路线
     * @return
     */
    List<Route> getAll();

    /**
     * 查询出发地所有1级地名
     * @return 1级地名列表
     */
    List<Region> listOneLevelInRouteForStart();

    /**
     * 查询目的地所有1级地名
     * @param startId 出发地2级id
     * @return 1级地名列表
     */
    List<Region> listOneLevelInRouteForArrive(Integer startId);

    /**
     * 查询出发地2级地名
     * @param parentId 父级地点id
     * @return 2级地名列表
     */
    List<Region> listTwoLevelInRouteByParentForStart(Integer parentId);

    /**
     * 查询目的地2级地名
     * @param parentId 父级2级地点id
     * @param arriveAid 目的地1级地id
     * @return 2级地名列表
     */
    List<Region> listTwoLevelInRouteByParentForArrive(@Param("parentId") Integer parentId, @Param("arriveAid") Integer arriveAid);

    /**
     * 查询路线估价
     * @param startId 出发地id
     * @param arriveId 目的地id
     * @return 路线估价对象
     */
    Route getRouteByStartAndArrive(@Param("startId") Integer startId, @Param("arriveId") Integer arriveId);
}