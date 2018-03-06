package com.malicn.server.enums.pay;

public enum PayWay{

	weixin(3, "微信支付", 0),
	alipay(1, "支付宝", 0),
	bank(2, "银行转账", 0);


	private Integer code;
	private String value;
	private double rate;

	PayWay(Integer code, String value, double rate){
		this.code = code;
		this.value = value;
		this.rate = rate;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public static PayWay get(Integer code) {
		for (PayWay item : values()) {
			if (code.intValue() == item.getCode().intValue()) {
				return item;
			}
		}
		return null;
	}

	public static PayWay get(String value) {
		for (PayWay item : values()) {
			if (value.toLowerCase().equals(item.getValue())) {
				return item;
			}
		}
		return null;
	}
}