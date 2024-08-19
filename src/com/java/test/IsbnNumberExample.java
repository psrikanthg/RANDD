package com.java.test;

public class IsbnNumberExample {
	
	public static void main(String args[]) {
		
		long number = 1259060977;
		checkISISBNNumber(number);
	}
	
	public static boolean checkISISBNNumber(long number) {
		
		String strNumber = ""+number;
		System.out.println("Stri Number"+strNumber);
		int sum =0;
		int dNumber =0, inNumber =0, t =0;
		if(strNumber.length() !=10) {
			return false;
		}
		
		for(int  i=0; i<strNumber.length(); i++) {
			inNumber =  Integer.parseInt(strNumber.substring(i, i+1));
			dNumber = i+1;
			t = dNumber*inNumber;
			sum =sum+t;
			
		}
		
		if(sum%11==0) {
			return true;
		}
		
		return false;
	}

}
