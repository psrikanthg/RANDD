package com.java.test;

public class AutoIncrement {
	
	public static void main(String args[]) {
		String str = "CUST03617439";
		String str1= str.substring(0, 4);
		
		System.err.println(str1);
		String str2 = str.substring(4, str.length());
		System.err.println(str2);
		int num = Integer.valueOf(str2)+1;
		System.err.println(num);
		
	}

}
