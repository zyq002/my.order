package com.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.order.dao.IOrderDao;
import com.order.model.Order;
import com.order.service.IOrderService;

import my.com.base.BaseDao;
import my.com.base.impl.BaseService;

public class OrderServiceImpl extends BaseService<Order> implements IOrderService {
	@Autowired
	IOrderDao orderDao;

	@Override
	public BaseDao<Order> getDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
