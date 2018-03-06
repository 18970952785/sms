package com.malicn.server.dao.cmsorder;

import com.malicn.server.domain.cmsorder.CmsOrderDetails;

import java.util.List;

/**
 * Created by zengdingding on 2017/8/21.
 */
public interface CmsOrderDetailsDao {
    List<CmsOrderDetails> getOrderDetailsListByOrderId(Long orderId);
}
