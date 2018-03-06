package com.malicn.server.dao.balance;

import com.malicn.server.domain.balance.Withdraw;
import com.malicn.server.domain.bank.BankCard;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by yuanfei on 2017/5/25.
 */
public interface WithdrawDao {
    /**
     * 获取累计提现总额
     * */
    public BigDecimal getAmountWithdrawMoneyByUserId(BaseQueryDTO baseQueryDTO);

    /**
     * 获取正在提现笔数
     * */
    public Integer getCountWithdrawByUserId(BaseQueryDTO baseQueryDTO);

    /**
     * 创建提现信息(向提现表插入数据)
     * */
    public void createWithdraw(Withdraw withdraw);

    /**
     * 根据用户id取最后一次提现的银行卡信息
     * */
    public Withdraw getLastWithdrawInfo(BaseQueryDTO baseQueryDTO);

    /**
     * 提现记录审核
     * auth lianrongxiang
     * @param id  主键
     * @param auditStatus 状态
     * @param auditRemark 备注
     * @return
     */
    int updateWithdrawStatus(@Param("id")Long id,@Param("auditStatus") String auditStatus,@Param("auditRemark")String auditRemark);

    /**
     * 查询所有提现记录
     * auth lianrongxiang
     * @param realName 姓名
     * @param mobile   手机号
     * @return
     */
    List<Withdraw> selectByPrimaryKeyAllList(@Param("realName") String realName,@Param("mobile") String mobile,@Param("auditStatus") String auditStatus);


    /**
     * 获取单条提现记录
     * @param id
     * @return
     */
    Withdraw getById(@Param("id") Long id);
}
