package com.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.IOrderDao;
import com.order.model.OrderForm;
import com.order.service.IOrderService;

import my.com.base.BaseDao;
import my.com.base.impl.BaseService;

@Service
public class OrderServiceImpl extends BaseService<OrderForm> implements IOrderService {

	public OrderServiceImpl() {
		System.out.println("OrderServiceImpl---------------------------->");
	}

	@Autowired
	IOrderDao orderDao;

	@Override
	public BaseDao<OrderForm> getDao() {
		return orderDao;
	}

}
