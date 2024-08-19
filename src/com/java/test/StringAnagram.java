package com.java.test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAnagram {
	
	public static void main(String args[]) {
		
		
		
		
		String stg ="Brag", str2 =  "Grbb";
		
		stg = stg.toLowerCase();
		str2 = str2.toLowerCase();
		
		System.out.println(stg+" "+str2);
		
		if(stg.length() != str2.length()) {
			System.exit(0);
		 }else {
			 
			 char char1[] = stg.toCharArray();
			 char char2[] = str2.toCharArray();
			 Arrays.sort(char1);
			 Arrays.sort(char2);
			 
			 if(Arrays.equals(char1,char2)) {
				 System.out.println("Anagram word");
			 }else {
				 System.out.println("Not a Anagrm Word");
			 }
		 }
		
		String str3 = Stream.of(stg.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		String str4 = Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		System.out.println(str3+"  "+str4);
		
	}

}
