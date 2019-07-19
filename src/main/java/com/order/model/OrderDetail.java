package com.order.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.remote.entity.BaseModel;

import lombok.Data;
@Data
public class OrderDetail extends BaseModel implements Serializable {

	private static final long serialVersionUID = 146181311516056125L;

	private String orderNumber;
	private Long goodsId;
	private Integer amount;
	private BigDecimal unitPrice;
	private BigDecimal totalPrice;
	
	
	
	 
	
}
