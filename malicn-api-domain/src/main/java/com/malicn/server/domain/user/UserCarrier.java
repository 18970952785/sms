package com.malicn.server.domain.user;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: 议价者(接单人)表实体类
 * @author yuanfei
 * @since: 2017-4-29 17:37:26
 * @version 1.0
 */
@Data
public class UserCarrier extends UserBase {

    public static final Byte PERSONAL = 1;  //个人
    public static final Byte MANAGER =2;    //经纪人
    public static final Byte COMPANY =3;    //物流公司

    private Long userId;						    // 车主id
    private Byte carrierType;						// 议价者类型 1
    private BigDecimal balance;						// 账户余额
    private BigDecimal preBalance;                  // 预结算余额
    private String idImg;						    // 身份证照片
    private String idCard;						    // 身份证号码
    private String realName;						// 真实姓名
    private String companyName;						// 公司全称
    private String companyImg;						// 公司执照照片
    private Byte personalAuthStatus;				// 个人认证状态
    private Byte companyAuthStatus;					// 公司认证状态
    private Date authPassTime;						// 认证通过时间
}