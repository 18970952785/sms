package com.malicn.server.serbean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by xieqiujin on 2017/6/15.
 */
@Data
public class HistoryContact implements Serializable{
    private static final long serialVersionUID = 4633748975971015969L;
    private String contact;          //联系人
    private String contactMobile;   //联系人电话
    private Byte type;               // 1.发货  2.收货
    private Long userId;            // 用户ID
    private Integer regionId;       // 城市ID
}
