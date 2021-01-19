package com.li.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: 一条IT
 * @Date: 2021/1/14 14:34
 */


@SpringBootApplication
@EnableConfigServer

public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344 .class,args);
    }
}

//http://config-3344.com:3344/main/config-dev.yml

//post请求  bus
//curl -X POST "http://localhost:3344/actuator/bus-refresh"

// 定点通知
//curl-X POST "http://localhost:3344/actuator/bus-refresh/config-client:3355"

//config-client:3355——>spring.application.name:server.port
