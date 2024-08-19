package com.java.test;

import java.util.stream.IntStream;

public class FibanaciSeries {
	
	public static void main(String args[]) {
		
		int num =1;
		int i=0, j=1, finb=0;
		System.out.println(i);
		System.out.println(j);
		while(num !=10) {
			finb = i+j;
			i =j;
			j = finb;
			num++;
			System.out.println(finb);
		}
		
		int number =5, fact =1;
		
		for(int b=1; b<=number; b++) {
			fact = fact*b;
		}
		
		System.out.println("Factorial: "+fact);
		
		int isPrime = 37;
		//1 n 2 are not prime numbers
		
		boolean prime= IntStream.rangeClosed(2, isPrime/2).noneMatch(n -> isPrime%n ==0);
		System.out.println("is Prime: "+prime);
		
		palindromNumber();
		armStrongNumber();
	}
	
	public static void armStrongNumber() {
		
		int arm =153;
		int armStrongNumber = 0, rem =0;
		
		while(arm!=0) {
			rem = arm%10;
			armStrongNumber = rem*rem*rem+armStrongNumber;
			arm = arm/10;
		}
		
		System.out.println(armStrongNumber);
	}
	
	public static void palindromNumber() {
		
		
		int rever =0, rem =0;
		int palindrom =  121;
		while(palindrom !=0) {
			rem = palindrom%10;
			rever=  rever*10+rem;
			palindrom = palindrom/10;
		}
		
		System.out.println(rever);
		
		
	}

}
