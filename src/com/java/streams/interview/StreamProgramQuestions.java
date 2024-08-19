package com.java.streams.interview;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;



public class StreamProgramQuestions {
	
	public static void main(String args[]) {
		
		//Separate Even Numbers n odd numbers
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		
		Map<Boolean, List<Integer>> evenAndOdd = listOfIntegers.stream().collect(Collectors.partitioningBy(n -> n%2 ==0));
		
		for(Entry<Boolean, List<Integer>> evn: evenAndOdd.entrySet()) {
			if(evn.getKey()) {
				System.out.println("Even Number: ");
			}else {
				System.out.println("Odd Number");
			}
			
			evn.getValue().forEach(System.out::println);
		}
		
	   //remove duplicate elements from list of strings
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		System.out.println(" =============Remove Duplicate Elements From List of Strings  ==============");
		listOfStrings.stream().distinct().forEach(System.out::println);
		
		String inputString = "Java Concept Of The Day";
		System.out.println("========Find Frequency of Each Character In a String==============");
		Map<String, Long>  freqCha  = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(freqCha);
		
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		System.out.println("======== Find Frequencey of Each Word in list ==================");
		Map<String, Long> freqWord =  stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(freqWord);
		
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        System.out.println("========= Reverse the decimal List ========================");
        decimalList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
        
        List<String> socialSitesLIst = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        System.out.println("========= Prefix Suffix string with [] ======================");
        String result = socialSitesLIst.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(result);
        
        List<Integer> listOfIntegers5 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("============ Print Numbers which are divided by 5 ====================");
        listOfIntegers5.stream().filter(n -> n%5 ==0).collect(Collectors.toList()).forEach(System.out::println);
        
        System.out.println("============ Find Max n Min Number of List ===============================");
        int max =listOfIntegers5.stream().max(Integer::compare).get();
        int min =  listOfIntegers5.stream().min(Integer::compare).get();
        System.out.println("Maximum Element: "+max+" Minimume Element : "+min);
        
        int[] a = new int[] {4, 2, 7, 1};
        
        int[] b = new int[] {8, 1, 9, 5};
        
        int[]  c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println("============ Merge Two Arrays n Sorted ============================");
		System.out.println(Arrays.toString(c));
		
		System.out.println("============ Merge Two Arrays n sort Array without duplicate ===================");
		int []d = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
		System.out.println(Arrays.toString(d));
		
		
		List<Integer> listOfInt = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		System.out.println(" ===================Three Minimum Numbers ============");
		listOfInt.stream().sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("================= Three Minimum Elements =================================");
		listOfInt.stream().sorted().limit(3).collect(Collectors.toList()).forEach(System.out::println);
		
		String s1 = "RaceCar";
        String s2 = "CarRacf";
        
        String revS1 =  Arrays.stream(s1.split("")).sorted().map(String::toUpperCase).collect(Collectors.joining());
        String revS2 =  Arrays.stream(s2.split("")).sorted().map(String::toUpperCase).collect(Collectors.joining());
        
		if(revS1.equals(revS2)) {
			System.out.println("Given Strings Are Anagram Number: "+revS1);
		}
		
		 int i = 15623;
		 System.out.println("======================Sum of All digits============================ ");
		 int sum = Stream.of( String.valueOf(i).split("")).mapToInt(n -> Integer.valueOf(n)).sum();
		 int suming =  Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		 System.out.println("Sum of "+i+" is "+sum+"  "+suming);
		 
		 System.out.println("==================== Second Largest Number In Integer Array =============");
	        List<Integer> find2ndLargest = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	       int secondLargest = find2ndLargest.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
	       System.out.println(secondLargest);
	       
	       List<String> programLang = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
	       System.out.println("Sort Programing skills with their Length");
	       programLang.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	
	       int[] sumAvg = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
	       IntSummaryStatistics  summar = Arrays.stream(sumAvg).summaryStatistics();
	       System.out.println("Sum of Array"+summar.getSum());
	       System.out.println("Avg of Array"+summar.getAverage());
	       
	       System.out.println(" ==============Find Common Elements BetWeen Array =======================");
	       List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
	         
	        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
	        
	        list1.stream().filter(list2::contains).collect(Collectors.toList()).forEach(System.out::println);
	       
	       System.out.println("===============Reverse of Each Word of String================= ");
	       String str = "Java Concept Of The Day";
	       String revString = Arrays.stream(str.split(" ")).map(s -> new StringBuffer(s).reverse()).collect(Collectors.joining(" "));
	       System.out.println(revString);
	       
	       System.out.println("============== Sum of 10 Natural Numbers===============");
	       int sumOfNatural = IntStream.rangeClosed(1, 10).sum();
	       System.out.println(sumOfNatural);
	       
	       System.out.println("Reverse of Int Array");
	       int[] array = new int[] {5, 1, 7, 3, 9, 6};
	       int[] reveArray= IntStream.rangeClosed(0, array.length-1).map(n -> array[array.length-n-1]).toArray();
	       System.out.println(Arrays.toString(reveArray));
	       System.out.println("First 10 Even Numbers");
	       IntStream.rangeClosed(1, 10).filter(n -> n%2==0).forEach(System.out::println);
	       
	       
	       System.out.println("===========Most Repeated Element In Array ======================== ");
	       List<String> repeatedStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
	       Entry<String, Long> mostRepeated = repeatedStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().max(Entry.comparingByValue()).get();
	       System.out.println(mostRepeated);
	       
	       
	       System.out.println(" ============== Palindrom Number =========================");
	       String pStr = "ROTATOR";
	       boolean isPali =  IntStream.range(0, pStr.length()/2).noneMatch(s -> pStr.charAt(s) != pStr.charAt(pStr.length()-s-1));
	       System.out.println(isPali);
	       
	       System.out.println(" ============== Find out strings which starts with Number ===================");
	       List<String> stringStartsWithNum = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
	       stringStartsWithNum.stream().filter(s -> Character.isDigit(s.charAt(0))).collect(Collectors.toList()).forEach(System.out::println);
	        
	       System.out.println("=========Extract Duplicate Elements From Array ===================");
	       List<Integer> duplicateElementsLIst = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
	       duplicateElementsLIst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue()>1).map(entry -> entry.getKey()).forEach(System.out::println);
	       
	       
	       String dupString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
	       Set<String> hasSet = new HashSet<>();
	       System.out.println("============Find Duplicate characters ==============================");
	       Arrays.stream(dupString.split("")).filter(s -> !hasSet.add(s)).collect(Collectors.toSet()).forEach(System.out::println);
	       
