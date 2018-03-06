package com.malicn.server.enums.common;

	import com.malicn.server.common.ErrorCode;

/**
 * 异常代码类
 */
public enum  CodeEnums implements ErrorCode{

	/**
	 * 系统相关 =================================
	 * 400-600
	 */
	PARAMS_ERROR(400, "参数错误"),
	/** 401对象ID为空 **/
	OBJECT_ID_IS_NULL(401, "对象ID为空"),
	/** 402必传参数为空 **/
	PARAMS_IS_NULL(402, "必传参数为空"),
	/** 402必传参数为空 **/
	PARAMS_SIZE_ZERO(403, "集合参数大小为0"),
	/**500系统繁忙**/
	SYSTEM_ERROR(500,"系统繁忙"),
	/**600系统数据错误**/
	SYSTEM_DATA_ERROR(600,"系统数据错误"),
	/**601端口不匹配**/
	LOCALOWNER_NOT_MATE(601,"您注册的是车主端，请在车主端登录"),
	/**602端口不匹配**/
	LOCALCAR_NOT_MATE(602,"您注册的是货主端，请在货主端登录"),
	/** 603 **/
	SMS_NUM_MUCH(603,"每天最多可获取10条验证码"),
	/** 604 银行卡号格式不正确 **/
	BANK_CARD_IS_WRONGFULNESS(604,"银行卡号格式不正确"),
	/** 605 已提交转账信息，请勿重复提交 **/
	ORDER_TRANSFER_REPEAT(605,"已提交转账信息，请勿重复提交"),


	/**
	 * 认证相关 =================================
	 * 700
	 */
	/**700认证不存在**/
	AUTH_NOT_EXIST(700,"认证不存在"),
	/**710重复认证**/
	AUTH_REPEAT(710,"认证重复"),

	AUTH_TYPE_ERROR(711,"认证提交方式不匹配"),
	/**790用户未认证**/
	AUTH_NOT_PASS(790, "用户未认证"),

	/** 791车辆已认证 **/
	PLATE_NO_IS_EXIST(791, "车辆已认证"),

	/** 792您已认证过车辆，请删除车辆再认证新车 **/
	VEHICLE_IS_EXIST(792, "您已认证过车辆，请删除车辆再认证新车"),

	/** 身份证已被认证 **/
	ID_CARD_IS_EXIST(793,"该身份证号已被认证。"),
	/**
	 * 用户相关 =================================
	 * 800-900
	 */

	/** 900 您注册的是货主端，请在货主端登录 **/
	PLEASE_LOGIN_AT_THE_OWNER_HOST(900,"您注册的是货主端，请在货主端登录"),
	/** 901 您注册的是车主端，请在车主端登录 **/
	PLEASE_LOGIN_AT_THE_CARRIER_HOST(901,"您注册的是车主端，请在车主端登录"),
	/**902身份证号码不合法**/
	ID_CARD_IS_WRONGFULNESS(902, "身份证号码格式不正确"),
	/**903手机验证码不合法**/
	SMS_CODE_IS_WRONGFULNESS(903, "手机验证码应为4位数字"),
	/**905身份证号码错误**/
	ID_CARD_ERROR(905, "身份证号码错误"),
	/**906新手机号码与原始手机号码相同**/
	MOBILE_OLD_NEW_NAME(906, "新手机号与原始手机号相同"),
	/**909操作无权限**/
	OPERATE_NO_PERMISSIONS(909, "操作无权限"),
	/** 910手机号不合法 **/
	MOBILE_IS_WRONGFULNESS(910, "手机号应为11位数字"),
	/** 911手机未注册 **/
	MOBILE_IS_NOT_EXISTS(911, "手机号未注册"),
	/** 912手机号已存在 **/
	MOBILE_IS_EXISTS(912, "手机号已注册"),
	// MOBILE_IS_EXISTS_LOGIN(913, ""),
	/** 914手机验证码错误 **/
	VERIFY_CODE_ERROR(914, "验证码不正确"),
	/** 915手机验证码失效 **/
	VERIFY_CODE_FAILED(915, "手机验证码失效"),
	/** 916密码不合法 **/
	PASSWORD_IS_WRONGFULNESS(916, "密码格式不正确"),
	/** 917密码错误 **/
	PASSWORD_IS_ERROR(917, "密码不正确"),
	/** 918手机验证码发送失败 **/
	SEND_SMSMESSAGE_FAIL(918, "手机验证码发送失败"),
	/** 原始密码错误 **/
	PASSWORD_OLD_IS_ERROR(920, "旧密码错误"),
	/** 原始密码与新密码相同 **/
	PASSWORD_OLD_NEW_SAME(921, "新密码和旧密码不能相同"),
	/**922地区不合法**/
	REGION_IS_WRONGFULNESS(922, "地区格式不正确"),
	/**924图片地址不合法**/
	PHOTO_URL_ID_WRONGFULNESS(924, "图片地址格式不正确"),
	/**密码加密错误*/
	PASSWORD_ENCRYPT_ERROR(986, "密码加密错误"),
	/**991token不存在**/
	TOKEN_IS_NOT_EXISTS(991, "token不存在"),
	/**992token不合法**/
	TOKEN_IS_WRONGFULNESS(992, "token格式不正确"),
	/**993token已失效**/
	TOKEN_IS_INVALID(993,"登录已失效"),
	/**995用户不存在**/
	USER_IS_NOT_EXIST(995, "手机号未注册"),//用户不存在
	/**995用户不存在**/
	USER_BASE_NOT_EXIST(990, "用户不存在"),//用户不存在
	/** 996冷库名称重复 **/
	STRG_IS_EXIST(996,"冷库已存在"),
	/** 997 **/
	LOGIN_IS_INVALID(997,"登录已失效，请重新登录"),
	/** 998 获取验证码的次数已达上限 **/
	VERIFY_CODE_FAILED_COUNT_UPPER_LIMIT(998,"获取验证码的次数已达上限"),

