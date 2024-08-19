package com.java.abstractfactor;

public class ICICI implements Bank {
    
	private final String bName;
	
	public ICICI() {
		bName ="ICIC";
	}
	 
	@Override
	public String getBank() {
		return bName;
	}
 
	
}
