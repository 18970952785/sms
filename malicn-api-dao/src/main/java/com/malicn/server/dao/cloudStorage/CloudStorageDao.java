package com.malicn.server.dao.cloudStorage;

import com.malicn.server.domain.cloudStorage.CloudStorage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author xieqiujin
 * @date 2017/10/24
 */
public interface CloudStorageDao {

    /**
     * 云仓首页列表
     * @param provinceId
     * @param cityId
     * @return
     */
    List<CloudStorage> listStorage(@Param("provinceId") Integer provinceId,
                                   @Param("cityId") Integer cityId);

    /**
     * 查询所有云仓信息
     * @param cityId
     * @param storageName
     * @return
     */
    List<CloudStorage>  selectByPrimaryKey(@Param("cityId")Integer cityId,@Param("storageName") String storageName);


    /**
     * 根据主键获取云仓信息
     * @param id
     * @return
     */
    CloudStorage getById(@Param("id") Long id);

    /***
     * 新增云仓信息
     * @param storage
     * @return
     */
    int insertCloudStorage(CloudStorage storage);

    /***
     * 编辑云仓信息
     * @param storage
     * @return
     */
    int updateCloudStorage(CloudStorage storage);

    /**
     * 禁用
     * @param id
     * @return
     */
    int disableCloudStorage(@Param("id") Long id);
}
