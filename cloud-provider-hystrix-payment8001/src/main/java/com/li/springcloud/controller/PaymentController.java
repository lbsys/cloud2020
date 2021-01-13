package com.li.springcloud.controller;

import com.li.springcloud.services.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 一条IT
 * @Date: 2021/1/11 15:06
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService PaymentService;

    @Value("${server.port}")
    private String severPort;

    @GetMapping("/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        String result = PaymentService.paymentInfo_OK(id);
        log.info("*******result:"+result);
        return result;
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String result = PaymentService.paymentInfo_TimeOut(id);
        log.info("*******result:"+result);
        return result;
    }

    //===服务熔断
    @GetMapping("/payment/circuit/{id}")
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        String result = PaymentService.paymentCircuitBreaker(id);
        log.info("*******result:"+result);
        return result;
    }

}
