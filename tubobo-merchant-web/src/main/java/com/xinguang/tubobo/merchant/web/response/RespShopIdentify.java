package com.xinguang.tubobo.merchant.web.response;


/**
 * Created by Administrator on 2017/4/14.
 */
public class RespShopIdentify  {

    private String userId;
    private String addressProvince;//详细地址
    private String addressCity;//地址缩略
    private String addressDistrict;//地址名称
    private String addressDetail;//地址名称
    private String addressStreet;//地址名称
    private String addressRoomNo;//门牌号

    private String idCardBackImageUrl;
    private String idCardFrontImageUrl;
    private String avatarUrl;

    private String merchantStatus;

    private double latitude;
    private double longitude;

    private String phone;

    private String idCardNo;
    private String realName;
    private String merchantName;

    private String shopImageUrl;
    private String identifyType;
    private Boolean enablePwdFree;
    private Boolean hasSetPayPwd;

    public String getAddressRoomNo() {
        return addressRoomNo;
    }

    public void setAddressRoomNo(String addressRoomNo) {
        this.addressRoomNo = addressRoomNo;
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressDistrict() {
        return addressDistrict;
    }

    public void setAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getIdCardBackImageUrl() {
        return idCardBackImageUrl;
    }

    public void setIdCardBackImageUrl(String idCardBackImageUrl) {
        this.idCardBackImageUrl = idCardBackImageUrl;
    }

    public String getIdCardFrontImageUrl() {
        return idCardFrontImageUrl;
    }

    public void setIdCardFrontImageUrl(String idCardFrontImageUrl) {
        this.idCardFrontImageUrl = idCardFrontImageUrl;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(String merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getShopImageUrl() {
        return shopImageUrl;
    }

    public void setShopImageUrl(String shopImageUrl) {
        this.shopImageUrl = shopImageUrl;
    }

    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    public Boolean getEnablePwdFree() {
        return enablePwdFree;
    }

    public void setEnablePwdFree(Boolean enablePwdFree) {
        this.enablePwdFree = enablePwdFree;
    }

    public Boolean getHasSetPayPwd() {
        return hasSetPayPwd;
    }

    public void setHasSetPayPwd(Boolean hasSetPayPwd) {
        this.hasSetPayPwd = hasSetPayPwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "RespShopIdentify{" +
                "userId='" + userId + '\'' +
                ", addressProvince='" + addressProvince + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressDistrict='" + addressDistrict + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressRoomNo='" + addressRoomNo + '\'' +
                ", idCardBackImageUrl='" + idCardBackImageUrl + '\'' +
                ", idCardFrontImageUrl='" + idCardFrontImageUrl + '\'' +
                ", avatarUrl='" + avatarUrl + '\'' +
                ", merchantStatus='" + merchantStatus + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", phone='" + phone + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", realName='" + realName + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", shopImageUrl='" + shopImageUrl + '\'' +
                ", identifyType='" + identifyType + '\'' +
                ", enablePwdFree=" + enablePwdFree +
                ", hasSetPayPwd=" + hasSetPayPwd +
                '}';
    }
}
