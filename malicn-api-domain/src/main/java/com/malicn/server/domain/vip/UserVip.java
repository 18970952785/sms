package com.malicn.server.domain.vip;

import com.malicn.server.domain.BasePo;
import com.malicn.server.enums.vip.VipName;
import lombok.Data;

import java.util.Date;

/**
 * Created by yanghuoyun on 2017/7/7.
 */
@Data
public class UserVip extends BasePo{

    //状态 1有效
    public static final byte STA_YX = 1;
    //状态 2已过期
    public static final byte STA_YGQ = 2;

    //自增id
    private Long id;
    //用户id
    private Long userId;
    // vip服务名称
    private VipName vipName;
    //状态 1有效  2已过期
    private Byte status;
    //到期时间
    private Date expiredTime;
    //抵用券发送次数
    private int couponNum;

    public UserVip(Long userId) {
        this.userId = userId;
    }

    public UserVip(Long userId,VipName vipName ) {
        this.userId = userId;
        this.vipName = vipName;
    }


    public UserVip() {
    }

    public UserVip(Long id, Long userId, VipName vipName, Byte status, Date expiredTime) {
        this.id = id;
        this.userId = userId;
        this.vipName = vipName;
        this.status = status;
        this.expiredTime = expiredTime;
    }
}
