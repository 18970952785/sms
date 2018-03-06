package com.malicn.server.dao.cmscmb;

import com.malicn.server.domain.cmscmb.InfundFlow;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.math.BigDecimal;
import java.util.List;

/**
 * @version V1.0
 * @Package: com.malicn.server.dao.cmscmb
 * @Description: 收款主表dao
 * @author: zengdd
 * @date: 2017/9/5 9:20
 */
public interface InfundFlowDao {

    /**
     * 查询当天已同步数据
     * @param bigenDate
     * @param endDate
     * @return
     */
    Date getInfundFlowByPayTime(@Param("bigenDate")Date bigenDate, @Param("endDate")Date endDate);
    /**
     * 插入
     * @param infundFlow
     * @return
     */
    int insert(InfundFlow infundFlow);

    /**
     * 批量保存
     * @param infundFlowList
     * @return
     */
    int saveAll(List<InfundFlow> infundFlowList);

    /**
     * 查询对账信息
     * @param billDate  对账日期
     * @param billName  对账人姓名
     * @return
     */
    List<InfundFlow> listInFundFlow(@Param("billDate") Date billDate,
                                    @Param("billName") String billName,
                                    @Param("tradeAmount") BigDecimal tradeAmount);

    /**
     * 根据Id查询收款信息
     * @param flowId
     * @return
     */
    InfundFlow getInFundFlowById(Long flowId);

    /**
     * 订单金额核销
     * @param chargeStatus 核销状态
     * @return
     */
    int updateInfundFlow(@Param("chargeStatus") Byte chargeStatus,
                         @Param("id") Long id);

    /**
     * 根据流水号查询收款信息
     * @param flowNo
     * @return
     */
    InfundFlow getByFlowNo(String flowNo);


    /**
     * 根据交易金额 交易账户 交易时间 过滤农行重复数据
     * @param amount
     * @param payAccount
     * @param payTime
     * @return
     */
    InfundFlow  getInfundFlowByBank(@Param("amount") BigDecimal amount,
                                      @Param("payAccount") String payAccount,
                                      @Param("payTime") Date payTime);




}
