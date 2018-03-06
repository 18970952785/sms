package com.malicn.server.dao.user;

import com.malicn.server.domain.user.UserBase;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserBaseDao {


    int insert(UserBase record);

    int insertSelective(UserBase record);

    int updateByPrimaryKeySelective(UserBase record);

    int updateByPrimaryKey(UserBase record);

    /**
     * 根据电话查询用户信息
     * @param mobile 电话号码
     * @return
     */
    UserBase selectByMobile(@Param("mobile") String mobile);

    /**
     * 根据电话号码模糊查询用户信息
     */
    List<UserBase> dimSelectByMobile(@Param("mobile") String mobile);

    /**
     * 更新最后登录时间
     * @param mobile 电话号码
     * @return
     */
    int updateLastLoginTime(String mobile);

    /**
     * 根据userID查询我的信息
     * @param userId
     * @return
     */
    UserBase selectByUserId(long userId);

    /**
     * 根据userId 查询密码和salt
     * @param userId
     * @return
     */
    UserBase selectPwdSaltById(long userId);

    /**
     * 修改我的信息
     * @param userId 用户ID
     * @param headImg 用户头像云储存地址
     * @return
     */
    int updateMyInfoById(@Param("userId")long userId,
                         @Param("headImg")String headImg);

    /**
     * 忘记密码 修改密码
     * @param mobile    手机号码
     * @param newPwd    新密码
     * @return
     */
    int updatePwdByMobile(@Param("mobile")String mobile,
                          @Param("newPwd")String newPwd,
                          @Param("salt")String salt);

    /**
     * 根据已知的密码修改密码
     * @param userId    用户ID
     * @param newPwd    新密码
     * @param salt      盐值
     * @return
     */
    int updatePwdByUserId(@Param("userId")long userId,
                          @Param("newPwd")String newPwd,
                          @Param("salt")String salt);

    /**
     * 修改用户手机号码
     * @param userId    用户ID
     * @param newMobile 新手机号码
     * @return
     */
    int updateMobileByUserId(@Param("userId")long userId,
                             @Param("newMobile")String newMobile);


    @MapKey("userId")
    Map<Integer,UserBase> getUserBaseMapByList(List list);

    @MapKey("userId")
    Map<Integer,UserBase>getMapByOrderOwners(List list);


}