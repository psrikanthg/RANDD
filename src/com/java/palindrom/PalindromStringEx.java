package com.java.palindrom;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PalindromStringEx {
	
	public static void main(String args[]) {
		String str = "ROTATOR1";
		
		
		boolean palindrom = true;
		
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
				palindrom = false;
				break;
			}
		}
		
		System.out.println(palindrom);
		
		List<String> findLast = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
		
		//find the last element of aray
		String last =  findLast.stream().skip(findLast.size()-1).findFirst().get();
		System.out.println("Last Element of Array: "+last);
		
		//Extrat duplicate elements only
		List<Integer> duplicateElementsLIst = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		Set<Integer> set = new HashSet<>();
		
		List<Integer> dupl = duplicateElementsLIst.stream().filter(s -> !set.add(s)).collect(Collectors.toList());
		System.out.println("Duplicate Elements: ");
		System.out.println(dupl);
		
		List<String> repeatedStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
		Entry<String, Long> repeated =  repeatedStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Entry.comparingByValue()).get();
		
		
		int[] array = new int[] {5, 1, 7, 3, 9, 6};
		//Reverse of an array
		int rev[] =  IntStream.range(0, array.length-1).map(s -> array[array.length-1-s]).toArray();
		System.out.println("Reverse Array: "+Arrays.toString(rev));
		
		 String str1 = "Java Concept Of The Day";
		 System.out.println("Reverse of Each Word in String");
		 String eachWordRev =      Stream.of(str1.split(" ")).map(s-> new StringBuffer(s).reverse()).collect(Collectors.joining(" "));
		 System.out.println(eachWordRev);
		
		 
		 System.out.println("Sorting String list with their length");
		  List<String> programLang = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		   
		  List<String> sortLength = programLang.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		  System.out.println(sortLength);
		  
		  List<Integer> find2ndLargest = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		  
		  Integer secondLarg = find2ndLargest.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		  System.out.println(secondLarg);
		  
		  
		  int d = 15623;
		  
		  int sum = Arrays.stream(String.valueOf(d).split("")).mapToInt(s -> Integer.parseInt(s)).sum();
		  System.out.println("Sume of Number: "+sum);
		
		  	String s1 = "RaceCar";
	        String s2 = "CarRacf";
	        
	        System.out.println("check given two strings Annagaram Strings");
	        
	        s1 = s1.toUpperCase();
	        s2 = s2.toUpperCase();
	        
	        String s3 = Arrays.stream(s1.split("")).sorted().collect(Collectors.joining());
	        String s4 = Arrays.stream(s2.split("")).sorted().collect(Collectors.joining());
	        System.out.println(s3+ "   "+s4);
	        
	        
	        int[] a = new int[] {4, 2, 7, 1, 8, 20};
	        int max=0;
	        for(int i=0; i<=a.length-1; i++) {
	        	
	        	max = a[i];
	        	if(a[i]>max) {
	        		max =a[i];
	        	}
	        	
	        }
	        System.out.println("Max: "+max);
	        
	        int[] b = new int[] {8, 1, 9, 5};
	        
	        int c[] = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
	        System.out.println("Merging Two Arrays: "+Arrays.toString(c));
	        
	        List<Integer> listOfIntegers5 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	        System.out.println("Find Max Element in list"+listOfIntegers5.stream().max(Integer::compare));
           	  
	        
	        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
	        System.out.println("Frequncy of Each Word");
	        Map<String, Long> freq = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        System.out.println(freq);
	        
	        String tempStr = "Java Concept Of The Day";
	        System.out.println("First Repeated Character");
	        String first =  Arrays.stream(tempStr.split("")).filter(s -> tempStr.indexOf(s)!=tempStr.lastIndexOf(s)).findFirst().orElse("NotFound");
	        System.out.println(first);
	        
	        String firstNon = Arrays.stream(tempStr.split("")).filter(s -> tempStr.indexOf(s) == tempStr.lastIndexOf(s)).findFirst().orElse("NotFound");
	        System.out.println("First non Repeated Character: "+firstNon);
	        
	        int arr[] = { 2, 3, 1, 22, 11, 33, 5 };
	        
	        int max1 = Arrays.stream(arr).reduce(Integer.MIN_VALUE, (f, g) -> Integer.max(f, g));
	        int min1 = Arrays.stream(arr).reduce(Integer.MAX_VALUE, (f, g)-> Integer.min(f, g));
	        
	        System.out.println("Min: "+min1+" Max: "+max1);
	        
	}

}
