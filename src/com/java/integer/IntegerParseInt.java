package com.java.integer;

public class IntegerParseInt {
	
	public static void main(String args[]) {
		
		char c ='t';
		//convering char to integer, gives compiler time error
		//The method parseInt(String) in the type Integer is not applicable for the arguments (char)
		//The method parseInt(String) in the type Integer is not applicable for the arguments (char)
		int n1= Integer.parseInt(c);
		int n2 = Integer.parseInt("two"); //gives number format exception at run time
		
		System.out.println(n1+"  "+c+"  "+n2);
	}

}
