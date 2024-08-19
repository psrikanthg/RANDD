package com.java.map.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterviewPrograms {
	
	public static void main(String args[]) {
		
		//Armstrong numeber is a number that is equal to sum of cubes of its digits
		int num =153;
		int len =  String.valueOf(num).length();
	    int armStr = IntStream.iterate(num, i->i!=0, i->i/10).limit(len).map(n -> (int)Math.pow(n%10, len)).sum();
		if(num ==armStr) {
			System.out.println("Armstrong Number"+armStr);
		}
		
		
		//Palindrom number, reverse of number is called palindrom number
		 int pnum =545;
		 int revNum = IntStream.iterate(pnum, i -> i!=0, i -> i/10).map(n -> n%10).reduce(0, (a, b) -> a*10+b);
		 if(pnum == revNum) {
			 System.out.println("Palindrom Number  "+revNum);
		 }
		 
		 //write a program to print first 10 Fibonacci Series
		 System.out.println(" ====== Fibonacci Service ===================");
		 Stream.iterate(new int[] {0,1}, f -> new int[] {f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(System.out::println);
		
		 //write a program for factorial number
		 //5*4*3*2*1 =120
		 int fact =5;
		 int factNum= IntStream.rangeClosed(1, fact).boxed().reduce(1, (a, b) -> a*b);
		 System.out.println("Factorial of 5: "+factNum);
		 
		 //write a program for prime number
		  int primeNumber = 37;
		  boolean isPrim = IntStream.rangeClosed(2, primeNumber/2).noneMatch(n -> primeNumber%n==0);
		  System.out.println("is Prime Number: "+isPrim);
		  
		  int sumNum =125;
		  int numTotal = Arrays.stream(String.valueOf(sumNum).split("")).mapToInt(n ->Integer.parseInt(n)).sum();
		  System.out.println("Total Sum:: "+numTotal);
		  String name = "sreekanth sreekanth";
		  Map<Character, Long>  wordsCount =   name.chars().mapToObj(ch -> Character.valueOf((char)ch)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		  System.out.println("word count: "+wordsCount);
		  
		  
		  
		  int arr[] = {100, 80, 10, 1, 30, 30,40, 40, 50, 60};
		         
		         
		   System.out.println("==Max Number in Array ==============");
		   int maxN= Arrays.stream(arr).boxed().mapToInt(n ->n).max().getAsInt();
		    System.out.println("maxi element in array "+maxN);
		    
		    System.out.println("Minium Elemet: "+Arrays.stream(arr).boxed().mapToInt(n ->n).min().getAsInt());
		  
		    List<Integer> sortArray = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
		    System.out.println("Sorted Array In Asending: "+sortArray);
		    
		    List<Integer> revereseArray = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		    System.out.println("Reverse Array:: "+revereseArray);
		    
		    List<Integer> noDuplicateEl = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
		    System.out.println("No Duplicate: "+noDuplicateEl);
		    
		    Integer secondHigest = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).skip(1).findAny().get();
		    System.out.println("Second Higest Number: "+secondHigest);
		    
		    Integer secondLowest = Arrays.stream(arr).boxed().sorted(Integer::compare).skip(1).findAny().get();
		    System.out.println("Second Lowest Number: "+secondLowest);
		    
		    List<Integer> first3Mini = Arrays.stream(arr).boxed().sorted(Integer::compare).limit(3).collect(Collectors.toList());
		    System.out.println("First 3 Mini Number: "+first3Mini);
		    
		    List<Integer> first3Max = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList());
		    System.out.println("First 3 Max Number: "+first3Max);
		    
		    int[] reverseArray = IntStream.range(0, arr.length-1).map(n -> arr[arr.length-1-n]).toArray();
		    
		    System.out.println("Reverse Array: "+Arrays.toString(reverseArray));
		    
		    int middleElemnt =  IntStream.of(arr).sorted().skip(arr.length/2).map(n ->n).findFirst().getAsInt();
		    System.out.println("Middle Element of Array"+middleElemnt);
		    
		    System.out.println("Summ of Array: "+Arrays.stream(arr).boxed().mapToInt(n ->n).sum());
		    
		    
		     IntSummaryStatistics summary = Arrays.stream(arr).boxed().mapToInt(s ->s).summaryStatistics();
		       System.out.println(summary.getSum()+" "+summary.getMax()+" "+summary.getMin());
		  
		  
		       //sume of numbers exampls
		       int j =145;
		       
		       int sum = Arrays.stream(String.valueOf(j).split("")).mapToInt(n -> Integer.valueOf(n)).sum();
		       System.out.println("Total Sum: "+sum);
		       int sum1= Stream.of(String.valueOf(j).split("")).collect(Collectors.summingInt(Integer::valueOf));
		       System.out.println(sum1);
		       
		       int isPrime = 37;
		        boolean isPrimeB= IntStream.range(2, isPrime/2).noneMatch(n -> isPrime%n==0);
		        System.out.println("is Prime: "+isPrimeB);
		        
		      int isArms = 545;
		       int len1 =  String.valueOf(isArms).length();
		      int  squareSum = IntStream.iterate(isArms,  i->i!=0, i-> i/10).limit(len1).map(n -> (int)Math.pow(n%10, len1)).sum();
		     System.out.println(squareSum);
		     
		     
		     int isPalin = 121;
		     
		     int isPalindrom = IntStream.iterate(isPalin, i->i!=0, i ->i/10).map(n -> n%10 ).reduce(0, (a, b) -> a*10+b);
		     System.out.println("isPalindrom -> "+isPalindrom);
		     
		     
		     
		    		   
		         
		        
	}

}
