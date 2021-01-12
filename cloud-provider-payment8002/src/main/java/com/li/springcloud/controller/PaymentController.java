package com.li.springcloud.controller;

import com.li.springcloud.entities.CommonResult;
import com.li.springcloud.entities.Payment;
import com.li.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: 一条IT
 * @Date: 2020/11/5 14:33
 */

@RestController
//日志
@Slf4j
public class PaymentController {
//    Java自带的依赖注入：import javax.annotation.Resource;
    @Resource
    private PaymentService paymentService;
    @Value(value = "${server.port}")
    private String serverPort;

    //尽量用新的注解
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment)
    {
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);

        if(result > 0)
        {
            return new CommonResult(200,"插入数据库成功: "+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败:"+serverPort,null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment=paymentService.getPaymentById(id);
        log.info("********查询结果："+payment);

        if (payment!=null){
            return new CommonResult(200,"查询成功:"+serverPort,payment);

        }else {
            return new CommonResult(444,"查询失败，id="+id,null);
        }

    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }

}
