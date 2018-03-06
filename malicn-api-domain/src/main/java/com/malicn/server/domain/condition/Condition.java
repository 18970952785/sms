package com.malicn.server.domain.condition;

import com.malicn.server.domain.BasePo;
import com.malicn.server.enums.condition.RuleEnum;
import com.malicn.server.enums.sys.CompareEnums;
import com.malicn.server.enums.condition.CondCatgryEnum;
import lombok.Data;

@Data
public class Condition extends BasePo{
    private static final long serialVersionUID = -1263747476970599967L;
    /** 条件ID **/
    private Integer id;

    /** 条件分类 **/
    private CondCatgryEnum category;

    /**规则类型**/
    private RuleEnum ruleEnum;

    /** 条件名称 **/
    private String name;

    /** 条件描述 **/
    private String info;

    /** 条件字段 **/
    private String filed;

    /** 比较条件 大于 等于 小于 **/
    private CompareEnums compare;

    /** 条件阀值 **/
    private String value;
}