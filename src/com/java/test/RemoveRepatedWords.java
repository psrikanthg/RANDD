package com.java.test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveRepatedWords {
	
	public static void main(String args[]) {
		 final String regex = "\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)";
		//final String regex = "\\b(\\w+)\\b\\s";
		String input = "Goodbye bye  123 123 ? ? ? bye world world world\n";
		
		Scanner sty = new Scanner(System.in);
		//String input =  sty.nextLine();
		
		Pattern p = Pattern.compile(regex);
		 Matcher m = p.matcher(input);
		 while (m.find()) {
             input = input.replaceAll(regex, "");
         }
		//final String result = input.replaceAll(regex, "");
		System.out.println(input);
		
		String str33=  "hello";
		char tempArr[] =  str33.toCharArray();
		Arrays.sort(tempArr);
		System.out.println(Arrays.toString(tempArr));
		
		String str4 = "hello";
		System.out.println(str4.substring(0, 1).toUpperCase()+str4.substring(1, str4.length()));
		
			String A="hello";
	        String B="java";
	        int sum = A.length()+B.length();
	        System.out.println(sum);
	        int n = A.compareTo(B);
	        if(n> 0){
	            System.out.println("Yes");
	        }else {
	            System.out.println("No");
	        }
	         System.out.print(A.substring(0, 1).toUpperCase());
	         System.out.print(A.substring(1));
	         System.out.print(B.substring(0, 1).toUpperCase());
	         System.out.print(B.substring(1));
	}

}
