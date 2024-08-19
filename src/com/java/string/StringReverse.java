package com.java.string;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringReverse {
	
	public static void main(String args[]) {
		
		String input ="cat";
		
		char arr[] = input.toCharArray();
	     
		String rev = Stream.of(input.split("")).reduce("", (r, c) ->c+r);
		System.out.println(rev);
        
		
	}

}
