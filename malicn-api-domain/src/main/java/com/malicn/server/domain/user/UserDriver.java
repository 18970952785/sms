package com.malicn.server.domain.user;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @description: 司机表实体类
 * @author yuanfei
 * @since: 2017-4-27 16:53:25
 * @version 1.0
 */
@Data
public class UserDriver extends UserBase {

	public static Byte PERSONAL = 1;
	public static Byte COMPANY = 2;

	public static Byte AUTH_WRZ =0; //未认证
	public static Byte AUTH_YRZ =1; //已认证
//	public static Byte AUTH_WTG =2; //审核未通过

	public static Byte DRIV_BJD =0; //不接单，停止接单
	public static Byte DRIV_WJD =1; //未接单，可以接单
//	public static Byte DRIV_YJD =2; //已接单，已派订单

	//private Long userId;							// 司机id
	private String realName;						// 司机姓名
	private Byte driverType;						// 司机类型
	private Byte authStatus;						// 认证状态
	private Byte driverStatus;						// 司机状态
	private String licenseNo;						// 驾驶证号码
	private Date licnExpDate;						// 驾驶证有效期
	private String licnImg;							// 驾驶证照片
	private Date authPassTime;						// 认证通过时间
	private String headImg;						//司机真实头像

	public static String convertAuthStatus(Byte authStatus) {
		String authStatusStr = "";
		if (authStatus.equals(AUTH_WRZ)) {
			authStatusStr = "未认证";
		} else {
			authStatusStr = "已认证";
		}
		return authStatusStr;
	}
}