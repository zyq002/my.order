package com.order.model;

import java.math.BigDecimal;

import com.remote.entity.base.BaseModel;

import lombok.Data;
@Data
public class OrderForm extends BaseModel {

 
	private String orderNumber;
	
	private String userCode;

	
	private BigDecimal totalPrice;

	private String status;
	
	
 
 

}
