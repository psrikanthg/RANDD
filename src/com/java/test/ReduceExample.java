package com.java.test;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceExample {
	
	public static void main(String args[]) {
		int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int sum  = Arrays.stream(nums).reduce(0, (v1,v2)->v1+v2);
		System.out.println("Sum of Number:"+sum);
		
		Stream<Integer> s1 = Stream.of(1,2,3,4,5,6,7,8);
		IntStream s2 = s1.mapToInt(i->i);
		System.out.println(s2.sum());
		
	}

}
