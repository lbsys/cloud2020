package com.li.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: 一条IT
 * @Date: 2020/11/11 19:38
 */

@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/payment/consul")
    public String paymentConsul()
    {
        return "springcloud with consul:"+serverPort+ UUID.randomUUID().toString();
    }

}
