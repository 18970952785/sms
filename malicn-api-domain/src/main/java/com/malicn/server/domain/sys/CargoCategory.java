package com.malicn.server.domain.sys;

import com.malicn.server.domain.BasePo;
import lombok.Data;

@Data
public class CargoCategory  extends BasePo{

    /** 货物品种ID **/
    private Integer id;

    /** 货物品种名称 **/
    private String name;
}