package com.order.dao;

import org.springframework.stereotype.Repository;

import com.order.model.OrderDetail;
import com.order.model.OrderForm;

import my.com.annotation.RegisterDto;
import my.com.base.BaseDao;

@Repository
@RegisterDto(OrderDetail.class)
public interface IOrderDetailDao extends BaseDao<OrderDetail>{

}
