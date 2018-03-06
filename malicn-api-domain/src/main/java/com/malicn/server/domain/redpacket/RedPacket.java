package com.malicn.server.domain.redpacket;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by yuanfei on 2017/5/23.
 */
@Data
public class RedPacket extends BasePo {

    //（ 0未领取 1 已领取  2已过期）
    public static final int NOT_RECEIVE = 0;
    public static final int RECEIVED = 1;
    public static final int EXPRIED = 2;

    private Long id;
    private Long carrierId;
    private BigDecimal amount;
    private Byte status;
    private String info;
    private Date createTime;
    private Date updateTime;
    private Byte isDeleted;
    private Date expriedTime;
}
