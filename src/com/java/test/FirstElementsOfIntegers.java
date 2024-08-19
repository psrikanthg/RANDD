package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstElementsOfIntegers {
	
	public static void main(String args[]) {
		
		List<Integer> nums =  Arrays.asList(10, 20, 30, 40, 50);
		
		Optional<Integer> first = nums.stream().findFirst();
		Optional<Integer> last = nums.stream().findAny();
		System.out.println("Total Eleemnts count: "+nums.stream().count());
		
		System.out.println("Max Elements: "+nums.stream().max(Integer::compare).get());
		
		System.out.println("Min Elements: "+nums.stream().min(Integer::compare).get());
		
		if(first.isPresent()) {
			System.out.println("First Element found: "+first.get());
		}
		
		if(last.isPresent()) {
			System.out.println("First Element found: "+last.get());
		}
		
		
	}

}
