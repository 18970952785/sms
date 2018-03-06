package com.malicn.server.domain.cmsorder;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by zengdingding on 2017/8/21.
 * 订单后台 -订单详情
 */
@Data
public class CmsOrderDetails {
    /**
     * 订单号
     */
    public long orderId;
    /**
     * 类别
     */
    public String cargoCtgryName;
    /**
     * 品名
     */
    public String productName;
    /**
     * 件数
     */
    public Integer piecesNum;
    /**
     * 单件重量
     */
    public BigDecimal singleWeight;
    /**
     * 工厂编号
     */
    public String factoryNumber;
    /**
     * 生产日期
     */
    public Date productionTime;
    /**
     * 原产地
     */
    public String placeOrigin;

    /**
     * 唛头照片
     */
    public String markPics;
}
