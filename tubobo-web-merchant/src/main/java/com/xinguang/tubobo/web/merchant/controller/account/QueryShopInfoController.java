package com.xinguang.tubobo.web.merchant.controller.account;

import com.xinguang.tubobo.api.ClientException;
import com.xinguang.tubobo.api.enums.EnumRespCode;
import com.xinguang.tubobo.impl.merchant.entity.MerchantInfoEntity;
import com.xinguang.tubobo.impl.merchant.service.MerchantInfoService;
import com.xinguang.tubobo.web.merchant.MerchantBaseController;
import com.xinguang.tubobo.web.merchant.response.MerchantInfoResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/4/14.
 */
@Controller
@RequestMapping("/info/query")
public class QueryShopInfoController extends MerchantBaseController<Object,MerchantInfoResponse> {

    @Autowired
    MerchantInfoService merchantInfoService;
    @Override
    protected MerchantInfoResponse doService(String userId, Object req) throws ClientException {
        MerchantInfoEntity entity = merchantInfoService.findByUserId(userId);
        if (null == entity){
            throw new ClientException(EnumRespCode.MERCHANT_NOT_EXISTS);
        }
        MerchantInfoResponse response = translateEntityToResponse(entity);
        return response;
    }

    private MerchantInfoResponse translateEntityToResponse(MerchantInfoEntity merchantInfoEntity){
        MerchantInfoResponse response= new MerchantInfoResponse();
        BeanUtils.copyProperties(merchantInfoEntity,response);
        return response;
    }
}
