package com.java.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountNoOfDuplicates {
	
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(1,2, 3, 4, 5, 6, 7, 8, 9, 9, 9,9,10);
		Set<Integer> set = new HashSet<>(list);
		System.out.println("No of Duplicate Elements: "+(list.size()-set.size()));
		
	}

}
