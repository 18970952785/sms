package com.malicn.server.dao.vip;


import com.malicn.server.domain.vip.UserVip;
import com.malicn.server.domain.vip.VipRelation;
import com.malicn.server.enums.vip.VipName;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VipRelationDao {

    /**
     * @描述:  根据VIP中的vipId查询所有被推荐的用户
     * @author qun.xu
     * @param  vipId
     * @return
     */
    List<VipRelation> getRelationsByVipId(Long vipId);

    /**
     * @描述:  根据VIP中的vipId查询所有被推荐的用户
     * @author qun.xu
     * @param  vipId
     * @return
     */
    List<VipRelation> getRelationsByVipIdLimit(Long vipId);


    /**
     * @描述:  共推荐的朋友总数
     * @author qun.xu
     * @param  userVip
     * @return
     */
     Long getRelationsCount(UserVip userVip);


    /**
     * @描述:  查询前几，方便扩展
     * @author qun.xu
     * @param userVip
     * @return
     */
    List<VipRelation> getRelationsLimit(UserVip userVip);

    /**
     * @描述:  根据推荐refereeVipId 查找推荐人
     * @author qun.xu
     * @param  refereeVipId 被推荐人的vipId
     * @return
     */
    VipRelation getRecomRelation(@Param("refereeVipId")Long refereeVipId);

    /**
     * 建立推荐人和被推荐人关系
     * @param vipRelation
     * @return
     */
    int saveVipRelation(VipRelation vipRelation);


}