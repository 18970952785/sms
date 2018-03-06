package com.malicn.server.dao.sys;

import com.malicn.server.domain.sys.Version;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by xieqiujin on 2017/4/28.
 */
public interface VersionDao {

    /**
     * 获取版本更新
     * @param clientType    客户段类型  1.货主 2.车主
     * @param osType        系统类型    1.ios  2.android
     * @return
     */
    Version getVersionByType(@Param("clientType") Integer clientType,
                             @Param("osType") Integer osType);


    /**
     * 根据客户端当前版本编号查询大于当前版本编号的版本
     * @param clientType    客户段类型  1.货主 2.车主
     * @param osType        系统类型    1.ios  2.android
     * @param currentVersionCode    客户端当前版本编号
     * @return  version
     */
    List<Version> listVersionByVersionCode(@Param("clientType") Integer clientType,
                                          @Param("osType") Integer osType,
                                          @Param("versionCode") Long currentVersionCode);


    /**
     * 查询所有版本信息
     * @auth lianrongxiang
     * @param name
     * @param clientType
     * @param osType
     * @param status
     * @return
     */
    List<Version> selectPrimaryKeyAllList(@Param("name")String name,
                                          @Param("clientType")Byte clientType,
                                          @Param("osType")Byte osType,
                                          @Param("status")String status);


    /**
     * 根据ID查询版本信息
     * @auth lianrongxiang
     * @param id
     * @return
     */
    Version getById(@Param("id") Integer id);

    /**
     * 新增版本信息
     * @auth lianrongxiang
     * @param version
     * @return
     */
    int insertVersion(Version version);

    /**
     * 修改版本信息
     * @auth lianrongxiang
     * @param version
     * @return
     */
    int updateVersion(Version version);


    /**
     * 是否强制更新
     * @param id
     * @param isForce
     */
    int updateVerionStatus(@Param("id") Integer id,@Param("isForce")Byte isForce);

    /**
     * 是否删除
     * @param id
     * @param isDeleted
     */
    int updateVerionDelete(@Param("id")Integer id,@Param("isDeleted")Byte isDeleted);
}
