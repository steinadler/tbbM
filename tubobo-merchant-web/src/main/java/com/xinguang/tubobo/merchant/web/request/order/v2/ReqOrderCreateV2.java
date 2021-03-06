package com.xinguang.tubobo.merchant.web.request.order.v2;

import com.xinguang.tubobo.impl.merchant.common.AddressInfo;
import com.xinguang.tubobo.merchant.web.common.info.AppointTask;
import com.xinguang.tubobo.merchant.web.common.info.OverFeeInfo;
import com.xinguang.tubobo.merchant.web.common.info.ThirdInfo;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 创建订单请求v2.0.
 */
public class ReqOrderCreateV2 implements Serializable {
    private AddressInfo consignor;
    private AddressInfo receiver;
    @Size(max = 255,message = "备注长度过大")
    private String orderRemarks;
    private String originOrderNo;	//重发单的原始单号 v1.4.3
    @Range(min = 1,max = 100000,message = "配送费错误")
    private Double deliveryFee;
    private Double tipFee;
    @NotBlank(message = "订单类型不能为空")
    private String type;
    private String carType;
    private String payMethod;
    private AppointTask appointTask; //预约时间
    private OverFeeInfo overFeeInfo;
    private ThirdInfo thirdInfo;
    private Double deliveryDistance;  //配送距离, 客户端传回我们之前计算配送费时所提供的距离值 v1.41

    public String getOriginOrderNo() {
        return originOrderNo;
    }

    public void setOriginOrderNo(String originOrderNo) {
        this.originOrderNo = originOrderNo;
    }

    public Double getDeliveryDistance() {
        return deliveryDistance;
    }

    public void setDeliveryDistance(Double deliveryDistance) {
        this.deliveryDistance = deliveryDistance;
    }

    public OverFeeInfo getOverFeeInfo() {
        return overFeeInfo;
    }

    public void setOverFeeInfo(OverFeeInfo overFeeInfo) {
        this.overFeeInfo = overFeeInfo;
    }

    public AppointTask getAppointTask() {
        return appointTask;
    }

    public void setAppointTask(AppointTask appointTask) {
        this.appointTask = appointTask;
    }

    public AddressInfo getConsignor() {
        return consignor;
    }

    public void setConsignor(AddressInfo consignor) {
        this.consignor = consignor;
    }

    public AddressInfo getReceiver() {
        return receiver;
    }

    public void setReceiver(AddressInfo receiver) {
        this.receiver = receiver;
    }

    public String getOrderRemarks() {
        return orderRemarks;
    }

    public void setOrderRemarks(String orderRemarks) {
        this.orderRemarks = orderRemarks;
    }

    public Double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public Double getTipFee() {
        return tipFee;
    }

    public void setTipFee(Double tipFee) {
        this.tipFee = tipFee;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public ThirdInfo getThirdInfo() {
        return thirdInfo;
    }

    public void setThirdInfo(ThirdInfo thirdInfo) {
        this.thirdInfo = thirdInfo;
    }

    @Override
    public String toString() {
        return "ReqOrderCreateV2{" +
                "consignor=" + consignor +
                ", receiver=" + receiver +
                ", orderRemarks='" + orderRemarks + '\'' +
                ", deliveryFee=" + deliveryFee +
                ", tipFee=" + tipFee +
                ", type='" + type + '\'' +
                ", carType='" + carType + '\'' +
                ", payMethod='" + payMethod + '\'' +
                ", appointTask=" + appointTask +
                ", overFeeInfo=" + overFeeInfo +
                ", thirdInfo=" + thirdInfo +
                '}';
    }
}
