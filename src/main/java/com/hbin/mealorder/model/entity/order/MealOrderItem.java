package com.hbin.mealorder.model.entity.order;

import java.util.Date;

import com.lifesense.framework.mybatis.entity.id.UUIDEntity;
import com.lifesense.framework.mybatis.interceptor.generatesql.annotation.Id;

@SuppressWarnings("serial")
public class MealOrderItem implements UUIDEntity {

	@Id
	private String id;

	private String accountId;

	private Double price;

	private Integer quantity;

	private Date created;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
