package com.malicn.server.dao.cmsorder;

import com.malicn.server.domain.cmsorder.CmsOrderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by zengdingding on 2017/7/27.
 */

public interface CmsOrderInfoDao {
    /**
     * 获取订单列表
     * @return 集合
     */
    List<CmsOrderInfo> getListOrderInfo(@Param("productName")String productName,
                                        @Param("date")Date date);
    /**
     * 根据订单号获取订单
     * @param order_id
     * @return
     */
    CmsOrderInfo getOrderInfoByOrderId(long order_id);

    /**
     * 获取所有订单月份分组
     * @return
     */
    List<String> getOrderInfoGroupByMonths();
}
