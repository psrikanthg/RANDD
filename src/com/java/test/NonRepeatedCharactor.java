package com.java.test;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCharactor {
	
	
	public static void main(String args[]) {
		
		String input = "Java articles are Awesome";
		
		Character result =  input.chars().mapToObj(ch -> 
		Character.toLowerCase(Character.valueOf((char)ch))).
	    collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
	   .entrySet().stream().filter(entry -> entry.getValue() ==1L)
	   .map(entry-> entry.getKey())
       .findFirst().get();
		
		System.out.println(result);
       
		
       
		
	}

}
