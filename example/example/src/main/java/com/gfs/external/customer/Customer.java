package com.gfs.external.customer;

public class Customer {

	private String id;
	private String name;
	private CreditStatus creditStatus;
	
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
	public CreditStatus getCreditStatus() {
		return creditStatus;
	}
	public void setCreditStatus(CreditStatus creditStatus) {
		this.creditStatus = creditStatus;
	}
}
