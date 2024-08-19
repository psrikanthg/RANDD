package com.java.test;

public class PrimeNumberExample {
	
	public static void main(String args[]) {
		
		System.out.println(isPrime(4));
	}
	
  public static int isPrime(int num) {
	  
	  if(num ==0 || num ==1) {
		  System.out.println("Not a prime number");
		  return num;
	  }
	  int isPrime =0, m =num/2;
	  
	  for(int i =2; i<=m; i++) {
		  if(num%i ==0) {
			  isPrime =1;
		  }
	  }
	  
	  return isPrime;
  }

}
