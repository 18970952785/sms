package com.malicn.server.serbean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by xieqiujin on 2017/5/9.
 */
@Data
public class FindVehicle implements Serializable{

    private static final long serialVersionUID = 4633748975970599969L;

    private Long upFindVehicleNumTime;

    private Integer findVehicleNum;

}
