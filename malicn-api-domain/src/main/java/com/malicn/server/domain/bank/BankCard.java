package com.malicn.server.domain.bank;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.util.Date;

/**
 * Created by dingchangjiang on 2017/5/23.
 */
@Data
public class BankCard extends BasePo {
    private Long id;
    private Long userId;
    private Integer bankId;
    private String accountName;     //账户名 收款人
    private String bankCardNo;      //银行卡号
    private Date createTime;
    private Date updateTime;
    private Byte isDeleted;          //0:否
    private String bankName;         //银行名称
    private String bankCode;          //银行行号
    private String bankIcon;         //银行图标
    private String bankShortName;       //银行简称
    private Integer regionId;      //区域id
    private byte userType;   //用户类型 1.货主2.司机3.报价人 4、其他收款


    private  String updatorName;
    private  String creatorName;

    public static final byte USER_OWNER = 1;
    public static final byte USER_DRIVER= 2;
    public static final byte USER_MAKER = 3;
    public static final byte USER_OTHER=4;

    private String otherMobile;  //其他收款账号的 类型电话

    //链表字段
    private String mobile;  //号码

    private String regionName;
}
