package com.malicn.server.domain.vehicle;

import com.malicn.server.domain.BasePo;
import lombok.Data;

/**
 * @description: 议价者-车辆关联关系表实体类
 * @author yuanfei
 * @since: 2017-4-26 20:22:53
 * @version 1.0
 */
@Data
public class CarrierVehicle extends BasePo {

	public static final byte RELATION_YY = 1;
	public static final byte RELATION_WJH = 2;
	public static final byte RELATION_YJH = 3;

	private Long id;								// 主键id
	private Long carrierId;							// 车主id
	private Long vehicleId;							// 车辆id
	private Byte relationType;						// 关系类型	1、拥有  2、代理未激活  3、代理已激活
}