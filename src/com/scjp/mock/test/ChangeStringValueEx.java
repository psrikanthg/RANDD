package com.scjp.mock.test;

public class ChangeStringValueEx {
	
	public static void main (String args[]){
		
		String value ="abc";
		
		changeThevalue(value);
		System.out.println(value); /*//Java pass reference as value. passing the object reference, and not the actual object itself.
		Simply reassigning to the parameter used to pass the value into the method will do
			nothing, because the parameter is essentially a local variable.*/
	}
	
	
	public static void changeThevalue(String a){
		
		a ="xyz";
	}

}
