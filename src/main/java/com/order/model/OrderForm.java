package com.order.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.remote.entity.BaseModel;

import my.com.annotation.Id;

public class OrderForm extends BaseModel implements Serializable {

	private static final long serialVersionUID = 146181311516056125L;

	private String userCode;

	private BigDecimal amount;

	private String status;

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderForm [userCode=" + userCode + ", amount=" + amount + ", status=" + status + ", getUserCode()="
				+ getUserCode() + ", getAmount()=" + getAmount() + ", getStatus()=" + getStatus() + ", getId()="
				+ getId() + ", getCreateTime()=" + getCreateTime() + ", getCreateCode()=" + getCreateCode()
				+ ", getUpdateTime()=" + getUpdateTime() + ", getUpdateCode()=" + getUpdateCode() + ", getIsDel()="
				+ getIsDel() + "]";
	}

}
