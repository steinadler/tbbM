package com.xinguang.tubobo.impl.merchant.handler;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.impl.AMQImpl;
import com.xinguang.tubobo.impl.merchant.service.MerchantOrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;

/**
 * Created by Administrator on 2017/4/15.
 */
public class OrderPayTimeoutHandler  {
//    @Autowired
//    MerchantOrderService merchantOrderService;
//    Logger logger = LoggerFactory.getLogger(OrderPayTimeoutHandler.class);
//    @Override
//    public void onMessage(Message message, AMQImpl.Channel channel) throws Exception {
////        logger.info("开始处理延时队列的消息...");
////        String orderNo = new String(message.getBody());
////        merchantOrderService.adminClose(orderNo);
//        //TODO 通知订单超时未支付
//    }
}