package com.malicn.server.domain.sys;

import lombok.Data;

import java.io.Serializable;

@Data
public class Region implements Serializable {

    /**主键**/
    private Integer id;
    /**地区代码**/
    private String code;
    /**地区名称**/
    private String name;
    /** 短名称 **/
    private String shortName;
    /**父级主键**/
    private Integer parentId;
    /**级别**/
    private Integer level;
    /**是否直辖市  0否 1是**/
    private Byte isCentral;
    /**排序**/
    private Integer sort;
    /**英文名称**/
    private String enName;
    /**英文简称**/
    private String enShortName;
    /**上级简称**/
    private String parentShortName;
}
