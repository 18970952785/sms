package com.malicn.server.domain.order;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderTransfer extends Order{

    public static final byte TJDSH = 0;
    public static final byte SHYTG = 1;
    public static final byte SHBTG = 2;

    /** 转账ID **/
    private Long id;

    /** 订单ID **/
    private Long orderId;

    /** 转账时间 **/
    private Date transTime;

    /** 转账人姓名 **/
    private String transName;

    /** 转账人身份证号码 **/
    private String idCardNo;

    /** 转账人联系方式 **/
    private String mobile;

    /** 收款开户行 **/
    private String bankName;

    /** 收款银行卡号 **/
    private String bankCardNo;

    /** 收款人姓名 **/
    private String bankUserName;

    /** 转账交易金额 **/
    private BigDecimal tradeAmount;

    /** 转账实付金额 **/
    private BigDecimal payAmount;

    /** 转账状态 **/
    private Byte status;


    /** 备注 **/
    private String remark;




    public static String getTransferStatusString(Byte status){
        String statusName=null;
        switch(status){
            case 0:{
                statusName="提交待审核";
                break;
            }
            case 1:{
                statusName="审核通过转账成功";
                break;
            }
            case 2:{
                statusName="审核不通过转账失败";
                break;
            }
        }
            return statusName;
    }


}