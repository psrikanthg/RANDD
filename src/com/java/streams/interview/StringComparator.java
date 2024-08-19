package com.java.streams.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringComparator {
	
	public static void main(String args[]) {
		
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		names.stream().sorted((String s1, String s2) -> s1.length() -s2.length()).forEach(System.out::println);
	    System.out.println("Using Method References");
	    names.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	    System.out.println("Sort Names in Desending Order by their length");
	    names.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
	    //any match example
	   if(names.stream().anyMatch((String name) -> name.length() ==5)) {
		   System.out.println("Yes there are names exists with legnth 5");
	   }
	   
	   //none Match Example
	   if(names.stream().noneMatch((String name) -> name.length() ==2)) {
		   System.out.println("Yes there is no two letter name");
	   }
	   
	   
	   //AllMatch  return true if all the elements of a stream matches with given predicate
	   if(names.stream().allMatch((String n) -> n.length()>5)){
		   System.out.println("All are names bigger than 5");
	   }
	   
	   
	   
	    
	
	}

}
