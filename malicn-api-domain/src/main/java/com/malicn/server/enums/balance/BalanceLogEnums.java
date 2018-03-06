package com.malicn.server.enums.balance;

/**
 * Created by dingchangjiang on 2017/5/26.
 */

/**
 * 余额明细枚举类
 * */
public enum BalanceLogEnums {
    ORDER_ESTABLISH((byte)1,"订单成立"),
    ORDER_CANCEL((byte)2,"订单取消"),
    WITHDRAW_APPLY((byte)3,"申请提现"),
    WITHDRAW_FAILED((byte)4,"提现失败"),
    REDPACKET_RECEIVE((byte)5,"领取红包");

    private Byte type;
    private String title;

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    BalanceLogEnums(Byte type, String title) {
        this.type = type;
        this.title = title;
    }

    public  String getContent(String info){
        switch (this.type){
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return "提现号"+info+"";
            case 4:
                return null;
            case 5:
                return "领取"+info+"活动红包";
        }
        return null;
    }
}
