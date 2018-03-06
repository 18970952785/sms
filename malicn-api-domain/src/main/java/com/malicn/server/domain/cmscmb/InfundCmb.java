package com.malicn.server.domain.cmscmb;

import lombok.Data;

import java.util.Date;

/**
 * @version V1.0
 * @Package: com.malicn.server.domain.cmscmb
 * @Description: 银行收款流水
 * @author: zengdd
 * @date: 2017/9/5 9:14
 */
@Data
public class InfundCmb {
    /**
     * 主键id
     */
    public Long flowId;
    /**
     * 交易类型
     */
    public String transactionType;
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
