package com.malicn.server.domain.auth;

import lombok.Data;

import java.util.Date;
@Data
public class AuthDriver extends AuthBase{

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 司机ID
     */
    private Long driverId;

    /**
     * 司机真实头像
     */
    private String headImg;

    /**
     * 司机真是姓名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 驾驶证照片
     */
    private String licnImg;

    /**
     * 驾驶证过期时间
     */
    private Date licnExpDate;

    /**
     * 审核状态 0 待审核  1审核通过  2审核不通过
     */
    private Byte auditStatus;

    /**
     * 审核备注
     */
    private String auditRemark;

    /**
     * 审核时间
     */
    private Date auditTime;

    private String mobile;


}