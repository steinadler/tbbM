package com.xinguang.tubobo.merchant.web.request.order;

import com.xinguang.tubobo.impl.merchant.common.MerchantConstants;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/13.
 */
public class CreateOrderRequest implements Serializable {
    @Size(min = 1,max = 200,message = "receiverAddressDetail长度为1-200")
    private String receiverAddressDetail;
    @Size(max = 100,message = "receiverAddressProvince长度最大为100")
    private String receiverAddressProvince;
    @Size(max = 100,message = "receiverAddressCity长度最大为100")
    private String receiverAddressCity;//地址缩略
    @Size(max = 100,message = "receiverAddressDistrict长度最大为100")
    private String receiverAddressDistrict;//地址名称
    @Size(max = 200,message = "receiverAddressStreet长度最大为200")
    private String receiverAddressStreet;//地址名称
    @Size(min = 1,max = 200,message = "门牌号过长")
    @NotBlank(message = "门牌号不能为空")
    private String receiverAddressRoomNo;//地址名称
    private String receiverGdPoiId;
//TODO
    @Range(min = 1,max = 100000,message = "配送费错误")
    private Double deliveryFee;
    private Double tipFee;

//    @NotBlank(message = "支付方式不能为空")
    private String payMethod;

    @Range(min=0,max=180,message="收货人位置纬度必须在0度至180度之间")
    private Double receiverLatitude;
    @Range(min=0,max=180,message="经度必须在0度至180度之间")
    private Double receiverLongitude;

    private String receiverName;
    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp = MerchantConstants.PATTERN_PHONE,message = "手机号格式错误")
    private String receiverPhone;

    @Size(max = 255,message = "备注长度过大")
    private String orderRemarks;

    public String getReceiverAddressDetail() {
        return receiverAddressDetail;
    }

    public void setReceiverAddressDetail(String receiverAddressDetail) {
        this.receiverAddressDetail = receiverAddressDetail;
    }

    public String getReceiverAddressProvince() {
        return receiverAddressProvince;
    }

    public void setReceiverAddressProvince(String receiverAddressProvince) {
        this.receiverAddressProvince = receiverAddressProvince;
    }

    public String getReceiverAddressCity() {
        return receiverAddressCity;
    }

    public void setReceiverAddressCity(String receiverAddressCity) {
        this.receiverAddressCity = receiverAddressCity;
    }

    public String getReceiverAddressDistrict() {
        return receiverAddressDistrict;
    }

    public void setReceiverAddressDistrict(String receiverAddressDistrict) {
        this.receiverAddressDistrict = receiverAddressDistrict;
    }

    public String getReceiverAddressStreet() {
        return receiverAddressStreet;
    }

    public void setReceiverAddressStreet(String receiverAddressStreet) {
        this.receiverAddressStreet = receiverAddressStreet;
    }

    public String getReceiverAddressRoomNo() {
        return receiverAddressRoomNo;
    }

    public void setReceiverAddressRoomNo(String receiverAddressRoomNo) {
        this.receiverAddressRoomNo = receiverAddressRoomNo;
    }

    public String getReceiverGdPoiId() {
        return receiverGdPoiId;
    }

    public void setReceiverGdPoiId(String receiverGdPoiId) {
        this.receiverGdPoiId = receiverGdPoiId;
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

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public Double getReceiverLatitude() {
        return receiverLatitude;
    }

    public void setReceiverLatitude(Double receiverLatitude) {
        this.receiverLatitude = receiverLatitude;
    }

    public Double getReceiverLongitude() {
        return receiverLongitude;
    }

    public void setReceiverLongitude(Double receiverLongitude) {
        this.receiverLongitude = receiverLongitude;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public String getOrderRemarks() {
        return orderRemarks;
    }

    public void setOrderRemarks(String orderRemarks) {
        this.orderRemarks = orderRemarks;
    }

    @Override
    public String toString() {
        return "CreateOrderRequest{" +
                "receiverAddressDetail='" + receiverAddressDetail + '\'' +
                ", receiverAddressProvince='" + receiverAddressProvince + '\'' +
                ", receiverAddressCity='" + receiverAddressCity + '\'' +
                ", receiverAddressDistrict='" + receiverAddressDistrict + '\'' +
                ", receiverAddressStreet='" + receiverAddressStreet + '\'' +
                ", receiverAddressRoomNo='" + receiverAddressRoomNo + '\'' +
                ", receiverGdPoiId='" + receiverGdPoiId + '\'' +
                ", deliveryFee=" + deliveryFee +
                ", tipFee=" + tipFee +
                ", payMethod='" + payMethod + '\'' +
                ", receiverLatitude=" + receiverLatitude +
                ", receiverLongitude=" + receiverLongitude +
                ", receiverName='" + receiverName + '\'' +
                ", receiverPhone='" + receiverPhone + '\'' +
                ", orderRemarks='" + orderRemarks + '\'' +
                '}';
    }
}
