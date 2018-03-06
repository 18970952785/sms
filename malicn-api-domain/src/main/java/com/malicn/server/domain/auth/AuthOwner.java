package com.malicn.server.domain.auth;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.util.Date;


@Data
public class AuthOwner extends AuthBase {
    private Long id;
    private Long userId;
    private Byte authType;
    private String realName;
    private String idCard;
    private String personalImg;
    private String companyName;
    private String companyImg;
    private Byte auditStatus;
    private String auditRemark;
    private Date auditTime;

    /*** 外加字段 ****/
    private String mobile;
}