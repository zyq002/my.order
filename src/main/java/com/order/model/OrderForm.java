package com.order.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.remote.entity.BaseModel;

import lombok.Data;
@Data
public class OrderForm extends BaseModel implements Serializable {

	private static final long serialVersionUID = 146181311516056125L;

	private String orderNumber;
	
	private String userCode;

	
	private BigDecimal totalPrice;

	private String status;
	
	
 
 

}
