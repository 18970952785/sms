package com.malicn.server.domain.order;

import com.malicn.server.domain.BasePo;
import lombok.Data;

/**
 * 模板
 */
@Data
public class OrderTrackModel extends BasePo{

    private static final long serialVersionUID = 4633747476970599967L;

    public static final int TYPE_OWNER = 1;
    public static final int TYPE_CARRIER = 2;


    /** 模板ID **/
    private Integer id;

    /** 步骤 **/
    private Integer step;

    /** 模板名称 **/
    private String name;

    /** 标题文案 **/
    private String title;

    /** 模板类型 **/
    private Byte type;

    /** 副标题 **/
    private String info;
}