	       System.out.println("============Find Duplicate characters Using Index ==============================");
	       
	       Arrays.stream(dupString.split("")).filter(s -> dupString.indexOf(s) !=dupString.lastIndexOf(s)).map(s -> s.charAt(0)).collect(Collectors.toSet()).forEach(System.out::println);
	       
	       System.out.println("=====================Non - Repeated Character in String=========================");
	       String nonRepString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
	       
	       String firstNonRepString = Stream.of(nonRepString.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream()
	    		   .filter(entry ->entry.getValue() ==1L).map(e -> e.getKey()).findFirst().get();
	       System.out.println("First Non Repeating String :: "+firstNonRepString);
	       
	       System.out.println("====================== Fibonacci Series =========================");
	       
	       Stream.iterate(new int[] {0, 1}, f-> new int[] {f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(System.out::println);
	       
	       System.out.println("========== Get Last Element of Array ====================================");
	       List<String> findLast = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
	       
	       String lastEle = findLast.stream().skip(findLast.size() -1).findFirst().get();
	       System.out.println("Last Element "+lastEle);
	       
	       LocalDate birthdate = LocalDate.of(1987, 11, 22);
	       LocalDate today = LocalDate.now();
	       System.out.println(ChronoUnit.YEARS.between(birthdate, today));
	       
	       int[] intArray = {0,1,2,3,4,5};
	        int arraLast = Arrays.stream(intArray).skip(intArray.length-1).findFirst().getAsInt();
	        System.out.println(arraLast);
	        
	        
	        System.out.println("===================first Non Repeated chacter======================");
	        String tempStr = "Java Concept Of The Day";
	        System.out.println (Arrays.stream (tempStr.split (""))
	                .filter (s -> tempStr.indexOf (s) == tempStr.lastIndexOf (s))
	                .findFirst ()
	                .orElse (""));
	        System.out.println("================first Repeated chacter======================");
	        System.out.println (Arrays.stream (tempStr.split (""))
	                .filter (s -> tempStr.indexOf (s) != tempStr.lastIndexOf (s))
	                .findFirst ().orElse (""));
	        
	        
	        
	       
	        
	}

}
