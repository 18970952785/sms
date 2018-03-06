package com.malicn.server.dao.user;

import com.malicn.server.dao.balance.BaseQueryDTO;
import com.malicn.server.domain.bank.Bank;
import com.malicn.server.domain.user.UserDriver;
import com.malicn.server.mybatis.page.QueryPage;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author yuanfei
 * @version 1.0
 * @description: 司机表DAO接口
 * @since: 2017-4-27 16:53:25
 */
public interface UserDriverDao {

    /**
     * 新增司机
     *
     * @param userDriver
     * @return
     */
    int saveUserDriver(UserDriver userDriver);

    int insertSelective(UserDriver userDriver);

    /**
     * 更新司机
     *
     * @param userDriver
     * @return
     */
    int updateUserDriver(UserDriver userDriver);

    /**
     * 更新司机状态
     *
     * @param driverId 司机ID
     * @return
     */
    int updateDriverStatus(@Param("driverId") Long driverId,
                           @Param("driverStatus") byte driverStatus);

    /**
     * 之前未认证的司机
     * 清楚个体司机的认证信息
     *
     * @return
     */
    int updateCleanDriverInfo(@Param("driverId") Long driverId);

    /**
     * 查询
     *
     * @param driverId 司机id
     * @return
     */
    UserDriver get(Long driverId);

    /**
     * 查询司机
     *
     * @param driverId 司机id
     * @return
     */
    UserDriver getDriverInfo(Long driverId);

    /**
     * 查询司机类别
     *
     * @param driverId
     * @return
     */
    UserDriver getDriverTypeById(Long driverId);

    /**
     * @param dtos
     * @return
     * @描述: 根据查询对象 List批量查询
     * @author qun.xu
     */
    List<UserDriver> getDriverList(List<BaseQueryDTO> dtos);

    /**
     * 根据身份证号码查询是否已被使用
     * @param idCard
     * @return
     */
    UserDriver getUserDriverByIdCard(String idCard);

    /**
     * 加载司机信息列表并进行分页
     * @param authStatus    司机认证状态
     * @param driverMobile  司机电话
     * @param driverName    司机姓名
     * @return
     */
    List<UserDriver> listDriverInfo(@Param("authStatus") Byte authStatus,
                                    @Param("driverMobile") String driverMobile,
                                    @Param("driverName") String driverName);

    /**
     * 根据条件模糊搜索司机
     * @param wd
     * @return
     */
    List<UserDriver> getByUserDriverInfo(@Param("wd") String wd);


    @MapKey("userId")
    Map<Integer,UserDriver> getUserDriverByList(List list);

    int updateAuthStatus(@Param("driverId") Long driverId,
                         @Param("authStatus") byte authStatus);
}