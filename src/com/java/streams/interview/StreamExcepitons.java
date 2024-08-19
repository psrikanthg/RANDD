package com.java.streams.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExcepitons {
	
	public static void main(String args[]) {
		
		List<String> list = Arrays.asList("1", "2", "a", "3");
		
		List<Integer> strList = list.stream().map(StreamExcepitons::safeParseInt).filter(Optional::isPresent).map(Optional::get).collect(Collectors.toList());
		strList.forEach(System.out::println);
		//List<Integer> strList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
	    //strList.forEach(System.out::println);
	
	}
	
	
	public static Optional<Integer> safeParseInt(String s){
		
		      try {
				return Optional.of(Integer.parseInt(s));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return Optional.empty();
			}
	}
	

}
