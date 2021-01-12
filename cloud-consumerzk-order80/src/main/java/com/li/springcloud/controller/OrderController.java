package com.li.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: 一条IT
 * @Date: 2020/11/11 10:03
 */

@RestController
@Slf4j
public class OrderController {
    private static final String url="http://cloud-provider-payment";

    @Resource
    private RestTemplate RestTemplate;

    @RequestMapping(value = "consumer/payment/zk",method = RequestMethod.GET)
    public String orderzk(){
        String result = RestTemplate.getForObject(url + "/payment/zk", String.class);
        return result;
    }
}
