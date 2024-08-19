package com.java.designpatterns;

public class ProxyInternetAccess implements OfficeInternetAccess{
     private String empName;
	 private RealInternetAccess access;
	 public ProxyInternetAccess(String empName) {
		 this.empName = empName;
	 }
	 
	@Override
	public void grantInternetAccess() {
		if(getRole(empName) >4) {
			access = new RealInternetAccess(empName);
			access.grantInternetAccess();
		}else {
			System.out.println("No Internet Access granted. Your job level is below 5");
		}
		
	}
	
	public int getRole(String empName) {
		
		return 5;
	}
	
	

	
}
