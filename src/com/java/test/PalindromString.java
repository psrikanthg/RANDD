package com.java.test;

import java.util.Arrays;

public class PalindromString {
	
	public static void main(String args[]) {
		
		String str = "Madam";
		System.out.println("Split:: "+Arrays.toString(str.split("")));
		boolean flag =true;
		str = str.toLowerCase();
		
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) !=str.charAt(str.length()-i-1)) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Palindrom String :"+str);
		}else {
			System.out.println("Not a Palindrom String");
		}
		
		
	}

}
