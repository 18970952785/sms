package com.malicn.server.dao.balance;

import com.malicn.server.domain.user.UserBase;
import com.malicn.server.enums.vip.VipName;

/**
 * @author qun.xu
 * @date 2017.07.08
 * @描述: 余额查询DTO
 */
public class BaseQueryDTO {

    private Long userId;

    private VipName vipName;

    private byte userType;


    public BaseQueryDTO() {
    }


    public BaseQueryDTO(Long userId) {
        this.userId = userId;
    }

    public BaseQueryDTO(byte userType, Long userId) {
        if (userType == UserBase.OWNER) {
            this.vipName = VipName.manageOwner;
        } else if (userType == UserBase.DRIVER) {
            this.vipName = VipName.superDriver;
        }
        this.userId = userId;
        this.userType = userType;
    }



    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}
