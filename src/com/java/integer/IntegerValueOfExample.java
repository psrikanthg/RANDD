package com.java.integer;

public class IntegerValueOfExample {
	
	public static void main(String args[]) {
		String s = "42.03";
		
		  int n1 = Integer.parseInt(s); //throws run time exception, Exception in thread "main" java.lang.NumberFormatException: For input string: "42.03"
		  int n2 = Integer.valueOf(s); //gives number format exception
		  System.out.println(n2);
		  System.out.println(n1+"  "+n2);
		
		try{
			int x=Integer.parseInt("two");

			}catch(ClassCastException ex){
               
			}
	}

}
