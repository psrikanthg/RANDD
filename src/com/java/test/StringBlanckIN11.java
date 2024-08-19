package com.java.test;

public class StringBlanckIN11 {
	
	public static void main(String args[]) {
		String str ="test isBlanc emthod";
		System.out.println(str.isBlank());
		System.out.println("".isBlank());
		System.out.println("\t\n\r\f ".isBlank());
	}

}
