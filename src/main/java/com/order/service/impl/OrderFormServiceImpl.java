package com.order.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.order.dao.OrderFormDao;
import com.order.model.OrderForm;
import com.order.service.IOrderService;

@Service
public class OrderFormServiceImpl extends ServiceImpl<OrderFormDao, OrderForm> implements IOrderService {

}
