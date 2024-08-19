package com.java.test;

public class KrishnaMurthyNumber {
	
	public static void main(String args[]) {
		
		int num =145;
		if(num ==isKrishnaMurthNumber(num)) {
			System.out.println("Krishna Murthy Number");
		}else {
			System.out.println("Not a Krishna Murth Number");
		}
		
		
	}
	
	public static int isKrishnaMurthNumber(int num) {
		
		if(num ==0) {
			return num;
		}
		
		int sum =0;
		int rem =0;
		while(num > 0) {
			rem = num%10;
			sum  = sum+factorialNumber(rem);
			num = num/10;
		}
		
		return sum;
	}
	
	public static int factorialNumber(int rem) {
		if(rem ==0 || rem ==1) {
			return rem;
		}
		
		int fact =1;
		while(rem > 0) {
			fact = fact*rem;
			rem= rem-1;
		}
		
		return fact;
		
	}

}
