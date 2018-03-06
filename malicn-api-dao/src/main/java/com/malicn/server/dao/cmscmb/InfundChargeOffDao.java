package com.malicn.server.dao.cmscmb;

import com.malicn.server.domain.cmscmb.InfundChargeOff;

import java.util.List;

/**
 * Created by xieqiujin on 2017/9/5.
 */
public interface InfundChargeOffDao {

    /**
     * 核销后插入数据
     * @param infundChargeOff
     * @return
     */
    int insert(InfundChargeOff infundChargeOff);


    /**
     * 根据订单号查询核销记录
     */
    List<InfundChargeOff> getByOrderId(Long  orderId);


}
