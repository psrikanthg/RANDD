package com.java.string;

public class RemoveCharInString1 {
	
	public static void main(String args[]) {
		String str ="This is my first program";
		System.out.println(removeCharacter(str, 8));
		
	}
	
	public static String removeCharacter(String str, int p) {
		
		return str.substring(0, p)+str.substring(p+1);
	}

}
