package com.java.string;

public class RemoveCharInString {
	
	public static void main(String args[]) {
		//how to remove particular char in string
		String str = "India is my country";
		 System.out.println(charRemoveAt(str, 7));  
		
		
	}
	
	public static String charRemoveAt(String str, int p) {
		
		return str.substring(0, p)+str.substring(p+1);
	}

}
