package com.malicn.server.domain.reward;

import com.malicn.server.domain.BasePo;
import lombok.Data;

/**
 * @描述： 奖励触发条件表
 * @author  qun.xu
 * @date 2017.07.07
 */
@Data
public class Reward extends BasePo {


   // 奖励类型 1抵用券  2现金 3 货主下单奖励 4 货主推荐奖励 5 司机下单奖励 6 司机推荐奖励
    public static final byte  T_COUPON = 1;
    public static final byte  T_CASH = 2;
    public static final byte  T_OWNER_DONE = 3;
    public static final byte  T_OWNER_RECOM = 4;
    public static final byte  T_DRIVER_DONE = 5;
    public static final byte  T_DRIVER_RECOM = 6;

    /**
     * id
     */
    private Integer id;

    /**
     * 触发奖励类型
     */
    private Byte type;

    /**
     * 触发条件
     */
    private String conditions;

    /**
     * 奖励对象
     */
    private String item;

}
