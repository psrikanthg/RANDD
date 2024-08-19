package com.java.designpatterns;

public class HDFC  implements Bank{
    private final String bankName = "hdfc";
    
	@Override
	public String getBankName() {
		return bankName;
	}

}
