package com.li.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 一条IT
 * @Date: 2020/11/6 15:19
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemple(){
        return new RestTemplate();
    }
}
//applictionContext.xml <bean id="" class="">
