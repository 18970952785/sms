package com.malicn.server.domain.order;

import com.malicn.server.domain.BasePo;
import lombok.Data;

@Data
public class LoadList extends BasePo{

    /** 订单ID **/
    private Long orderId;

    /** 装货照片 多张数组 **/
    private String shipPics;

    /** 唛头照片 数组 **/
    private String markPics;

    /** 出库照片 数组 **/
    private String cargoPics;

    /** 司机ID **/
    private Long driverId;

    /** 司机姓名 **/
    private String driverName;
}