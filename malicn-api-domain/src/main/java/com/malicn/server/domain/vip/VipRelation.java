package com.malicn.server.domain.vip;

import com.malicn.server.domain.BasePo;
import com.malicn.server.enums.vip.VipName;
import lombok.Data;

/**
 * Created by xieqiujin on 2017/7/7.
 */
@Data
public class VipRelation extends BasePo {
    //主键
    private Long id;
    //用户ID
    private Long userId;
    //推荐人VIP主键
    private Long userVipId;
    //被推荐人用户ID
    private Long refereeId;
    //被推荐人VIP主键
    private Long refereeVipId;
    //建立关系时，放入VIPname
    private VipName vipName;
}
