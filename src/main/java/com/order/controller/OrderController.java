package com.order.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.order.model.OrderDetail;
import com.order.model.OrderForm;
import com.order.service.IOrderDetailService;
import com.order.service.IOrderService;
import com.remote.feignclient.IUserFeignClient;

import my.com.util.MakeOrderNum;

@RestController
@RefreshScope
public class OrderController {
	@Autowired
	IUserFeignClient userFeignClient;

	@Value("${demo.title}")
	private String name;

	@Autowired
	private IOrderService orderService;
	@Autowired
	IOrderDetailService orderDetailService;

	@RequestMapping("/send")
	public String send() {
		Map<String, Object> map = new HashMap<String, Object>();

		OrderForm order = orderService.getById(1L);
		OrderDetail orderDetail = orderDetailService.getById(1L);

		System.out.println("order----------------->" + order.toString());
		System.out.println("orderDetail----------------->" + orderDetail.toString());
		return "config" + name;
	}

	@RequestMapping("/testsend1")
	public String send2() {
		System.out.println("testsend10----------------------------------->");
		return "send1";
	}

	@RequestMapping(value = "/sendhello", method = RequestMethod.GET)
	public String hellofeign() {
		return userFeignClient.findUser();
	}

	@RequestMapping("/testsend")
	public String send1() {
		OrderForm o = new OrderForm();

		o.setAmount(new BigDecimal("123.3"));
		o.setStatus("D");
		o.setIsDel(1);
		// orderService.insert(o);
		return "config" + name;
	}

	@RequestMapping("/findUser")
	public String findUser() {
		return "findUser";
	}

}
