package com.java.test;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class DateExample {
	
	public static void main(String args[]) {
		Map<String, String> map =  new HashMap<>();
		map.put("ATDREIAUS20220115000039", "12/02/2022;15/02/2022");	
		
		 String DATE_PATTERN = "yyyy-MM-dd-HH:mm";
		 SimpleDateFormat SDF = new SimpleDateFormat(DATE_PATTERN);
		 System.out.println("Date: "+SDF.format(new Date()));
		 
		 String yearDate = LocalDate.now().minusMonths(12).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 String todayDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 System.out.println("Today Date is::: "+todayDate);
		 System.out.println("12 months date Back: "+yearDate);
		  boolean check =   12 >12? true:false;
		 if(check) {
			 System.out.println("both are not same");
		 }else {
			 System.out.println("not same::");
		 }
		 
		 String str = "my name is srikanth srikanth duplicate duplicate";
		 
		 List<String> listString = Arrays.stream(str.split(" ")).collect(Collectors.toList());
		 
		 Map<String, Integer> duplicate = listString.stream().collect(Collectors.toMap(Function.identity(), word-> 1,  Math::addExact));
	     System.out.println("Duplicate Elements are "+duplicate);
	      
	     //Fine Even numbers in array list
	     List<Integer> intList =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	     int sum =intList.stream().filter(n -> n%2 ==0).mapToInt(Integer::intValue).sum();
	     System.out.println("sum of even numbers: "+sum);
	     
	     Map<String, Integer> dupWordsMapWithCount = new HashMap<>();

	     for (String word : listString) {
           
	       dupWordsMapWithCount.put(word, Collections.frequency(listString, word));
	     }

	     System.out.println(dupWordsMapWithCount);
	     
	}

}
