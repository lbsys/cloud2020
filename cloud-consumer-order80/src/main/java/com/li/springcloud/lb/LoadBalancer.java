package com.li.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: 一条IT
 * @Date: 2021/1/10 17:34
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstance);

}
