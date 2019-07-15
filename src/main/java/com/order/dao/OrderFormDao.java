package com.order.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order.model.OrderForm;

@Mapper
public interface OrderFormDao extends BaseMapper<OrderForm> {

}
