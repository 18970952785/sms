package com.malicn.server.domain.sys;

import com.malicn.server.domain.BasePo;
import lombok.Data;

@Data
public class HomeLink extends BasePo{
    /** 客户端类型 1货主端 **/
    public static final Byte CLIENT_OWNER = 1;
    /** 客户端类型 2司机端 **/
    public static final Byte CLIENT_DRIVER = 2;

    private static final long serialVersionUID = 4633747485200599967L;
    /** 消息ID **/
    private Integer id;

    /** 主标题 **/
    private String title;

    /** icon图片地址 **/
    private String image;

    /** 副标题内容 **/
    private String content;

    /** 链接地址 **/
    private String link;

    /** 显示条件 条件ID数组 **/
    private String conditions;

    /** 客户端类型 1货主端 2司机端 **/
    private Byte clientType;

    /** 排序 **/
    private Integer sort;
}