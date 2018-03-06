package com.malicn.server.dao.balance;

import com.malicn.server.domain.balance.BalanceLog;
import com.malicn.server.domain.balance.Withdraw;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by yuanfei on 2017/5/23.
 */

public interface BalanceDao {



    /**
     * 获取账户余额明细
     * */
    public List<BalanceLog> listBalanceDetails(BaseQueryDTO dto);

    /**
     * 获取提现明细
     * */
    public List<BalanceLog> listWithdrawDetail(BaseQueryDTO dto);


    /**
     * 创建一条余额/提现明细信息
     * */
    public void createBalanceLogInfo(BalanceLog balanceLog);
}
