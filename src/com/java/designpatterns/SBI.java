package com.java.designpatterns;

public class SBI implements Bank {
   private final String bankName;
	public SBI() {
		bankName = "SBI";
	}
	@Override
	public String getBankName() {
		return bankName;
	}
	
}
