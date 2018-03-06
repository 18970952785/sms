package com.malicn.server.domain.storage;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.io.Serializable;

@Data
public class Storage extends BasePo {

    private static final long serialVersionUID = 4633747475970599969L;

    public static final byte TYPE_XT = 1;
    public static final byte TYPE_GR = 2;

    private Long id;
    private Byte type;
    private Long userId;
    private String name;
    private String regionId;
    private String address;
    private String enName;
    private Byte isHot;
    private String regionName;  //城市代码相对应的城市名称  表里没有改字段
    private String creatorName; //创建者
}