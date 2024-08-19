package com.java.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsInIntegers {
	
	
	public static void main(String args[]) {
		
		List<Integer> nums = Arrays.asList(10, 10, 20, 20, 1, 2, 3, 4, 5, 6);
		
		Set<Integer> sets = new HashSet<>();
		for(Integer i: nums) {
			boolean b = !sets.add(i);
			System.out.println(b);
		}
		sets.clear();
		
		nums.stream().filter(s -> !sets.add(s)).collect(Collectors.toList()).forEach(System.out::println);
		
		
		
	}

}
