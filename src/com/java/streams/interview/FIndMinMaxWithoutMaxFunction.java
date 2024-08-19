package com.java.streams.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FIndMinMaxWithoutMaxFunction {
	
	public static void main(String args[]) {
		
		int arr[] = { 2, 3, 1, 22, 11, 33, 5 };
		
		int max =  Arrays.stream(arr).boxed().reduce(Integer.MIN_VALUE, (a, b) -> Integer.max(a, b)).intValue();
		System.out.println("Max: "+max);
		
		int min = Arrays.stream(arr).boxed().reduce(Integer.MAX_VALUE, (a, b) -> Integer.min(a, b)).intValue();
		System.out.println("Mininum: "+min);
		
		System.out.println("using method Reference");
		
		int max1 = Arrays.stream(arr).boxed().reduce(Integer::max).get();
		System.out.println("Max1: "+max1);
		
		
		int min1 = Arrays.stream(arr).boxed().reduce(Integer::min).get();
		System.out.println("Min1:: "+min1);
		
		int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
		
		System.out.println("2nd Highest Number ");
		int secondHigest =  Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findAny().get();
		System.out.println(secondHigest);
		System.out.println("2nd Lowest Number");
		int secondLowest = Arrays.stream(a).boxed().sorted().skip(1).findAny().get();
		System.out.println(secondLowest);
		
		int majorityArray[] = { 5, 3, 2, 1, 2, 4, 3, 2, 2, 6, 2, 3, 2, 2, 2 };
		//int notMajorityArray[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
		int majorityElement = Arrays.stream(majorityArray).boxed().
				collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()))
				.entrySet().stream().filter(k -> k.getValue() >=a.length/2).map(Entry::getKey).findFirst().orElse(0);
		System.out.println("Majority ELement found: "+majorityElement);
		
		System.out.println("Sum Array Without Using Sum Method");
		
		 int c[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
		 
		 int sumWithOutSum =  Arrays.stream(c).boxed().reduce(0, (x, y) ->x+y).intValue();
		 System.out.println("Total Sum without using total Sum :"+sumWithOutSum);
		
		
		
		
		
	}

}
