package com.malicn.server.domain.order;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order extends BasePo{

    /**订单状态  0待确定  1 待揽收 2已取消  3待支付 4待卸货 5待验收 6已完成**/
    public static final byte STA_DQD = 0;
    public static final byte STA_DLS = 1;
    public static final byte STA_YQX = 2;
    public static final byte STA_DZF = 3;
    public static final byte STA_DXH = 4;
    public static final byte STA_DYS = 5;
    public static final byte STA_YWC = 6;

    public static final int YES_FIRST_ORDER = 1;
    public static final int NO_FIRST_ORDER = 0;

    public static final Byte ORDER_FROM_MALI= 1; //马力配
    public static final Byte ORDER_FROM_SELF= 2; //司机配

    public static final byte ORDER_NOT_TEST = 0;
    public static final byte ORDER_IS_TEST = 1;

    public static final Byte ORDER_RECASH_YES= 2; //返现
    public static final Byte ORDER_RECASH_NO = 1;  //不返现

    public static final Byte  CHARGE_STATUS_NO =   0; //未核销
    public static final Byte  CHARGE_STATUS_YES =  1;  //核销

    public static final byte PJ = 1;  //票结
    public static final byte YJ = 2;  //月结

    public static final byte 一类=1;
    public static final byte 二类=2;
    public static final byte 三类=3;
    public static final byte 四类=4;
    public static final byte 五类=5;
    public static final byte 六类=6;


    /**
     * 引流类型(默认1 1.自然订单 2.业管中心 3.市场部 4.其他)
     */
    public static final byte _自然订单 = 1;
    public static final byte _业管中心 = 2;
    public static final byte _市场部 = 3;
    public static final byte _其他 = 4;
    /**
     * 要求温度(默认1 1.无要求 2.12-18度 3.0-4度 4.不解冻 不缓化 5.零下12-18度 6.零下18度以下)
     */
    public static final byte _无要求 = 1;
    public static final byte _12_18度 = 2;
    public static final byte _0_4 = 3;
    public static final byte _不解冻不缓化 = 4;
    public static final byte _零下12_18度 = 5;
    public static final byte _零下18度以下 = 6;


    /**
     * 1.无效订单  2.客户测试单 3.高于预估价 4.未匹配到车 5.货主自行找到车 6.未匹配到合适车辆 7.其他 8.内部测试单
     */
    public static final byte _内部测试单  = 8;

    //按吨
    public static final Byte  VALUATION_TYPE_TUN = 1;
    //一口价
    public static final Byte  VALUATION_TYPE_NOW_PRICE = 2;

    public static final Byte  SETTLE_TYPE_MONTH=2;

    public static final Byte  SETTLE_TYPE_BILL=1;



    //引流类型
    public static final Byte  STREAM_TYPE_PUBLIC = 5; //马力大众


    public static  final Byte _运费票结=1;
    public static  final Byte _运费月结=2;


    private  Integer cargoPiece;  //货物件数

    private Byte settleFreightType;   //订单运费结算状态(1. 运费票结 2. 运费月结)



    /** 订单ID **/
    private Long orderId;

    /** 货主ID **/
    private Long ownerId;

    /** 车主ID **/
    private Long carrierId;

    /** 司机ID **/
    private Long driverId;

    /** 司机头像地址 **/
    private String driverHeadImg;

    /** 司机姓名 **/
    private String driverName;

    /** 司机电话 **/
    private String driverMobile;

    /** 车辆ID **/
    private Long vehicleId;

    /** 车辆类型 **/
    private Byte vehicleType;

    /** 车牌号 **/
    private String plateNo;

    /** 车辆长度 **/
    private BigDecimal vehicleLen;

    /** 出发城市名 **/
    private String startName;

    /** 出发城市ID **/
    private Integer startId;

    /** 到达城市名 **/
    private String arriveName;

    /** 到达城市ID **/
    private Integer arriveId;

    /** 货物总重量 **/
    private BigDecimal weight;

    /** 发货日期 **/
    private Date startDate;

    /** 发货仓库ID **/
    private Long startStrgId;

    /** 发货仓库名称 **/
    private String startStrgName;

    /** 发货详细地址 **/
    private String startAddress;

    /** 发货方联系人 **/
    private String startContact;

    /** 发货方联系电话 **/
    private String startConMobile;

    /** 到达日期 **/
    private Date arriveDate;

    /** 货物类型ID **/
    private String cargoCtgryId;

    /** 货物类型名称 **/
    private String cargoCtgryName;

    /** 货物类型细分小类ID **/
    private String cargoCtgrySubId;

    /** 货物类型细分小类名称 **/
    private String cargoCtgrySubName;

    /** 收货仓库ID **/
    private Long arriveStrgId;

    /** 收货仓库名称 **/
    private String arriveStrgName;

    /** 收货方联系人 **/
    private String arriveContact;

    /** 收货方联系电话 **/
    private String arriveConMobile;

    /** 收货方详细地址 **/
    private String arriveAddress;

    /** 货主留言、备注 **/
    private String ownerMsg;

    /** 路线ID **/
    private Integer routeId;

    /** 单价估价 **/
    private BigDecimal unitPrice;

    /** 找到附近车辆数 **/
    private Integer findVehlNum;

    /** 货主应付金额 **/
    private BigDecimal ownerAmount;

    /** 优惠金额 **/
    private BigDecimal discountAmount;

    /** 车主到款金额 **/
    private BigDecimal carrierAmount;

    /** 订单总价 **/
    private BigDecimal totalAmount;

    /** 订单状态  0待确定  1 待揽收 2已取消  3待支付 4待卸货 5待验收 6已完成 **/
    private Byte status;

    /** 是否首单 **/
    private int isFirst;

    /** 取消类型 **/
    private Byte cancelType;

    /** 取消原因 **/
    private String cancelReason;

    /** 取消时间 **/
    private Date cancelTime;

    /** 订单完成时间 **/
    private Date endTime;

    /**订单来源**/
    private Byte orderFrom;

    /*货主姓名*/
    private String ownerName;

    /** 公司名称 **/
    private String companyName;

    /** 手机号码 **/
    private String ownerMobile;
    /**是否测试单**/
    private Byte isTest;
    /**是否无效单**/
    private Byte isInvalid;
    /**温度要求**/
    private Byte requireTemp;
    /**引流类型**/
    private Byte streamType;
    /**引流人员记录**/
    private int streamAdminId;
    private Byte valuationType;
    //链表查询字段没用上
    private String adminName;
    //orderString类型
    private String orderIdString;
    //返现类型
    private Byte recashType;
    //核销状态
    private Byte chargeStatus;
    private int countOrder;
    private BigDecimal sumWeight;
    private BigDecimal sumAmount;
    //订单是否是月结还是票结 1票结 2月结
    private Byte settleType;
    //预付款ID
    private Long depositeDetailId;
    private Byte orderType;  /// '1：一类，2：二类，3：三类，4：四类，5：五类，6：六类',
    private Date  confirmTime;  //'订单确认时间'


    /**
     *   链表查询字段开始
     */
    private  String makerName;
    private  String makerMobile;
    private  String linkMan;
    private  Integer makerId;
    /**
     *   链表查询字段结束
     */

    public static String getOrderFromString(Byte orderFrom){
        String orderFromName=null;
        switch(orderFrom){
            case 1:{
                orderFromName="一二类订单";
                break;
            }
            case 2:{
                orderFromName="三类订单";
                break;
            }

        }
        return orderFromName;
    }

    public static String getOrderStatusString(Byte status){
        String statusName=null;
        switch(status){
            case 0:{
                statusName="待确认";
                break;
            }
            case 1:{
                statusName="待揽收";
                break;
            }
            case 2:{
                statusName="已取消";
                break;
            }
            case 3:{
                statusName="待支付";
                break;
            }
            case 4:{
                statusName="待卸货";
                break;
            }
            case 5:{
                statusName="待验收";
                break;
            }
            case 6:{
                statusName="已完成";
                break;
            }
            default:{
                statusName="异常";
                break;
            }

        }
        return statusName;
    }

    /**
     * 订单状态 正常 1 异常 2
     */
    private Integer orderState;
}