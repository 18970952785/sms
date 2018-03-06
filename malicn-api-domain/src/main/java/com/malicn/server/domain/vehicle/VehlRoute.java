package com.malicn.server.domain.vehicle;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class VehlRoute extends BasePo {

    private Long id;

    private Long vehicleId;

    private Integer routeId;

    private Integer startId;

    private String startName;

    private Integer arriveId;

    private String arriveName;

    private BigDecimal unitPrice;

    private Date createTime;

    private Date updateTime;

}