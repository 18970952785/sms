package com.malicn.server.domain.sys;

import lombok.Data;

import java.util.Date;

/**
 * Created by xieqiujin on 2017/4/28.
 */
@Data
public class Version {

    public static final byte IS_FORCE = 1;

    private Integer id;

    private String name;

    private String version;

    private Long versionCode;

    private Byte clientType;

    private Byte osType;

    private String versionType;

    private String url;

    private String content;

    private Byte isForce;

    private Byte status;

    private Date issueTime;

    private Date createTime;

    private Date updateTime;

    private Byte isDeleted;


    public static String getclientTypeString(Byte clientType){
        String clientTypeName=null;
        switch(clientType){
            case 1:{
                clientTypeName="货主端";
                break;
            }
            case 2:{
                clientTypeName="车主端";
                break;
            }
        }
        return clientTypeName;
    }
    public static String getosTypeString(Byte osType){
        String osTypeName=null;
        switch(osType){
            case 1:{
                osTypeName="安卓";
                break;
            }
            case 2:{
                osTypeName="IOS";
                break;
            }
        }
        return osTypeName;
    }

    public static String getVersionStatus(Byte status){
        String statusName=null;
        switch(status){
            case 0:{
                statusName="新建";
                break;
            }
            case 1:{
                statusName="已发布";
                break;
            }
            case 2:{
                statusName="已下架";
                break;
            }
        }
        return statusName;
    }









}
