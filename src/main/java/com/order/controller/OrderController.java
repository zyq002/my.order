package com.order.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.Order;
import com.order.service.IOrderService;

import my.com.Util.MakeOrderNum;

@RestController
@RefreshScope
public class OrderController {

	@Value("${demo.title}")
	private String name;

	@Autowired
	private IOrderService orderService;

	@RequestMapping("/send")
	public String send() {
		Order o = new Order();
		o.setNumber(MakeOrderNum.getOrderNumber());
		o.setUserId(1L);
		o.setAmount(new BigDecimal("123.3"));
		o.setStatus("D");
		o.setIsDel(1);
		orderService.insert(o);
		return "config" + name;
	}

}
