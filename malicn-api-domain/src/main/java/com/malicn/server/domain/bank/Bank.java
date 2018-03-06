package com.malicn.server.domain.bank;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.util.Date;

/**
 * Created by yuanfei on 2017/5/23.
 */
@Data
public class Bank extends BasePo {
    private Integer id;
    private String name;
    private String shortName;
    private String firstChar;        //拼音首字母
    private String icon;            //图标
    private String code;            //编码
    private Boolean isHot;          //是否热门
}
