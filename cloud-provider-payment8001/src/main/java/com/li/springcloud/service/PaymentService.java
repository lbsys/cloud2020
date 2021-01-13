package com.li.springcloud.service;

import com.li.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author: 一条IT
 * @Date: 2020/11/5 14:20
 */

@Component
public interface PaymentService {
    public int create(Payment Payment);

    public Payment getPaymentById(@Param("id") Long id);


}
