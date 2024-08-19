package com.java.map.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseArray {
	
	public static void main(String args[]) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int rever[] = new int[arr.length];
		
		for(int i=arr.length-1; i>0; i--) {
			System.out.print(arr[i]);
		}
		
		int reverArr[] = IntStream.range(0, arr.length-1).map(s -> arr[arr.length-1-s]).toArray();
		System.out.println("Reverse Array: "+Arrays.toString(reverArr));
		 //reverse of the number is called palinddrom 
		int isPalin = 545;
		int palin  = IntStream.iterate(isPalin, i->i!=0, i -> i/10).map(n -> n%10).reduce(0, (a, b) -> a*10+b);
		System.out.println(palin);
		
		//square root of the number equal to Armstrong number
		int isArms = 153;
		int len = String.valueOf(isArms).length();
		
		int arms =  IntStream.iterate(isArms, i-> i!=0, i-> i/10).limit(10).map(n -> (int)Math.pow(n%10, len)).reduce(0, (a, b) -> a+b);
		System.out.println(arms);
		
		int isPrime = 19;
		boolean prime =  IntStream.range(2, isPrime/2).noneMatch(n-> isPrime%n==0);
		System.out.println("Is Prime Number: "+prime);
		
		Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(System.out::println);
		
		System.out.println("==============");
		int allFibSum =Stream.iterate(new int[] {0, 1},  f -> new int[] {f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).mapToInt(n -> n).sum();
		System.out.println(allFibSum);
		
		String mam = "ROTATOR";
		System.out.println(mam.charAt(0));
		boolean isMa =IntStream.range(0, mam.length()/2).noneMatch(s -> mam.charAt(s)!= mam.charAt(mam.length()-s-1));
		 System.out.println("Rotator: "+isMa);          
		
		 
		 int fact = 5;
		 int factSum  = IntStream.rangeClosed(1, fact).reduce(1, (a, b) -> a*b);
		 System.out.println("Fact Sum: "+factSum);
		 
		 String str = "Welcome to Streams";
		 
		 String reverStr = Stream.of(str.split(" ")).map(s -> new StringBuffer(s).reverse()).collect(Collectors.joining(" "));
		 System.out.println(reverStr);
		 
		 String cat ="CAT";
		// System.out.println(String.valueOf(cat.charAt(cat.length()-1)));
		 String revesrCat = IntStream.rangeClosed(0, cat.length()-1).mapToObj(s ->String.valueOf(cat.charAt(cat.length()-1-s)) ).collect(Collectors.joining(""));
		 System.out.println(revesrCat);
		 System.out.println("Reverse String: ");
		 for(int i=0; i<=cat.length()-1; i++) {
			 System.out.println(cat.charAt(cat.length()-1-i));
		 }
		 
		 String stg ="RaceCar", str2 =  "CarRace";
		 
		 stg = Stream.of(stg.toUpperCase().split("")).sorted().collect(Collectors.joining());
		 str2 = Stream.of(str2.toUpperCase().split("")).sorted().collect(Collectors.joining());
		 System.out.println("Stge: "+stg+" str2: "+str2);
		 
		 
		    //2nd Highest Number in List of Integers
			List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
			
			int secondHig =  nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
			System.out.println("Second Highest: "+secondHig);
		 
			//Sort words by their length in List of Strings
			List<String> strgs =  Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		   
	       List<String> sortStrgs = strgs.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
	       System.out.println(sortStrgs);
	       
	     //Common Elements in two List
			List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6);
			List<Integer> nums2 = Arrays.asList(10, 2, 13, 44, 5, 16);
			System.out.println("Common Element");
			List<Integer> commonElement = nums1.stream().filter(s-> nums2.contains(s)).collect(Collectors.toList());
			System.out.println(commonElement);
			
			 //Find most Repeated words in List of Strings
			  List<String> repeatedList =  Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
	         
			  Map<String, Long> repeated =  repeatedList.stream().filter(s -> Collections.frequency(repeatedList, s)>1).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
			  System.out.println("Most Repeated Map: ");
	          System.out.println(repeated);
	          Entry<String, Long> repeat1 = repeatedList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Entry.comparingByValue()).get();
	          System.out.println(repeat1);
	          
	          
	          //List of Strings, find out those strings, which stars with number
			  List<String> numString = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Sxi");
			  
			  List<String> stringNum = numString.stream().filter(s -> Character.isDigit(s.charAt(0))).collect(Collectors.toList());
			  System.out.println("Number starts from: "+stringNum);
			  
			  //sum n avg of int array
			    int av[] = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
			    
			    int sumArray = Arrays.stream(av).sum();
			    System.out.println("Array Sum: "+sumArray);
			    
			    List<String> listOfStr = Arrays.asList("1", "2", "3", "4", "5");
			    
			    List<Integer> Intge =listOfStr.stream().map(Integer::parseInt).collect(Collectors.toList());
			    System.out.println("Intgeer list: "+Intge);
			    
			    System.out.println(" Convert elements of string into invidueal strings");
	            List<String> eleStr = Arrays.asList("apple", "banana", "cherry");
	            
	            List<Character> chars = eleStr.stream().flatMap(word -> word.chars().mapToObj(c -> (char)c)).collect(Collectors.toList());
	            System.out.println(chars);
	            
	            List<String> fruits = List.of("Apple", "Banana", "Cherry", "Date", "Apple", "Banana");
	            
	            List<Integer> leng = fruits.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
	            System.out.println(leng);
	            
	            HashMap<String, Integer> subjectToStudentCountMap1 = new HashMap<String, Integer>();
			    subjectToStudentCountMap1.put("Maths", 45);
		        subjectToStudentCountMap1.put("Physics", 57);
		        subjectToStudentCountMap1.put("Chemistry", 52);
		        subjectToStudentCountMap1.put("History", 41);
		        
		        HashMap<String, Integer> subjectToStudentCountMap2 = new HashMap<>();
		        subjectToStudentCountMap2.put("Economics", 49);
		        subjectToStudentCountMap2.put("Maths", 42);
		        subjectToStudentCountMap2.put("Biology", 41);
		        subjectToStudentCountMap2.put("History", 55);
		        
		       System.out.println("Merge Two Maps:::");
		       
		       Map<String, Integer> map3 = Stream.of(subjectToStudentCountMap1, subjectToStudentCountMap2).flatMap(s -> s.entrySet().stream()).collect(Collectors.toMap(Entry::getKey, Entry::getValue, Integer::sum, HashMap::new));
		       
		       System.out.println(map3);
		       System.out.println("Merge values based");
		       HashMap<String, Integer> map4 = subjectToStudentCountMap1.entrySet().stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v1<v2?v1:v2, () ->new HashMap(subjectToStudentCountMap2)));
		       System.out.println(map4);
		       
		       
		        //count the number of occurrences of given word in list of strings.
				 List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
				 String word = "java";
				 
				 long number =  strings.stream().flatMap(s -> Stream.of(s.split(" "))).filter(s -> s.equals(word)).count();
				 System.out.println(word+" occured.. "+number);
	
	}

}
