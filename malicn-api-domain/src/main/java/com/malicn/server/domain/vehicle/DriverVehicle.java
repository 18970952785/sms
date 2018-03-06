package com.malicn.server.domain.vehicle;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class DriverVehicle extends Vehicle{

    private String driverName;

    private String driverMobile;

    private Long vehicleId;

    private String carrierName;

}