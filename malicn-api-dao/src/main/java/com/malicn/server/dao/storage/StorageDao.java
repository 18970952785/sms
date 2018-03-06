package com.malicn.server.dao.storage;

import com.malicn.server.annotation.EnablePaging;
import com.malicn.server.domain.storage.Storage;
import com.malicn.server.mybatis.page.QueryPage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StorageDao {
    int deleteByPrimaryKey(Long id);

    int insert(Storage storage);

    int insertSelective(Storage storage);

    Storage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Storage storage);

    int updateByPrimaryKey(Storage storage);

    int updateIsDeleteById(long strgId);

    /**
     * 查询我的冷库列表
     * @param userId
     * @return
     */
    List<Storage> selectStrgList(long userId);

    /**
     * 新增的时候根据userId、冷库名称、冷库所在城市查询冷库
     * @param storage
     * @return
     */
    Storage selectByParamForInsert(Storage storage);

    /**
     * 修改的时候根据userId、冷库名称、冷库所在城市查询冷库
     * @param storage
     * @return
     */
    Storage selectByParamForUpdate(Storage storage);

    /**
     * 创建订单时查询冷库列表
     * @param userId   用户ID
     * @return
     */
    List<Storage> listSysMyStrg(@Param("userId")long userId,
                                @Param("regionId")int regionId
                               );

    /**
     * 搜索冷库
     * @param strgName  冷库名称
     * @param userId    用户ID
     * @param regionId  城市ID
     * @return  list
     */
    List<Storage> listStrgByName(@Param("userId")long userId,
                                 @Param("strgName")String strgName,
                                 @Param("regionId")int regionId);

    /**
     * 查询热门冷库
     * @param regionId 城市ID
     * @return
     */
    List<Storage> listHotStrg(int regionId);


    List<Storage> selectAllList(@Param("regionId") String regionId,@Param("storageName") String storageName);

    List<Storage> getStorageAddress(@Param("wd")String wd);

}