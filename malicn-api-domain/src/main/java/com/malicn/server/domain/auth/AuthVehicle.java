package com.malicn.server.domain.auth;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
public class AuthVehicle extends AuthBase{

    public static final byte LCC = 1;
    public static final byte PTC = 2;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 车主ID
     */
    private Long carrierId;

    /**
     * 车牌号码
     */
    private String plateNo;

    /**
     * 车辆类型   1、冷藏车  2、普通车
     */
    private Byte vehicleType;

    /**
     * 车辆长度
     */
    private BigDecimal length;

    /**
     * 额定载重
     */
    private BigDecimal weight;

    /**
     * 最低温度
     */
    private BigDecimal minTmprtu;

    /**
     * 货物品类ID
     */
    private String cargoCtgryId;

    /**
     * 货物品类名称
     */
    private String cargoCtgryName;

    /**
     * 行驶证照片
     */
    private String licnImg;

    /**
     * 车辆正面照片
     */
    private String vehicleImg;

    /**
     * 审核状态 0 待审核  1审核通过  2审核不通过
     */
    private Byte auditStatus;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 审核备注
     */
    private String auditRemark;


    /***====================== 外加字段 ml_user_driver表 =========================**/
    private String idCardNo;
    private String realName;
    private Byte authStatus;

    public static String covertVehicleType(Byte vehicleType) {
        String vehicleStr = "";
        switch (vehicleType) {
            case PTC:
                vehicleStr = "普通车";
                break;
            case LCC:
                vehicleStr = "冷藏车";
                break;
        }
        return vehicleStr;
    }
}