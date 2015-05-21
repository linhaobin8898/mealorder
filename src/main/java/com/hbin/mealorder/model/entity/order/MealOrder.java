package com.hbin.mealorder.model.entity.order;

import java.util.Date;

import com.lifesense.framework.mybatis.entity.id.UUIDEntity;
import com.lifesense.framework.mybatis.interceptor.generatesql.annotation.Id;

@SuppressWarnings("serial")
public class MealOrder implements UUIDEntity {

	@Id
	private String id;

	private Date created;
	
	private Double total;

	private Integer status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
