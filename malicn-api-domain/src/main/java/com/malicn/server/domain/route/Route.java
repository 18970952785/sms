package com.malicn.server.domain.route;

import java.math.BigDecimal;
import com.malicn.server.domain.BasePo;
import lombok.Data;

/**
 * @Description: 路线价格实体类
 * @author: yuanfei
 * @since: 2017/4/10 10:00
 * @version: v1.0
 */
@Data
public class Route extends BasePo {

    private Integer id;                         // 主键id
    private String startName;                   // 出发城市名
    private String arriveName;                  // 到达城市名
    private Integer startId;                    // 出发城市id
    private Integer arriveId;                   // 到达城市id
    private BigDecimal unitPrice;               // 单价   单位：元/吨起
    private BigDecimal unitMin;                 // 最低单价
    private BigDecimal unitMax;                 // 最高单价
    private String creator;                     // 创建人
    private String updater;                     // 更新人
}