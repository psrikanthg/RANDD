package com.java.test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReverseString {
	
	public static void main(String args[]) {
		
		String str ="Hello World!!";
		String reverse="";
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse+str.charAt(i);
		}
		
		String rev = Stream.of(str.split("")).reduce("", (r, c) ->c+r);
		System.out.println(rev);
		
		System.out.println("After reversing string: "+reverse);
		String sub = "Shopee - Cancellation report 13/04/2022";
		System.out.println(""+sub.substring(0, sub.length()-11));
		
		
		List<String> list = Arrays.asList("SS", "SSMO");
		
		if(list.contains("SSHK")) {
			System.out.println("working for SSS");
		}
		
	}

}
