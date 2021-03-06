package com.xinguang.tubobo.merchant.api.dto;

import java.io.Serializable;

/**
 * Created by yangxb on 2017/10/13.
 */
public class MerchantTypeDTO implements Serializable {

    private Long id;
    private String name; //名称
    private String describtion; //描述
    private Long temId;//对应模板id
    private String temName;//对应模板名称
    private Integer commissionRate;// 佣金比例
    private String createBy;
    private String updateBy;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Integer commissionRate) {
        this.commissionRate = commissionRate;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public Long getTemId() {
        return temId;
    }

    public void setTemId(Long temId) {
        this.temId = temId;
    }

    public String getTemName() {
        return temName;
    }

    public void setTemName(String temName) {
        this.temName = temName;
    }

    @Override
    public String toString() {
        return "MerchantTypeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", describtion='" + describtion + '\'' +
                ", temId=" + temId +
                ", temName='" + temName + '\'' +
                ", commissionRate=" + commissionRate +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}
