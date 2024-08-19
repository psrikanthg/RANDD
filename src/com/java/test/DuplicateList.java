package com.java.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DuplicateList {
	
	public static void main(String args[]) {
		
		String str1[] = {"ATDREIAUS20210127000462",
				
				"ATDREIAUS20210122000022"};
		
		List<String> str1List = new ArrayList<String>(Arrays.asList(str1));	
		//List<String> str2List = new ArrayList<String>(Arrays.asList(str2));
		Set<String> noDuplicate = new HashSet<>(Arrays.asList(str1));
		System.out.println("after removing deplicate: "+str1.length);
		//str1List.removeIf(x -> str2List.contains(x)); 
		str1List.forEach(System.out::println);
		System.out.println("after removing deplicate: "+noDuplicate.size());
		
		String str[] = new String[] {"srikanth", "yyy", "abc"};
		
		
		var stud_no = 101;
		stud_no =200;
		
		System.out.println (stud_no);
		
		List<String> st =Arrays.asList("var", "keyword");
		
		String strng = st.stream().map((var stn)-> stn.toUpperCase()).collect(Collectors.joining(", "));
		System.out.println("Total String ::"+strng);
		
		    Predicate<Integer> isEven = (var num) -> num % 2 == 0;
	        Predicate<Integer> isOdd = isEven.and(isEven);
	        System.out.println(isOdd.test(5)); // Output: false
		
	}

}
