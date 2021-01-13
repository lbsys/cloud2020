package com.li.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author: 一条IT
 * @Date: 2021/1/13 10:32
 */

@SpringBootApplication
@EnableHystrixDashboard
public class OrderHystrixDashboardMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixDashboardMain9001.class,args);
    }

}
