package com.java.test;

public class EmpireNumberExample {
	
	public static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<num; i++) 
			if(num%i==0)
		      return false;		
		
		
		return true;
	}
	
	public static boolean isEmpire(int n) {
		if(isPrimeNumber(n)==false)
			return false;
		
		int reverse =0;
		while(n!=0) {
			int digit = n%10;
			reverse = reverse*10+digit;
			n =n/10;
		}
		
		return isPrimeNumber(reverse);
	}
	
	
	public static void main(String args[]) {
		
		int number =79;
		System.out.println("emire Number::: "+isEmpire(number));
		
		int sphe = 742;
		
		
		System.out.println("Before Numeber: "+sphe);
		int revers =0;
		while(sphe>0) {
			revers = revers*10+sphe%10;
			sphe = sphe/10;
		}
		
		System.out.println("Reverse number:"+revers);
	}

}
