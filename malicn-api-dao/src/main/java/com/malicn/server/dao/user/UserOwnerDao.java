package com.malicn.server.dao.user;

import com.malicn.server.dao.balance.BaseQueryDTO;
import com.malicn.server.domain.user.UserDriver;
import com.malicn.server.domain.user.UserOwner;
import com.malicn.server.domain.vip.VipRelation;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/***
 * 对应数据库的ml_user_owner表
 */
public interface UserOwnerDao {
    int deleteByPrimaryKey(Long userId);

    /**
     * 第一次认证新增数据
     * @param userOwner
     * @return
     */
    int insert(UserOwner userOwner);

    int insertSelective(UserOwner record);

    UserOwner selectByPrimaryKey(Long userId);

    /**
     * 获取认真信息和货主信息
     * @param userId
     * @return
     */
    UserOwner selectByUserId(long userId);

    int updateByPrimaryKeySelective(UserOwner record);

    int updateByPrimaryKey(UserOwner record);

    /**
     * @描述: 根据VIP关联表中的用户ID查询用户信息
     * @author qun.xu
     * @param dtos
     * @return
     */
    List<UserOwner> getOwnerList(List<BaseQueryDTO> dtos);

    /**
     * 根据电话号码查询货主信息
     * @param mobile        电话号码
     * @return
     */
    UserOwner getByMobile(String mobile);


    UserOwner getUserOwnerByIdCard(String idCard);

    /**
     * 根据名字和电话模糊查询
     * @param wd
     * @return
     */
    List<UserOwner> getByOwnerInfo(@Param("wd") String wd);



    @MapKey("userId")
    Map<Integer,UserOwner> getUserOwnerByList(List list);


    /**
     * 基础信息，货主信息查询\搜索货主
     * @param mobile
     * @param realName
     * @param companyName
     * @return
     */
    List<UserOwner> listUserOwnerByParams(@Param("mobile") String mobile,
                                          @Param("realName") String realName,
                                          @Param("companyName") String companyName,
                                          @Param("idStatus") Byte idStatus);

    int updateByAudit(UserOwner userOwner);

    int updateAuthStatus(@Param("userId") Long userId,
                         @Param("authStatus")Byte authStatus);
}