package com.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class OrderController {

	public OrderController() {
		System.out.println("OrderController---------------->");
	}

	@Value("${demo.title}")
	private String name;

	@RequestMapping("/send")
	public String send() {
		System.out.println(name);
		return "config" + name;
	}

}
