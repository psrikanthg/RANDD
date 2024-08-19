package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatinateStreams {
	
	
	public static void main(String args[]) {
		
		List<String> str1 = Arrays.asList("Java", "8");
		
		List<String>  str2 = Arrays.asList("explained", "through", "programs");
		
		List<String> result =  Stream.concat(str1.stream(), str2.stream()).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		
	}

}
