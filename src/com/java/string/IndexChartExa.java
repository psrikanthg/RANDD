package com.java.string;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IndexChartExa {
	
	public static void main(String args[]) {
		
		String str ="Java a concept of the day";
		
		System.out.println(str.charAt(0));
		
	    String index =  Stream.of(str.split("")).filter(s -> str.indexOf(s) != str.lastIndexOf(s)).findFirst().get();
	 	System.out.println(index);
		
		Character ch = str.chars().mapToObj(c -> Character.valueOf((char)c)).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				      .entrySet().stream().filter(s-> s.getValue() >1L).map(s ->s.getKey()).findFirst().get();
		System.out.println(ch);
		String str3 ="CAT";
		System.out.println(str3.substring(0));
		System.out.println(str3.substring(1));
		
		for(int i=str.length()-1; i>0; i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
