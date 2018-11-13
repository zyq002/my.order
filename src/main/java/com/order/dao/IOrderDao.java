package com.order.dao;

import org.springframework.stereotype.Repository;

import com.order.model.Order;

import my.com.annotation.RegisterDto;
import my.com.base.BaseDao;

@Repository
@RegisterDto(Order.class)
public interface IOrderDao extends BaseDao<Order>{

}
