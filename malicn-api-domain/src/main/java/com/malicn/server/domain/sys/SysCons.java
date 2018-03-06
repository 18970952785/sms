package com.malicn.server.domain.sys;

import com.malicn.server.domain.BasePo;
import com.malicn.server.enums.sys.ConsEnum;
import lombok.Data;

@Data
public class SysCons extends BasePo{

    private static final long serialVersionUID = 4633747475970585969L;

    private String idKey;
    private ConsEnum module;
    private String name;
    private String value;
}