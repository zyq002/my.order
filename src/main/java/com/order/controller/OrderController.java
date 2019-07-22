package com.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.OrderForm;
import com.order.service.IOrderDetailService;
import com.order.service.IOrderService;

import my.com.common.Page;

@RestController
@RefreshScope
public class OrderController {
  
	@Autowired
	IOrderService orderService;
	@Autowired
	IOrderDetailService orderDetailService;

 

	@RequestMapping(value = "/getOrderByUserCode", method = RequestMethod.GET)
	public Page<OrderForm> getOrderByUserCode(Page page, String userCode) {
		return orderService.getOrderByUserCode(page, userCode);
	}

}
