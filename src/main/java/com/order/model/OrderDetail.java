package com.order.model;

import java.io.Serializable;
import java.util.Date;

import com.remote.entity.BaseModel;

import my.com.annotation.Id;

public class OrderDetail extends BaseModel implements Serializable {

	private static final long serialVersionUID = 146181311516056125L;

	private String orderNumber;
	private Long goodsId;

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	
	
}
