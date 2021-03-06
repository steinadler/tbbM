package com.xinguang.tubobo.merchant.api.enums;

/**
 * Created by Administrator on 2017/4/21.
 */
public enum EnumCancelReason {
    GRAB_OVERTIME("超时未接单自动取消", "GRAB_OVERTIME"),
    GRAB_MERCHANT("商家取消", "GRAB_MERCHANT"),
    PAY_OVERTIME("支付超时取消", "PAY_OVERTIME"),
    ADMIN_CANCEL("后台取消", "ADMIN_CANCEL"),
    RIDER_CANCEL("骑手主动取消","RIDER_CANCEL"),
    PAY_MERCHANT("未支付商家取消", "PAY_MERCHANT"),
    LEGWORK_CANCEL("兔快送取消", "LEGWORK_CANCEL");

    private String name;
    private String value;

    EnumCancelReason(String name, String value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
