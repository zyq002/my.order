package com.order.model;

import java.io.Serializable;
import java.util.Date;

import my.com.annotation.Id;

public class OrderDetail implements Serializable {

	private static final long serialVersionUID = 146181311516056125L;

	@Id
	private Long id;
	private String orderNumber;
	private Long goodsId;
	private Date createTime;
	private Date updateTime;
	private Integer isDel;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getIsDel() {
		return isDel;
	}

	public void setIsDel(Integer isDel) {
		this.isDel = isDel;
	}

	@Override
	public String toString() {
		return "OrderDetail [id=" + id + ", orderNumber=" + orderNumber + ", goodsId=" + goodsId + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", isDel=" + isDel + "]";
	}

}
