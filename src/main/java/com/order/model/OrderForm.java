package com.order.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.remote.entity.BaseModel;
import com.user.model.SiteUser;

import lombok.Data;
@Data
public class OrderForm extends BaseModel implements Serializable {

	private static final long serialVersionUID = 146181311516056125L;

	private String userCode;

	private BigDecimal amount;

	private String status;

 

	@Override
	public String toString() {
		return "OrderForm [userCode=" + userCode + ", amount=" + amount + ", status=" + status + ", getUserCode()="
				+ getUserCode() + ", getAmount()=" + getAmount() + ", getStatus()=" + getStatus() + ", getId()="
				+ getId() + ", getCreateTime()=" + getCreateTime() + ", getCreateCode()=" + getCreateCode()
				+ ", getUpdateTime()=" + getUpdateTime() + ", getUpdateCode()=" + getUpdateCode() + ", getIsDel()="
				+ getIsDel() + "]";
	}

}
