package com.java.designpatterns;
/*
 * structural design patterns are concerned with how classes n objects can be composed, to form larger 
 * strucutre
 * 
 * Adapter design pattern is one of the structural design pattern and 
 * it is used so that two unrelated interfaces can work together
 * 
 */
//When an object needs to utilize an existing class with an incompatible interface.
//When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
public class AdapterPatternDemo {
	
	public static void main(String args[]) {
		
		  CreditCard targetInterface=new BankCustomer();  
		  targetInterface.getBankDetails();  
		  System.out.print(targetInterface.getCreditCard()); 
	}
	
	 

}
