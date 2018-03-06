package com.malicn.server.domain.order;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单动态消息
 * @author yanghuoyun
 * @since  2017/4/28
 */
@Data
public class OrderNews extends BasePo{

    //系统生成
    public static final Byte TYPE_SYS =1;
    //订单生成
    public static final Byte TYPE_ORDER =2;

    /**
     * 自增id
     */
    private Integer id;
    /**
     * 出发城市id
     */
    private Integer startId;
    /**
     * 出发城市名
     */
    private String startName;
    /**
     * 到达城市id
     */
    private Integer arriveId;
    /**
     * 到达城市名
     */
    private String arriveName;
    /**
     * 货物重量
     */
    private BigDecimal weight;
    /**
     * 货物品类名
     */
    private String cargoName;
    /**
     * 操作类型  已装货 或者 已卸货
     */
    private String operate;
    /**
     * 订单id  type为2时不为空
     */
    private Long orderId;
    /**
     * 动态类型   1 系统生成  2 订单生成
     */
    private Byte type;

}
