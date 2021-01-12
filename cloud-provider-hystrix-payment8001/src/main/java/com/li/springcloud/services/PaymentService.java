package com.li.springcloud.services;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Author: 一条IT
 * @Date: 2021/1/11 14:32
 */

@Service
public class PaymentService {
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"\t paymentInfo_OK id:"+id+"\t"+"hahahah";
    }
    public String paymentInfo_TimeOut(Integer id){
        int timeout=3;
        //暂停线程几秒钟
        try { TimeUnit.SECONDS.sleep(timeout); }catch (Exception e) {e.printStackTrace();}
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：  "
                +id+"\t"+"呜呜呜"+" 耗时(秒)"+timeout;


    }
}
