package com.malicn.server.dao.order;

import com.malicn.server.domain.order.OrderApiFile;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lianrongxiang on 2017/9/18.
 */
public interface OrderFileApiDao {

    /**
     * @author qun.xu
     * @param orderId
     * @return
     * @desc 根据订单ID 查询orderFile
     */
    List<OrderApiFile> listByOrderId(@Param("orderId") Long orderId);

    /**
     * @author qun.xu
     * @param  orderFile
     * @return
     * @desc  单条保存文件
     */
    void  insert (OrderApiFile orderFile);


    /**
     * 批量保存
     * @param list
     * @return
     */
    int insertBatch(List<OrderApiFile> list);

    /**
     * 获取订单某个步骤下的文件
     * @param orderId
     * @param chainId
     * @param fileClass
     * @return
     */
    List<OrderApiFile> getOrderFile(@Param("orderId") Long orderId, @Param("chainId")int chainId, @Param("fileClass")Byte fileClass);





}
