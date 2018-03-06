package com.malicn.server.domain;

import com.malicn.server.utils.DateUtil;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

@Data
public class BasePo implements Serializable {

	private static final long serialVersionUID = -8835917197483167931L;

	// 默认除法运算精度
	private static final int DEF_DIV_SCALE = 10;

	private static final Random RANDOM = new Random();
	/**
	 *创建时间
	 */
	protected Date createTime;
	/**
	 *更新时间
	 */
	protected Date updateTime;
	/**
	 * 是否删除 0否 1是
	 */
	protected Byte isDeleted;

	protected Integer updator;

	public static final Byte IS_DELETE_YES = 1;

	public static final Byte IS_DELETE_NO = 0;





	public static long generateRandomId() {
		StringBuffer sb = new StringBuffer();
		sb.append(DateUtil.formatSS(new Date()));
		String ranStr = String.valueOf(RANDOM.nextInt(10000));
		switch (ranStr.length()) {
			case 1:
				sb.append("000");
				sb.append(ranStr);
				break;
			case 2:
				sb.append("00");
				sb.append(ranStr);
				break;
			case 3:
				sb.append("0");
				sb.append(ranStr);
				break;
			default:
				sb.append(ranStr.substring(0, 4));
				break;
		}
		return Long.parseLong(sb.toString());
	}

	public static String randomUUID(){
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replaceAll("-", "");
	}

	/**
	 * 实现浮点数的加法运算功能
	 * @param v1 加数1
	 * @param v2 加数2
	 * @return v1+v2的和
	 */
	public double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}

	/**
	 * 实现浮点数的减法运算功能
	 * @param v1 被减数
	 * @param v2 减数
	 * @return v1-v2的差
	 */
	public double sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();
	}

	/**
	 * 实现浮点数的乘法运算功能
	 * @param v1 被乘数
	 * @param v2 乘数
	 * @return v1×v2的积
	 */
	public double multi(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}

	/**
	 * 实现浮点数的除法运算功能 当发生除不尽的情况时，精确到小数点以后DEF_DIV_SCALE位(默认为10位)，后面的位数进行四舍五入。
	 * @param v1 被除数
	 * @param v2 除数
	 * @return v1/v2的商
	 */
	public double div(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, DEF_DIV_SCALE, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 实现浮点数的除法运算功能 当发生除不尽的情况时，精确到小数点以后scale位，后面的位数进行四舍五入。
	 * @param v1 被除数
	 * @param v2 除数
	 * @param scale 表示需要精确到小数点以后几位
	 * @return v1/v2的商
	 */
	public double div(double v1, double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 提供精确的小数位四舍五入功能
	 * @param v 需要四舍五入的数字
	 * @param scale 小数点后保留几位
	 * @return 四舍五入后的结果
	 */
	public double round(double v, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}

	/**
	 * 保留两位小数
	 * @param v
	 * @return
	 */
	public double round(double v) {
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, 2, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
}