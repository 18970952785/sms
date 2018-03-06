package com.malicn.server.domain.cmscmb;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @version V1.0
 * @Package: com.malicn.server.domain.cmscmb
 * @Description: 收款核销表
 * @author: zengdd
 * @date: 2017/9/5 9:18
 */
@Data
public class InfundChargeOff extends BasePo{

    public static final byte PJ = 1;
    public static final byte YJ = 2;

    //主键ID
    private Long id;
    //流水ID
    private String  flowIds;
    //核销订单号
    private String orderIds;
    //核销类型(1.订单票结 2.订单月结)
    private Byte chargeType;
    //选择月结时，结算单号ID
    private String  billIds;
    //货主存款变动ID
    private Long  ownerDepositeId;
    //异常款ID
    private Integer  exceptionFundId;
    //核销金额
    private BigDecimal chargeAmount;
    protected Integer creator;
}
