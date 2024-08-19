package com.java.string;

public class StringLength {
	
	public static void main(String... args){
		String sLngth = "length";
		
		System.out.printf("%s length is "+sLngth.length(), sLngth); //works fine, starts from 1
		
		String empty = "";
		System.out.printf("%s length is "+empty.length(), empty);//give 0, works fine no issues
		
		String stNull =null;
		//System.out.printf(" %s lenght is "+stNull.length(), stNull); //give runt time exception, null pointer exception
		
		
		System.out.println("".length());//works fine, no compile time run time exceptions.
		
		//System.out.println(null); // compile time exception
		
		String sSpace = " ";
		System.out.printf("%s length is "+sSpace.length(), sSpace);// it considered as space as char so length is 1
		
		String sWordsSpace = " string ";
		System.out.println("the lenght of the "+sWordsSpace.length());
		
		String str = "learning javascript";
		
		System.out.println(str.codePointBefore(3)); // returns the character unicode point
		
		
		
	}

}
