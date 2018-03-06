package com.malicn.server.dao.cmscmb;

import com.malicn.server.domain.cmscmb.InfundCmb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @version V1.0
 * @Package: com.malicn.server.dao.cmscmb
 * @Description: 收款明细表
 * @author: zengdd
 * @date: 2017/9/5 9:43
 */
public interface InfundCmbDao {
    /**
     * 插入
     * @param infundCmb
     * @return
     */
    int insert(InfundCmb infundCmb);

    /**
     * 批量保存
     * @param list
     * @return
     */
    int saveAll(List<InfundCmb> list);

    /**
     * 删除
     * @param flowId
     */
    int deletedByflowId(@Param("flowId") Long flowId);
}
