package com.li.springcloud;

import cn.hutool.json.JSONUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: 一条IT
 * @Date: 2020/11/11 9:25
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZkMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentZkMain8004.class,args);
        Map<String,String> rsmap=new LinkedHashMap<String,String>();
        rsmap.put("1","a");
        rsmap.put("2","b");
        rsmap.put("3","c");
        rsmap.put("4","d");
        String jsonStr = JSONUtil.toJsonStr(rsmap);
        System.out.println(jsonStr);
        for(Map.Entry<String,String> entry:rsmap.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }

    }
}
