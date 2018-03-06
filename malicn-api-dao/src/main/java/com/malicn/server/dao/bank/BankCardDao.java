package com.malicn.server.dao.bank;

import com.malicn.server.domain.bank.BankCard;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yuanfei on 2017/5/25.
 */
public interface BankCardDao {
    /**
     * 通过userId和银行卡号获取银行卡
     * */
    public BankCard getBankCardByUserIdAndCardNo(@Param("userId") Long userId, @Param("cardNo") String cardNo);

    /**
     * 获取银行卡数量
     * */
    public Integer getCountCard(Long userId);

    /**
     * 列举我的所有银行卡
     * */
    public List<BankCard> listMyBankCardsByUserId(Long userId);

    /**
     * 获取我最近一次创建的银行卡
     */
    BankCard getAllNewBankCard(Long userId);

    /**
     * 获取单一银行卡
     * */
    public BankCard getBankCardByCardId(Long cardId);

    /**
     * 创建一张银行卡
     * */
    public Integer createBankCard(BankCard bankCard);

    /**
     * 删除多张银行卡
     * */
    public Integer deleteMyBankCards(@Param("userId") Long userId, @Param("cardIds") Long [] cardIds);


    int updateDeleted(@Param("id")Long id,
                      @Param("isDeleted")Byte isDeleted,
                      @Param("updatorName")String updatorName);
    /**
     * 查询收款账户
     * @param mobile
     * @return
     */
    List<BankCard> selectAllAccount(@Param("mobile") String mobile,@Param("userType") byte userType);

    List<BankCard> getAccountByUserId(@Param("userType") Byte userType,
                                      @Param("userId") Long userId,
                                      @Param("accountId") Long accountId,@Param("mobile") String mobile);

    int insertBankCard(BankCard bankCard);

    int updateBankCard(BankCard bankCard);


    BankCard getBankCardById(@Param("userType") Byte userType,
                                @Param("Id") Long Id);


    List<BankCard> getBankCardByUserId(@Param("userId") Long userId,@Param("userType") Byte userType);

    List<BankCard> getInfoByMobile(@Param("mobile") String mobile,
                                   @Param("userType") Byte userType);


    BankCard getById(@Param("id")Long id);


    /**
     * @Author: lianrongxiang
     * @Description 查询收款账号是否有重复
     *
     */
    List<BankCard> getMarkerData(@Param("userId")Long userId,
                                 @Param("cardNo")String cardNo,
                                 @Param("userType") Byte userType);


    /**
     * @Author: lianrongxiang
     * @Description 查询其他收款账户是否重复 type=4
     * @date 2017-12-12
     */
    List<BankCard> getOtherCard(@Param("mobile") String mobile,
                          @Param("userType") Byte userType,
                          @Param("cardNo") String cardNo);


    List<BankCard> getOwnerBankCardInfo(@Param("mobile") String mobile);

    List<BankCard> getDriverBankCardInfo(@Param("mobile") String mobile);

    List<BankCard> getMakerBankCardInfo(@Param("mobile") String mobile);

    List<BankCard> getOtherAccountInfo(@Param("mobile") String mobile);

}
