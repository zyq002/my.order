package com.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.order.model.OrderForm;

import my.com.common.Page;

public interface IOrderService  extends IService<OrderForm>  {
	Page<OrderForm> getOrderByUserCode(Page<OrderForm> page, String userCode);
}
