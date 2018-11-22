package com.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.dao.IOrderDetailDao;
import com.order.model.OrderDetail;
import com.order.service.IOrderDetailService;

import my.com.base.BaseDao;
import my.com.base.impl.BaseService;
@Service
public class OrderDetailServiceImpl extends BaseService<OrderDetail> implements IOrderDetailService {

	

	@Autowired
	IOrderDetailDao orderDetailDao;
	
	 

	
	@Override
	public BaseDao<OrderDetail> getDao() {
		return orderDetailDao;
	}

	 
}
