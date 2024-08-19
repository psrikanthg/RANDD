package com.java.designpatterns;
//Adaptee class
//this is class which is used by Adapter class to reuse the existing functionality n modify them for desired case
public class BankDetails {

	private String bankName;
	private String accHolderName;
	private long accNumber;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	
	
}
