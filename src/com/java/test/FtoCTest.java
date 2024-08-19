package com.java.test;

public class FtoCTest {
	
	public static void main(String args[]) {
		
		FtoC conver =  (var f)->(f-32.0)*5/9;
		FtoC conver1 = (var f)->(f-32.0)*5/9;
		System.out.println(conver.convert(10));
	}

}
