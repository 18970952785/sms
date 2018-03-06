package com.malicn.server.domain.user;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.security.acl.Owner;
import java.util.Date;

@Data
public class UserBase extends BasePo {

    public static final byte OWNER = 1;
    public static final byte DRIVER = 2;
    /**
     * 货主端APP
     */
    public static final  byte REG_FROM_OWNER =1 ;
    /**
     * 司机端APP
     */
    public static final byte REG_FROM_DRIVER=2;
    //马力后台
    public static final byte REG_FROM_WEB=3;

    //微信公众号
    public static final byte REG_FROM_WEIXIN = 4;

    public static final byte ACCOUNT_STATUS_CANUSE = 0;

    public static final byte ACCOUNT_STATUS_LOCK = 1;
    public static final byte ACCOUNT_STATUS_STANDBY = 2;

    private Long userId;
    private String userName;
    private String password;
    private String mobile;
    private String email;
    private int regFrom;        //注册来源
    private int deviceOs;       //操作系统
    private String deviceId;    //设备串号
    private String deviceType;  //设备型号
    private Date lastLoginTime;
    private int status;
    private String salt;
}