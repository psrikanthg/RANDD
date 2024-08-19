package com.java.string;

public class StringEqualsEquals {
	
	public static void main(String args[]) {
		String s1 = "test";
		String s2 ="test";
		
		String s3 = new String("test");
		
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}
		
		if(s1 == s2) {
			System.out.println("Bot are equal");
		}
		
		if(s1==s3) {
			System.out.println("Not Pointing to Same Reference");
		}
		
	}

}
