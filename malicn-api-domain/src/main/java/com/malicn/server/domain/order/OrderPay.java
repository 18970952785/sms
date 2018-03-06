package com.malicn.server.domain.order;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.malicn.server.domain.BasePo;
import com.malicn.server.enums.pay.Currency;
import com.malicn.server.enums.pay.PayWay;
import com.malicn.server.support.vip.PayOrderParams;
import com.malicn.server.support.vip.PayVipParams;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
public class OrderPay extends BasePo{

    public static final byte ORDER_PAY_ZFZ = 1;             // 交易创建，等待买家付款
    public static final byte ORDER_PAY_JYGB = 2;            // 未付款交易超时关闭，或支付完成后全额退款
    public static final byte ORDER_PAY_JYCG = 3;            // 交易支付成功
    public static final byte ORDER_PAY_JYJS = 4;            // 交易结束，不可退款

    public static final byte PAY_TYPE_ORDER = 1;
    public static final byte PAY_TYPE_VIP_OWNER = 2;
    public static final byte PAY_TYPE_VIP_DRIVER = 3;


    public static final byte CLIENT_TYPE_OWNER = 1;
    public static final byte CLIENT_TYPE_DRIVER = 2;
    public static final byte CLIENT_TYPE_H5 = 3;


    public static final String ALI_PAY_CLIENT_NOTIFY_RESULT_STATUS_9000 = "9000";       // 订单支付成功
    public static final String ALI_PAY_CLIENT_NOTIFY_RESULT_STATUS_8000 = "8000";       // 正在处理中，支付结果未知（有可能已经支付成功），请查询商户订单列表中订单的支付状态
    public static final String ALI_PAY_CLIENT_NOTIFY_RESULT_STATUS_4000 = "4000";       // 订单支付失败
    public static final String ALI_PAY_CLIENT_NOTIFY_RESULT_STATUS_5000 = "5000";       // 重复请求
    public static final String ALI_PAY_CLIENT_NOTIFY_RESULT_STATUS_6001 = "6001";       // 用户中途取消
    public static final String ALI_PAY_CLIENT_NOTIFY_RESULT_STATUS_6002 = "6002";       // 网络连接出错
    public static final String ALI_PAY_CLIENT_NOTIFY_RESULT_STATUS_6004 = "6004";       // 支付结果未知（有可能已经支付成功），请查询商户订单列表中订单的支付状态
    public static final String ALI_PAY_CLIENT_NOTIFY_RESULT_STATUS_OTHER = "其他";      // 其它支付错误

    /** 支付订单ID **/
    private Long id;

    /** 商品名称 **/
    private String subject;

    /**  **/
    private Long relatedId;

    /** 商品描述 **/
    private String body;

    /** 交易金额 **/
    private BigDecimal tradeAmount;

    /** 交易币种 **/
    private Currency tradeCurrency;

    /** 实付金额 **/
    private BigDecimal payAmount;

    /** 实付币种 **/
    private Currency payCurrency;

    /** 支付方式 **/
    private PayWay payWay;

    /** 超时时间 **/
    private Date timeOut;

    /**
     * 同步返回结果码
     * 9000 订单支付成功
     * 8000 正在处理中，支付结果未知（有可能已经支付成功），请查询商户订单列表中订单的支付状态
     * 4000 订单支付失败
     * 5000 重复请求
     * 6001 用户中途取消
     * 6002 网络连接出错
     * 6004 支付结果未知（有可能已经支付成功），请查询商户订单列表中订单的支付状态
     * 其他 其它支付错误
     */
    private String payCode;

    /** 交易状态  1-支付中  2-支付超时关闭  3-支付成功  4-支付失败 **/
    private Byte payStatus;

    /** 回调时间 **/
    private Date callbackTime;

    /** 成功时间 **/
    private Date succTime;

    /** 第三方支付订单编号-支付宝系统订单编号 **/
    private String tradeNo;

    private String extraParams;

    private Byte payType;

    private Byte clientType;

    /**
     * 根据查询出的extra_params 转换成对象
     * @return
     */
    public Object getPayObject(Byte payType){
        Gson gson = new Gson();
        if (payType.byteValue() == PAY_TYPE_ORDER) {
            return gson.fromJson(this.extraParams, PayOrderParams.class);
        } else if (payType.byteValue() == PAY_TYPE_VIP_OWNER || payType.byteValue() == PAY_TYPE_VIP_DRIVER) {
            return gson.fromJson(this.extraParams, PayVipParams.class);
        } else {
            return null;
        }
    }
}