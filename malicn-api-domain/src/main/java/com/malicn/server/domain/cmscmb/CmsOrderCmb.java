package com.malicn.server.domain.cmscmb;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zengdingding on 2017/8/25.
 */
@Data
public class CmsOrderCmb {
    /**
     * 自增长主键
     */
    public Long id;
    /**
     * 订单号
     */
    public Long orderId;
    /**
     * 银行流水号
     */
    public String serialId;
    /**
     * 金额
     */
    public BigDecimal trsamtc;
    /**
     * 交易时间
     */
    public Date transactionTime;
    /**
     * 交易类型
     */
    public String transactionType;
    /**
     * 摘要
     */
    public String naryur;
    /**
     * 流程实例号
     */
    public String reqnbr;

    /**
     * 业务名称
     */
    public String busnam;
    /**
     * 用途
     */
    public String nusage;
    /**
     * 业务参考号
     */
    public String yurref;
    /**
     * 业务摘要
     */
    public String busnar;
    /**
     * 付方开户地区
     */
    public String crpybbk;
    /**
     * 付方姓名
     */
    public String rpynam;
    /**
     * 付方账户
     */
    public String rpyacc;
    /**
     * 付方开户行号
     */
    public String rpybbn;
    /**
     * 付方开户行名
     */
    public String rpybnk;
    /**
     * 付方开户地址
     */
    public String rpyadr;
    /**
     * 票据号
     */
    public String chknbr;
    /**
     * 创建时间
     */
    public Date createTime;

}
