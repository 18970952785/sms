package com.malicn.server.dao.order;


import com.malicn.server.domain.order.UnLoadList;

public interface UnLoadListDao {

    /**
     * 查询卸货清单
     * @param orderId
     * @return
     */
    UnLoadList getByOrderId(long orderId);

    int insertSelective(UnLoadList unLoadList);

    /**
     * 新增卸货清单
     * @param unLoadList
     * @return
     */
    int saveUnLoadList(UnLoadList unLoadList);
}