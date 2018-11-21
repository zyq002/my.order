package com.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.order.dao.IOrderDetailDao;
import com.order.model.OrderDetail;
import com.order.service.IOrderDetailService;

import my.com.base.BaseDao;
import my.com.base.impl.BaseService;

public class OrderDetailServiceImpl extends BaseService<OrderDetail> implements IOrderDetailService {

	

	@Autowired
	IOrderDetailDao orderDetailDao;
	
	 

	
	@Override
	public BaseDao<OrderDetail> getDao() {
		return orderDetailDao;
	}

	 
}
