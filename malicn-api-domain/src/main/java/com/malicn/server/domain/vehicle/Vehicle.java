package com.malicn.server.domain.vehicle;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Vehicle extends BasePo{

    public static Byte AUTH_WRZ =0; //未认证
    public static Byte AUTH_YRZ =1; //已认证
//    public static Byte AUTH_WTG =2; //审核未通过

    private Long id;						    // 货车id
    private Long carrierId;						// 车主id
    private Long driverId;                      // 司机id
    private String plateNo;						// 车牌号
    private Byte vehicleType;					// 车辆类型         1、冷藏车       2、普通车
    private BigDecimal length;					// 车辆长度
    private BigDecimal weight;					// 额定载重量
    private BigDecimal minTmprtu;				// 最低温度
    private String cargoCtgryId;				// 货物品类id
    private String cargoCtgryName;				// 货物品类名称
    private String licenseNo;					// 行驶证号码
    private Date licnExpDate;					// 行驶证有效期
    private String licnImg;						// 行驶证照片
    private String vehicleImg;					// 货车照片
    private Byte authStatus;				    // 认证状态         1、认证通过      2、认证未通过
    private Date authPassTime;					// 认证通过时间
}