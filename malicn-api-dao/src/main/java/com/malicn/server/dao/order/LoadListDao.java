package com.malicn.server.dao.order;


import com.malicn.server.domain.order.LoadList;

/**
 * 装货清单Dao
 */
public interface LoadListDao {

    /**
     * 查询装货清单
     * @param orderId   订单ID
     * @return  装货清单对象
     */
    LoadList getLoadListByOrderId(long orderId);

    int insertSelective(LoadList loadList);

    /**
     * 新增装货清单
     * @param loadList
     * @return
     */
    int saveLoadList(LoadList loadList);
}