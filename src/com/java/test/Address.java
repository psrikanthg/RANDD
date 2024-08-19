package com.java.test;

public class Address {
	
	private String city;
	private String state;
	private String pinCode;
	private String houseNo;
	
	public Address(String city, String state, String pinCode, String houseNo) {
		this.city =city;
		this.state =state;
		this.pinCode =pinCode;
		this.houseNo =houseNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
	public String toString() {
		return "City: "+city+" State:"+state+" PinCode: "+pinCode+"House No:  "+houseNo;
	}

}
