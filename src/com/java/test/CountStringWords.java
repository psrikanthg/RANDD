package com.java.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountStringWords {
	
	
	public static void main(String args[]) {
		
		 List<String> stringList = Arrays.asList("AA", "BB", "CC", "AA", "DD");
		
		 Map<String, Long> mapKeys = stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 System.out.println("Keys are:: "+mapKeys);
		 
		 List<String> stringList1 = Arrays.asList("AA", "BB", "CC", "AA", "DD");
		 
		Map<String, Long> freq =  stringList.stream().filter(s -> Collections.frequency(stringList1, s)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println("only duplicates:: "+freq);
	}

}
