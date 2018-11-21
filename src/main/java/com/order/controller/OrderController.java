package com.order.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.OrderForm;
import com.order.service.IOrderService;

import my.com.Util.MakeOrderNum;

@RestController
@RefreshScope
public class OrderController {

	public OrderController() {
		System.out.println("OrderController---------------------------->");
	}

	@Value("${demo.title}")
	private String name;

	@Autowired
	private IOrderService orderService;

	@RequestMapping("/send")
	public String send() {
		Map<String, Object> map = new HashMap<String, Object>();
		OrderForm order = orderService.queryById("123456");
		System.out.println(order.toString());
		return "config" + name;
	}

	@RequestMapping("/testsend")
	public String send1() {
		OrderForm o = new OrderForm();
		o.setNumber(MakeOrderNum.getOrderNumber());
		o.setUserId(1L);
		o.setAmount(new BigDecimal("123.3"));
		o.setStatus("D");
		o.setIsDel(1);
		// orderService.insert(o);
		return "config" + name;
	}

}
