package com.java.map.interview;

import java.util.regex.Pattern;

public class RegexExample {
	
	public static void main(String args[]) {
		//.s represents single character
		boolean b2 = Pattern.compile("..s").matcher("mas").matches();
		System.out.println(b2);
		
		System.out.println(Pattern.matches("[amn]", "abcd"));
		
		System.out.println(Pattern.matches("[amn]", "a"));//true among a or m or n
		
		System.out.println(Pattern.matches("[amn]", "ammmna"));//false m n a comes more than once
		
		System.out.println(Pattern.matches("\\d", "abc")); //fase bcs non digit
		System.out.println(Pattern.matches("\\d", "1")); //true, it is digit
		
		
		System.out.println(Pattern.matches("\\d", "323abc")); //false digit n char
		
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32")); //true
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32")); // false more than 6 characters
		
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2")); //false $ not matched
		
		
		
		
	}

}
