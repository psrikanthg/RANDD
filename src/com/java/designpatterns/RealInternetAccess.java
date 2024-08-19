package com.java.designpatterns;

public class RealInternetAccess implements OfficeInternetAccess {
    private String empName;
	public RealInternetAccess(String empName) {
		this.empName = empName;
		
	}
	
	@Override
	public void grantInternetAccess() {
		System.out.println("Internet Access granted for Employee "+empName);
		
	}

	
}
