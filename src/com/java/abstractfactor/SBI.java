package com.java.abstractfactor;

public class SBI implements Bank {
	
	private final String BNAME;
	
	public SBI() {
		BNAME ="SBI";
	}
	

	@Override
	public String getBank() {
		return BNAME;
	}
 
	
}
