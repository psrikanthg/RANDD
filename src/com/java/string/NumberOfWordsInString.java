package com.java.string;

import java.util.Arrays;

public class NumberOfWordsInString {
	
	public static void main(String args[]) {
		
		String str = "This is a Java T Point";
		
		String arr[] =  str.split(" ");
		System.out.println(arr.length);
		
		long count  = Arrays.stream(str.split(" ")).count();
		System.out.println("Number Of words in String: "+count);
	}

}
