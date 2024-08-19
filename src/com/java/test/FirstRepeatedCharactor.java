package com.java.test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FirstRepeatedCharactor {
	
	
	public static void main(String args[]) {
		
		 String input = "Java Articles are Awesome";
		 
		 
		 Character result =  input.chars().mapToObj(ch -> 
		 Character.toLowerCase(Character.valueOf((char)ch))).
				 collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				 .entrySet()
				 .stream()
				 .filter(entry -> entry.getValue()>1L)
				 .map(entry -> entry.getKey())
				 .findFirst()
				 .get();
		 
		  //int index=  IntStream.rangeClosed(0, input.length()-1).filter(s -> input.indexOf(s)!=input.lastIndexOf(s)).findFirst().getAsInt();
		  //System.out.println(index);
		 String firstRep = Arrays.stream(input.split("")).filter(s -> input.indexOf(s)!=input.lastIndexOf(s)).findFirst().get();
		 System.out.println("First Repeated String: "+firstRep);
		 
		 String firstNonRep =  Arrays.stream(input.split("")).filter(s -> input.indexOf(s)==input.lastIndexOf(s)).findFirst().get();
			System.out.println("First Non Rep: "+firstNonRep);	 
		System.out.println(result);
		
	}

}
