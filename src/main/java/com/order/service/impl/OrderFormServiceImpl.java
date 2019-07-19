package com.order.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.order.dao.OrderFormDao;
import com.order.model.OrderForm;
import com.order.service.IOrderService;

import my.com.common.Page;

@Service
public class OrderFormServiceImpl extends ServiceImpl<OrderFormDao, OrderForm> implements IOrderService {

	@Override
	public Page<OrderForm> getOrderByUserCode(Page<OrderForm> page, String userCode) {
		page = (Page<OrderForm>) baseMapper.selectPage(page, new QueryWrapper<OrderForm>().eq("", userCode));
		return null;
	}

}
