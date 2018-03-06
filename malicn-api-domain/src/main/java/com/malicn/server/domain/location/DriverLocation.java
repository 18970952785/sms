package com.malicn.server.domain.location;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
@Data
public class DriverLocation extends BasePo{
    private Long id;

    private Long driverId;

    private Byte driverStatus;

    private BigDecimal lng;

    private BigDecimal lat;


    //链表查询字段
    private String userName;
    private String route;
}