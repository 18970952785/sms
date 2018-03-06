package com.malicn.server.domain.order;

import com.malicn.server.domain.BasePo;
import lombok.Data;

@Data
public class OrderTrack extends BasePo{

    /** 主键ID **/
    private Long id;

    /** 订单ID **/
    private Long orderId;

    /** 模板ID **/
    private Integer modelId;

    /** 上一个状态 **/
    private Byte oldStatus;

    /** 目前状态 **/
    private Byte newStatus;

    /** 副标题说明内容 **/
    private String info;

    /** 操作人 **/
    private String creatorName;

}