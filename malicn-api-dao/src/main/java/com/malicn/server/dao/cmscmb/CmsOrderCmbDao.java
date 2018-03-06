package com.malicn.server.dao.cmscmb;

import com.malicn.server.domain.cmscmb.CmsOrderCmb;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by zengdingding on 2017/8/26.
 */
public interface CmsOrderCmbDao {
    /**
     * 插入
     * @param cmsOrderCmb
     * @return
     */
     int insert(CmsOrderCmb cmsOrderCmb);

    /**
     * 批量插入
     * @param list
     * @return
     */
     int saveAll(List<CmsOrderCmb> list);
    /**
     * 查询指定日期内所有数据
     * @param bigenDate
     * @param endDate
     * @return
     */
     Date getCmsOrderCmbByTransactionTime(@Param("bigenDate")Date bigenDate, @Param("endDate")Date endDate);
}
