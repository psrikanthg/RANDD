package com.java.streams.interview;

import java.util.stream.IntStream;

public class PrimeNumber {
	
	public static void main(String args[]) {
		
		//write a program to check given number is prime or not
		System.out.println("square root of 29"+Math.sqrt(29));
		int num =37;
		if(num <=1) {
			System.out.println("Not A Prime Number");
		}
		
		boolean isPrime =IntStream.rangeClosed(2,num/2).noneMatch(n -> num%n ==0);
		System.out.println("is Prime Number "+isPrime);
		
	}
	
	

}
