package com.malicn.server.dao.bank;

import com.malicn.server.domain.bank.Bank;
import com.malicn.server.domain.bank.BankCard;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by dingchangjiang on 2017/5/23.
 */

public interface BankDao {


    /**
     * 列举热门银行
     * */
    public List<Bank> listHotBanks();

    /**
     * 列举所有开户银行
     * */
    public List<Bank> listBanks();

    /**
     * 搜索银行
     * */
    public List<Bank> searchBank(String keyword);



    @MapKey("id")
    Map<Integer,Bank> getBankMapByList(List list);


    /**
     * 提现审核需要用到
     * @param list
     * @return
     */
    @MapKey("id")
    Map<Integer,Bank> getBankNameMapByList(List list);


    Bank getBankMapById(@Param("Id")Integer id);

}
