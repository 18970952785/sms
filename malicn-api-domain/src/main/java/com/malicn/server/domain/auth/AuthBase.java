package com.malicn.server.domain.auth;

import com.malicn.server.domain.BasePo;

/**
 * Created by yanghuoyun on 2017/5/24.
 */
public class AuthBase extends BasePo{

    public static final byte PERSONAL = 1;
    public static final byte COMPANY = 2;
    
    //认证状态-待审核
    public static final Byte STATUS_DSH = 0;
    //认证状态-已通过
    public static final Byte STATUS_YTG = 1;
    //认证状态-不通过
    public static final Byte STATUS_BTG = 2;
    //认证状态-已废弃
    public static final Byte STATUS_YFQ = 3;

    public static String convertAuthType(byte authType) {
        String authTypeStr = "";
        switch (authType) {
            case PERSONAL:
                authTypeStr = "个人";
                break;
            case COMPANY:
                authTypeStr = "公司";
                break;
        }
        return authTypeStr;
    }

    public static String convertAuditStatus(byte auditStatus) {
        String auditStatusStr = "";
        if (auditStatus == 0) {
            auditStatusStr = "待审核";
        } else if (auditStatus == 1) {
            auditStatusStr = "已通过";
        } else if (auditStatus == 2) {
            auditStatusStr = "不通过";
        } else if (auditStatus == 3) {
            auditStatusStr = "已废弃";
        }
        return auditStatusStr;
    }
}
