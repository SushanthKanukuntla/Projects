package com.gfs.external.item;

import java.math.BigDecimal;

public class Item {

	private String id;
	private String name;
	private BigDecimal cost;

	public String getId() {
		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
}
