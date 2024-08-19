package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartingWithOne {
	
	public static void main(String args[]) {
		
		List<Integer> nums =  Arrays.asList(10, 15, 8, 20, 2, 9, 20);
		nums.stream().map(s->s+"").filter(f -> f.startsWith("1")).collect(Collectors.toList()).
		forEach(System.out::println);
		
	}

}
