package com.java.test;

public class BinaryNumber {
	
	public static void main(String args[]) {
		
		int number =9;
		
		int binaryNumber =0;
		
		int rem=0;
		int j=1;
		while(number !=0) {
			rem =number%2;
			binaryNumber+=rem*j;
			number = number/2;
			j =j*10;
			
		}
		
		System.out.println("binary Number: "+binaryNumber);
	}

}
