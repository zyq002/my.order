package com.order.dao;

import org.springframework.stereotype.Repository;

import com.order.model.OrderForm;

import my.com.annotation.RegisterDto;
import my.com.base.BaseDao;

@Repository
@RegisterDto(OrderForm.class)
public interface IOrderDao extends BaseDao<OrderForm>{

}
