package com.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.order.model.OrderForm;
import com.order.model.Report;
import com.order.service.IOrderDetailService;
import com.order.service.IOrderService;

import lombok.extern.slf4j.Slf4j;
import my.com.common.Page;

@Slf4j
@RestController
@RefreshScope
@RequestMapping(value = "/order")
public class OrderController {

	@Autowired
	IOrderService orderService;
	@Autowired
	IOrderDetailService orderDetailService;

	@Autowired
	protected PlatformTransactionManager transactionManager;

	@RequestMapping(value = "/a", method = RequestMethod.GET)
	public String a() {

		return String.format("Event sent: %s", "ss");
	}

	@RequestMapping(value = "/getOrderByUserCode", method = RequestMethod.GET)
	public Page<OrderForm> getOrderByUserCode(Page page, String userCode) {
		return orderService.getOrderByUserCode(page, userCode);
	}

	@RequestMapping(value = "/getMhkReportDataList", method = RequestMethod.POST)
	public JSONObject getMhkReportDataList(String sign, String timestamp, String serviceNumber) {
		JSONObject json = new JSONObject();
		json.put("code", 200);
		json.put("msg", "");
		Report r1 = new Report();
		r1.setPdfFile(
				"http://yjk-test-1258316165.cos.ap-shanghai.myqcloud.com/mhk_pdf/89999201810000801_v485627_20190726145632.pdf");
		r1.setServiceNumber("2019081315");
		r1.setVid("100000000");
		r1.setType("1");
		Report r2 = new Report();
		r2.setPdfFile(
				"http://yjk-test-1258316165.cos.ap-shanghai.myqcloud.com/mhk_pdf/89999201810000801_v485627_20190726145632.pdf");
		r2.setServiceNumber("2019081315");
		r2.setVid("100000001");
		r2.setType("2");
		Report r3 = new Report();
		r3.setPdfFile(
				"http://yjk-test-1258316165.cos.ap-shanghai.myqcloud.com/mhk_pdf/89999201810000801_v485627_20190726145632.pdf");
		r3.setServiceNumber("2019081315");
		r3.setVid("100000002");
		r3.setType("2");
		List<Report> list = new ArrayList<>();
		list.add(r1);
		list.add(r2);
		list.add(r3);
		json.put("data", list);
		return json;
	}
}
