package com.malicn.server.domain.cloudStorage;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by xieqiujin on 2017/10/24.
 */
@Data
public class ResLook extends BasePo{
    private Long id;

    private Long storageId;

    private String conPerson;

    private String conTel;

    private Date lookStorDate;

    private Integer lookStorPeople;

    private BigDecimal areaRequired;

    private String remarks;

    private String storageName;
    private String storageAddress;
}
