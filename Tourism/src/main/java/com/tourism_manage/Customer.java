package com.tourism_manage;

public class Customer {
	private int customer_id;
	private String customer_name;
	private String mobile_phone;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getMobile_phone() {
		return mobile_phone;
	}
	public void setMobile_phone(String mobile_phone) {
		this.mobile_phone = mobile_phone;
	}
	public Customer(int customer_id, String customer_name, String mobile_phone) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.mobile_phone = mobile_phone;
	}
	public Customer(String customer_name, String mobile_phone) {
		super();
		this.customer_name = customer_name;
		this.mobile_phone = mobile_phone;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", mobile_phone="
				+ mobile_phone + "]";
	}
}