	/** 999 联系电话应为十一位数字或者十二位数字 **/
	CONTACT_MOBILE_LENGTH_ERROR(999,"联系电话应为11位或12位数字"),

	/** 1001 **/
	PLEASE_OVER_ALL_ORDER(1001, "请完成所有订单"),



	/**
	 * 订单相关 =================================
	 * 1000
	 */
	/**1150订单不存在**/
	ORDER_IS_NOT_EXIST(1150,"订单不存在"),
	/**1151订单类型不存在**/
	ORDER_TYPE_IS_NOT_EXIST(1151,"订单类型不存在"),
	/**1152订单不允许取消**/
	ORDER_CAN_NOT_CANCEL(1152, "订单不允许取消"),
	/**1153订单不允许删除**/
	ORDER_CAN_NOT_DELETE(1153, "订单不允许删除"),
	/** 1154 请认证后创建订单**/
	PLEASE_AUTH_CREATE_ORDER(1154,"请认证后创建订单"),
	/** 1155 订单总额大于我的订单总额上限 **/
	ORDING_AMOUNT_DAYU_MY_ORDING_AMOUNT(1155,"您正在处理的所有订单总额大于您的订单总额度上限"),
	/**  请勿重复使用抵用券 repetition  **/
	REPETITION_COUPON(1156,"重复绑定抵用券"),
	/** 请勿重复支付 **/
	REPETITION_PAY(1157,"请勿重复支付"),
	/**1158您不能支付此订单**/
	ORDER_CAN_NOT_PAY(1158, "您不能支付此订单"),
	/**1159抵用券不存在**/
	COUPON_IS_NOT_EXIST(1159, "抵用券不存在"),
	/**1160抵用券不可用**/
	COUPON_CAN_NOT_USE(1160, "抵用券不可用"),
	/**1161抵用券已过期**/
	COUPON_IS_EXPIRED(1161, "抵用券已过期"),

	ORDER_UN_DONE(1162,"您有未完成的订单，请先完成订单"),

	ORDER_CAN_NOT_OPERATION(1163,"订单不允许操作"),


	/******* 支付宝支付异常 *******/
	ALI_PAY_CHECK_SIGN_ERROR(2000, "参数验证签名失败"),
	ALI_PAY_CREATE_ORDER_ERROR(2001, "创建订单信息异常"),
	ALI_PAY_CLIENT_NOTIFY_ERROR(2002, "马力客户端同步异常"),
	ALI_PAY_SERVER_NOTIFY_ERROR(2003, "支付宝服务端异步异常"),
	ALI_PAY_SERVER_QUERY_ERROR(2004, "支付宝服务端查询异常"),


