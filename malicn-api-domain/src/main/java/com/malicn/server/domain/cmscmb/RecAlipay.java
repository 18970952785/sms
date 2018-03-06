package com.malicn.server.domain.cmscmb;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class RecAlipay {
    private Long flowId;

    private String shddh;

    private Byte ywlx;

    private String splx;

    private String mdbh;

    private String mdmc;

    private String ccy;

    private String zdh;

    private BigDecimal sjss;

    private BigDecimal zfbhb;

    private BigDecimal jfb;

    private BigDecimal zfbyh;

    private BigDecimal sjyh;

    private BigDecimal qhxje;

    private String qmc;

    private BigDecimal sjhbxf;

    private BigDecimal kxfje;

    private String tkpch;

    private BigDecimal fwf;

    private BigDecimal fr;

    private Date createTime;

    public Long getFlowId() {
        return flowId;
    }

    public void setFlowId(Long flowId) {
        this.flowId = flowId;
    }

    public String getShddh() {
        return shddh;
    }

    public void setShddh(String shddh) {
        this.shddh = shddh == null ? null : shddh.trim();
    }

    public Byte getYwlx() {
        return ywlx;
    }

    public void setYwlx(Byte ywlx) {
        this.ywlx = ywlx;
    }

    public String getSplx() {
        return splx;
    }

    public void setSplx(String splx) {
        this.splx = splx == null ? null : splx.trim();
    }

    public String getMdbh() {
        return mdbh;
    }

    public void setMdbh(String mdbh) {
        this.mdbh = mdbh == null ? null : mdbh.trim();
    }

    public String getMdmc() {
        return mdmc;
    }

    public void setMdmc(String mdmc) {
        this.mdmc = mdmc == null ? null : mdmc.trim();
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy == null ? null : ccy.trim();
    }

    public String getZdh() {
        return zdh;
    }

    public void setZdh(String zdh) {
        this.zdh = zdh == null ? null : zdh.trim();
    }

    public BigDecimal getSjss() {
        return sjss;
    }

    public void setSjss(BigDecimal sjss) {
        this.sjss = sjss;
    }

    public BigDecimal getZfbhb() {
        return zfbhb;
    }

    public void setZfbhb(BigDecimal zfbhb) {
        this.zfbhb = zfbhb;
    }

    public BigDecimal getJfb() {
        return jfb;
    }

    public void setJfb(BigDecimal jfb) {
        this.jfb = jfb;
    }

    public BigDecimal getZfbyh() {
        return zfbyh;
    }

    public void setZfbyh(BigDecimal zfbyh) {
        this.zfbyh = zfbyh;
    }

    public BigDecimal getSjyh() {
        return sjyh;
    }

    public void setSjyh(BigDecimal sjyh) {
        this.sjyh = sjyh;
    }

    public BigDecimal getQhxje() {
        return qhxje;
    }

    public void setQhxje(BigDecimal qhxje) {
        this.qhxje = qhxje;
    }

    public String getQmc() {
        return qmc;
    }

    public void setQmc(String qmc) {
        this.qmc = qmc == null ? null : qmc.trim();
    }

    public BigDecimal getSjhbxf() {
        return sjhbxf;
    }

    public void setSjhbxf(BigDecimal sjhbxf) {
        this.sjhbxf = sjhbxf;
    }

    public BigDecimal getKxfje() {
        return kxfje;
    }

    public void setKxfje(BigDecimal kxfje) {
        this.kxfje = kxfje;
    }

    public String getTkpch() {
        return tkpch;
    }

    public void setTkpch(String tkpch) {
        this.tkpch = tkpch == null ? null : tkpch.trim();
    }

    public BigDecimal getFwf() {
        return fwf;
    }

    public void setFwf(BigDecimal fwf) {
        this.fwf = fwf;
    }

    public BigDecimal getFr() {
        return fr;
    }

    public void setFr(BigDecimal fr) {
        this.fr = fr;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}