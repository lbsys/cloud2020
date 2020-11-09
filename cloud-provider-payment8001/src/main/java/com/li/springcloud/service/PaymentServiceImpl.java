package com.li.springcloud.service;

import com.li.springcloud.dao.PaymentDao;
import com.li.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: 一条IT
 * @Date: 2020/11/5 14:21
 */

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment Payment) {
        return paymentDao.create(Payment);
    }

    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }


}
