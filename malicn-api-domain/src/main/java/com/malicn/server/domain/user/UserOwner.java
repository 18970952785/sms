package com.malicn.server.domain.user;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserOwner extends UserBase{

   // 货主类型  1 普通  2 月结客户 3 大客户

    public static final int  OWNER_TYPE_COMMON = 1;
    public static final int  OWNER_TYPE_MONTH = 2;
    public static final int  OWNER_TYPE_BIG = 3;


    /**
     * 状态：身份未确定
     */
    public static final byte ID_WQD = 0;
    /**
     * 状态：身份已确定
     */
    public static final byte ID_YQD = 1;

    public static final byte TYPE_GR = 1;
    public static final byte TYPE_GS = 2;


    /**
     * 货主类型 1普通 2公司
     */
    private Integer ownerType;


    /** 身份证号码 **/
    private String idCard;

    /** 真实姓名 **/
    private String realName;

    /** 头像 **/
    private String headImg;
    /**
     * 信用额度
     */
    private BigDecimal creditLine;

    /**
     * 处理中订单总额上限：超过不能再下单
     */
    private BigDecimal ordingAmountLine;

    /**
     * 用户认证状态  1审核通过  2审核不通过
     */
    private Byte personalAuthStatus;

    /**
     * 个人照片
     */
    private String personalImg;

    /**
     *  公司认证状态 1审核通过  2审核不通过
     */
    private Byte companyAuthStatus;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 公司照片
     */
    private String companyImg;

    /**
     * 认证通过时间
     */
    private Date authPassTime;

    /**
     * 身份状态  0 身份未确定  1 身份确定
     */
    private Byte idStatus;

    private BigDecimal balance;

    private String auditRemark;

    private String info;

    private int  provinceId;

    private String  provinceName;

    private int cityId;

    private String cityName;

    public static String convertOwnerType(Byte ownerType) {
        String ownerTypeStr = "";
        switch (ownerType) {
            case TYPE_GR:
                ownerTypeStr = "个人";
                break;
            case TYPE_GS:
                ownerTypeStr = "公司";
                break;
        }
        return ownerTypeStr;
    }

    public static String convertIdStatus(Byte idStatus) {
        String idStatusStr = "";
        switch (idStatus) {
            case ID_WQD:
                idStatusStr = "未认证";
                break;
            case ID_YQD:
                idStatusStr = "已认证";
                break;
        }
        return idStatusStr;
    }
}