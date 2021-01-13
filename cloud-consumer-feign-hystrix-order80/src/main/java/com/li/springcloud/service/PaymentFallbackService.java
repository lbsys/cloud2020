package com.li.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: 一条IT
 * @Date: 2021/1/12 18:32
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService_paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService_paymentInfo_TimeOut";
    }
}
