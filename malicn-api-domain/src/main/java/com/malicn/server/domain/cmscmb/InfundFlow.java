package com.malicn.server.domain.cmscmb;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @version V1.0
 * @Package: com.malicn.server.domain.cmscmb
 * @Description: 收款流水主表
 * @author: zengdd
 * @date: 2017/9/5 9:04
 */
@Data
public class InfundFlow extends BasePo{

    public static final byte WHX = 1;
    public static final byte BFHX = 2;
    public static final byte WQHX = 3;

    public static final byte ZSYH = 1;
    public static final byte ALIPAY = 2;
    public static final byte WEIXIN = 3;
    public static final byte NYYH = 4;

    public static final byte JKLQ = 1;
    public static final byte XSZF = 2;
    public static final byte WJDR = 3;

    /**
     * 主键
     */
    public Long id;
    /**
     * 付款方式
     */
    public Byte payType;
    /**
     * 流水号
     */
    public String flowNo;
    /**
     * 付款姓名
     */
    public String payName;
    /**
     * 付方账号
     */
    public String payAccount;
    /**
     * 金额
     */
    public BigDecimal amount;
    /**
     * 摘要
     */
    public String remark;
    /**
     * 交易时间
     */
    public Date payTime;
    /**
     * 核销状态
     */
    public Byte chargeStatus;
    /**
     * 来源类型（1. 接口拉取 2.线上支付  3.文件导入 ）
     */
    public Byte fromType;

    /**
     * 创建时间
     */
    public Date createTime;
    /**
     * 创建者
     */
    public String creatorName;
    /**
     * 修改人
     */
    public String updatorName;


    public Integer creator;

}
