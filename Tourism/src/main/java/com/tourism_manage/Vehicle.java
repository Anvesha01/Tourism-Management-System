package com.tourism_manage;

public class Vehicle {
	private int vehicle_id;
	private String vehicle_type;
	private String vehicle_name;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int vehicle_id, String vehicle_type, String vehicle_name) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicle_type = vehicle_type;
		this.vehicle_name = vehicle_name;
	}
	@Override
	public String toString() {
		return "Vehicle [vehicle_id=" + vehicle_id + ", vehicle_type=" + vehicle_type + ", vehicle_name=" + vehicle_name
				+ "]";
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	
}