	/**
	 * 设置相关 =================================
	 * 9000
	 */
	IS_NEW_VERSION(9083, "当前版本为最新版本"),
	NOT_VERSION_INFO(9084,"无版本信息"),


	/**
	 * 银行卡相关
	 * 1100
	 * */
	BANK_CARD_REPEAT(1100,"该收款银行卡已存在"),
	BANKCARD_NOT_BELONG_USER(1101,"银行卡不属于该用户"),
	BANKCARD_NOT_EXIST(1102,"银行卡不存在"),
	BANKCARD_CREATE_FAILED(1103,"银行卡创建失败"),
	BANKCARD_DELETE_FAILED(1104,"银行卡删除失败"),

	/**
	 * 余额提现相关
	 * 1200
	 * */
	//提现金额不能小于100
	WITHDRAW_AMOUNT_LESS_MINAMOUNT(1200,"小于100元无法提现"),
	WITHDRAW_AMOUNT_MORE_THAN_BALANCE(1201,"提现金额超出上限"),
	WITHDRAW_INPUT_AMOUNT(1202,"请填写提现金额"),
	WITHDRAW_AMOUNT_NEGATIVE(1203,"提现金额不可为负数"),
	/**
	 * 红包相关
	 * 1300
	 * */
	REDPACKET_NOT_BELONG_USER(1300,"红包不属于该用户"),
	REDPACKET_NOT_EXIST(1301,"红包不存在"),
	REDPACKET_RECEIVED_OR_EXPRIED(1302,"红包已领取或已过期"),

	/**
	 * 车主相关
	 * 1400
	 * */
	USER_CARRIER_NOT_EXIST(1400,"用户车主信息不存在"),

	/**
	 * 司机相关
	 * 1401
	 */
	USER_DRIVER_NOT_EXIST(1401,"用户司机信息不存在"),

	/**
	 * 货主不存在
	 * 1600
	 * */
	USER_OWNER_NOT_EXIST(1600,"用户货主信息不存在"),

	/**
	 * 通知相关
	 * 1400
	 * */
	NOTICE_NOT_EXIST(1500,"通知内容不存在或已删除"),
	NOTICE_NO_PERMISSION(1501,"没有权限查看"),

	/**
	 * VIP相关 已开通冷运管家 请勿重复开通
	 */
	OWNER_VIP_IS_EXIST(1700,"您已开通冷运管家，请勿重复开通"),

	/**
	 * VIP相关 已开通超级司机 请勿重复开通
	 */
	DRIVER_VIP_IS_EXIST(1701,"您已开通超级司机，请勿重复开通"),

	/**
	 * 推荐人不存在
	 */
	RECOMMEND_USER_BASE_IS_NOT_EXIST(1702,"您的推荐用户不存在"),


	/**
	 * 推荐人必须开通冷运管家
	 */
	RECOMMEND_MUST_IS_OWNER_VIP(1703,"该用户未开通冷运管家，不能作为推荐人"),

	/**
	 * 推荐人必须开通超级司机
	 */
	RECOMMEND_MUST_IS_DRIVER_VIP(1704,"该用户未开通超级司机，不能作为推荐人"),

	//推荐人必须是货主
	RECOMMEND_MUST_IS_OWNER(1705,"推荐人必须是货主"),

	//推荐人必须是司机
	RECOMMEND_MUST_IS_DRIVER(1706,"推荐人必须是司机"),

	//未开通超级司机
	DRIVER_IS_NOT_VIP(1707,"用户没有开通超级司机或者已过期"),

	//未开通冷运管家
	OWNER_IS_NOT_VIP(1708,"用户没有开通冷运管家或者已过期"),



	/**-------------------cms--------------------**/
	USER_IS_OWNER_NOT_EDIT(1709, "该用户已注册货主，不能修改手机号"),

	STORAGE_IS_NO_EXIT(1800, "仓库不存在"),


	/**----------------订单唛头----------------------**/
	ORDER_MAKE_PASSWORD(1900,"口令不存在");

	private int code;

	private String msg;

	CodeEnums(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	// 获得 enums 对象
	public static CodeEnums get(int code) {
			for (CodeEnums item : values()) {
			if (code == item.getCode()) {
				return item;
			}
		}
		return null;
	}
}
