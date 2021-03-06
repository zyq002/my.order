package com.order.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.order.model.OrderDetail;

@Mapper
public interface IOrderDetailDao extends BaseMapper<OrderDetail> {

}
