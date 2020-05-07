package com.example.springcloud.service.impl;

import com.example.springcloud.dao.PaymentDao;
import com.example.springcloud.entities.Payment;
import com.example.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author papi
 * @data 2020/4/18
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPayment(Long id) {
        return paymentDao.getPayment(id);
    }
}
