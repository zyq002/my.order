package com.order.model;

import java.math.BigDecimal;

import com.remote.entity.base.BaseModel;

import lombok.Data;
@Data
public class OrderDetail extends BaseModel   {

	 
	private String orderNumber;
	private Long goodsId;
	private String goodsName;
	private Integer amount;
	private BigDecimal unitPrice;
	private BigDecimal totalPrice;
	
	
	
	 
	
}
