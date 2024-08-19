package com.java.designpatterns;
/*
 * it provides the protection to the original object from the outside world.
 * 
 * provides the control for accessing the original object
 * 
 */
public class ProxyPatternClient {
	
	public static void main(String args[]) {
		OfficeInternetAccess access = new ProxyInternetAccess("Sreekanth");
		access.grantInternetAccess();
	}

}
