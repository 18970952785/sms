package com.malicn.server.dao.vip;


import com.malicn.server.domain.order.Order;
import com.malicn.server.domain.vip.UserVip;
import com.malicn.server.enums.vip.VipName;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface UserVipDao {

    /**
     * 保存用户vip信息
     * @param userVip
     * @return
     */
    int saveUserVip(UserVip userVip);

    /**
     * 更新用户vip信息
     * @param userVip
     * @return
     */
    int updateUserVip(UserVip userVip);

    /**
     * 根据主键查找vip信息
     * @param vipId
     * @return
     */
    UserVip getUserVip(@Param("vipId")Long vipId);

    /**
     * 根据用户id和服务类型查找
     * @param userId
     * @param vipName
     * @return
     */
    UserVip getUserVipByName(@Param("userId") Long userId, @Param("vipName") VipName vipName);

    /**
     * 根据用户VIP对象查找Vip信息，由于可能同一个用户开通多处服务
     * @author qun.xu
     * @param  userVip
     * @return
     */
    List<UserVip> getUserVips(UserVip userVip);


    /**
     * 会员过期
     * @author qun.xu
     * @param  date
     * @return
     */
    int expiredVip(@Param("now")Date date);

    /**
     * 查询所有在有效期的已开通冷运管家并且发送抵用券次数小于6的用户
     * @return
     */
    List<UserVip> listUserVipsByStatus(VipName vipName);

    /**
     * 更新VIP发送抵用券次数
     */
    int updateCouponNum(Long vipId);
}