package com.malicn.server.domain.vehicle;

import com.malicn.server.domain.BasePo;
import lombok.Data;

import java.util.Date;

/**
 * @description: 车辆司机绑定日志表实体类
 * @author yuanfei
 * @since: 2017-5-2 9:49:11
 * @version 1.0
 */
@Data
public class DriverVehicleLog extends BasePo {
	private Long id;								// 主键id
	private Long vehicleId;						// 车辆id
	private Long driverId;							// 司机id
	private Byte relationType;						// 关系类型
	private String logRemark;						// 绑定备注
}