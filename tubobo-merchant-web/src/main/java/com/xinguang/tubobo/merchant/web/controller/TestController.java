package com.xinguang.tubobo.merchant.web.controller;

import com.xinguang.tubobo.impl.merchant.mq.RmqTakeoutAnswerProducer;
import com.xinguang.tubobo.impl.merchant.service.MerchantThirdBindService;
import com.xinguang.tubobo.impl.merchant.service.OrderService;
import com.xinguang.tubobo.merchant.api.MerchantClientException;
import com.xinguang.tubobo.merchant.web.MerchantBaseController;
import com.xinguang.tubobo.takeout.TakeoutNotifyConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/test")
public class TestController extends MerchantBaseController<Object,Object>{

	@Autowired
	private OrderService orderService;
	@Autowired private MerchantThirdBindService bindService;
	@Autowired private RmqTakeoutAnswerProducer rmqTakeoutAnswerProducer;
	@Override
	protected Object doService(String userId, Object req) throws MerchantClientException {

//		bindService.bindMt(TakeoutNotifyConstant.PlatformCode.MT,userId,"aaa");
//		rmqTakeoutAnswerProducer.sendAccepted("YZ","30126","20170001","111",null);
		return null;
	}

	@Override
	protected boolean needLogin() {
		return false;
	}
}
