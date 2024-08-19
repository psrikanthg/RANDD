package com.java.test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyArrayElements {
	
	public static void main(String args[]) {
		
		int arrfreq[] = new int[] {1, 2, 3, 1, 2, 3, 4, 5, 6};
		
		
		Map<Integer, Long>  map = Arrays.stream(arrfreq)
				.boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(map);
		
	}

}
