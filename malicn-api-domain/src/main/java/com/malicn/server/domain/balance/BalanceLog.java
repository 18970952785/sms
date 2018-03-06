package com.malicn.server.domain.balance;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by dingchangjiang on 2017/5/23.
 */
/**
 * 个人中心 余额页信息*/
@Data
public class BalanceLog extends BasePo{

    /**详细信息状态*/
    public final static Byte ORDER_CREATE = 1;
    public final static Byte ORDER_CANCEL = 2;
    public final static Byte WITHDRAW_APPLY = 3;
    public final static Byte WITHDRAW_FAILD = 4;
    public final static Byte RECEIVE_REDPACKET = 5;

    /**
     * 查看类型状态
     * */
    public final static Integer All = 0;
    public final static Integer WITHDRAW = 1;

    private Long id;
    private Long userId;           //司机id
    private Byte userType;           //司机id
    private String title;            //标题
    private Byte type;              //类型
    private String content;         //内容
    private BigDecimal amount;      //金额
    private Long referId;           //关联id
    private Date createTime;
    private Byte isDeleted;        //是否删除: 0=否
}
