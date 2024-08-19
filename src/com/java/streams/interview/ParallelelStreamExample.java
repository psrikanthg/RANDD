package com.java.streams.interview;

import java.util.Arrays;
import java.util.List;

public class ParallelelStreamExample {
	
	public static void main(String args[]) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		int listSum =numbers.parallelStream().mapToInt(n -> n).sum();
		System.out.println(listSum);
		
		int intListSum =numbers.stream().parallel().mapToInt(Integer::valueOf).sum();
		System.out.println(intListSum);
		
		
		int reduSum =numbers.stream().parallel().map(s -> Integer.valueOf(s)).reduce(0, (a, b) -> a+b);
		System.out.println(reduSum);         
		
		
		
	}

}
