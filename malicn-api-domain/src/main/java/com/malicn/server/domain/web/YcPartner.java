package com.malicn.server.domain.web;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.util.Date;

@Data
public class YcPartner  extends BasePo {

    private Integer id;

    private String name;

    private String mobile;

    private String city;

    private String companyName;

    private String workPosition;

    private String email;

    private String remark;

    private String clientIp;


}