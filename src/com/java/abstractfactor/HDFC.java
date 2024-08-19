package com.java.abstractfactor;

public class HDFC implements Bank {
   
	private final String  bankName;
	
	public HDFC() {
		bankName = "HDFC";
	}
	
	
	@Override
	public String getBank() {
		return bankName;
	}

}
