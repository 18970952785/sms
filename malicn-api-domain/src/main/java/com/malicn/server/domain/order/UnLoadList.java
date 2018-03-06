package com.malicn.server.domain.order;

import com.malicn.server.domain.BasePo;
import lombok.Data;

@Data
public class UnLoadList extends BasePo{

    /** 订单ID **/
    private Long orderId;

    /** 卸货照片 **/
    private String unloadPics;

    /** 入库照片 **/
    private String cargoPics;

    /** 司机签名 **/
    private String driverSign;

    /** 司机ID **/
    private Long driverId;

    /** 司机姓名 **/
    private String driverName;
}