package com.java.test;

public class PalindromNumber {
	
	public static void main(String args[]) {
		int num =546;
		if(num == isPalindromNumber(num)) {
			System.out.println("Palindrom Number");
		}else {
			System.out.println("Not a Palindrom Number");
		}
		
	}

	 public static int isPalindromNumber(int num) {
		 
		 if(num ==0) {
			 return num;
		 }
		 
		 int rever =0, rem =0;
		 while(num> 0) {
			 rem =  num%10;
			 rever =  rever*10+rem;
			 num = num/10;
		 }
		 
		 return rever;
	 }
}
