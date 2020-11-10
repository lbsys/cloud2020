package com.li.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import com.li.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: 一条IT
 * @Date: 2020/11/5 14:00
 */

@Mapper
public interface PaymentDao {
//    新增订单
    public int create(Payment Payment);
//按照id查找订单
    public Payment getPaymentById(@Param("id") Long id);

}
