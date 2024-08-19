package com.java.designpatterns;

public class ICICI implements Bank {
   private final String bankName;
   
   public ICICI() {
	   bankName = "ICICI";
   }
	
	@Override
	public String getBankName() {
		return bankName;
	}

}
