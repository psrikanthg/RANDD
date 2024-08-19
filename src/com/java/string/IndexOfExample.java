package com.java.string;

public class IndexOfExample {
	
	public static void main(String args[]) {
		String s1="this is index of example";  
		//index of two overloaded methods
		//int java.lang.String.indexOf(int ch)
		//s1.indexOf(String s) of string type
		//int java.lang.String.indexOf(String str)
		System.out.println(s1.indexOf('i'));
		System.out.println(s1.indexOf('e'));
		System.out.println(s1.indexOf("i"));//prints 2 this starts with this
	   
		System.out.println(s1.indexOf("A")); //returns -1 as A not found in the string
	
	}

}
