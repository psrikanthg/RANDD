package com.java.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNumbers {
	
	public static void main(String args[]) {
		List<Integer> nums =  Arrays.asList(60, 50, 34, 15, 1, 10, 20, 16);
		
		nums.stream().sorted().forEach(System.out::println);
		System.out.println("Revers Order:: ");
		nums.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
		
	}

}
