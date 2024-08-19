package com.java.streams.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PalindromNum18 {
	
	public static void main(String args[] ) {
		
		/* 1.Fibonacci Serires
		 * 2. Prime Number
		 * 3. Palindrom Number: Reverse of number
		 * 4. Factorial Number
		 * 5. ArmStrong Number square root of its indiviual numbers
		 * 
		 */
		
		//A Palindrome number is a number that is same as reverse
		int num = 545;
		
		int revNum= IntStream.iterate(num, i->i!=0, i-> i/10).map(n -> n%10).reduce(0, (a, b)-> a*10+b);
		            
		System.out.println("Palindrom Num  "+revNum);
		
		int arNum = 153;
		//ArmStrong Number Example
		int pow = String.valueOf(arNum).length();
		int armSt = IntStream.iterate(arNum, i-> i!=0, i-> i/10).limit(pow).map(n -> (int)Math.pow(n%10, pow)).sum();
		System.out.println("Amstrong Number: "+armSt);
				
		//write a program to print Fibonacci series
		Stream.iterate(new int[] {0, 1}, f-> new int[] {f[1], f[0]+f[1]}).limit(10).map(f-> f[0]).forEach(System.out::println);
		
		//write a program to print sum of Fibonacci series
		int sumOfFib =Stream.iterate(new int[] {0, 1}, f-> new int[] {f[1], f[0]+f[1]}).limit(10).map(f ->f[0]).mapToInt(f -> f).sum();
		System.out.println("Sum of 10 Fibonacci Series: "+sumOfFib);
		//write a program to factorial program
		int number =5;
		int factNum =IntStream.rangeClosed(2, number).reduce(1, (a, b)-> a*b);
		System.out.println("Factorial Num:: "+factNum);
		
		
		//generate random numbers using java 1.8
		Random random = new Random();  
		random.ints(5).forEach(System.out::println);  
		
		//Rotate Array elements
		Integer[] arr = {0,1,2,3,4};
		Collections.rotate(Arrays.asList(arr), 2);
		System.out.println(Arrays.toString(arr));
		
		
		//write a program to fibonacci series using java 1.8 0 1 1 2 3 5
		System.out.println("FiBonacci series using java 1.8");
		
		Stream.iterate(new int[] {0, 1}, f->new int[] {f[1], f[0]+f[1]}).limit(10).map(f -> f[0]).forEach(System.out::println);
		
		System.out.println("Prime Number");
		//prime number is divide by itself or 1
		 int primNum =39;
		 boolean isPrim = IntStream.rangeClosed(2, primNum/2).noneMatch(n -> primNum%n==0);
		 System.out.println(" is Prime Num "+isPrim);
		 String str =null;
		 String std = null;
		 
		 System.out.println(" if both strs null, always return false  ::: "+Objects.equals(str, std));
		 
		 
		 Stream.of(1, 2, 3)
	      .flatMap(n -> Stream.of(n, n * 2))
	      .forEach(System.out::print);
		 
		 
		 List<Integer> numbers = Arrays.asList(12, 8, 13, 24, 15);

		 Optional<Integer> result = numbers.stream()
		                                   .filter(n -> n > 25)
		                                   .reduce((a, b) -> a + b);
		 System.out.println(result);
		 
		 
		 //state full operations are skip(), distinct(), limit() and sorted();
		 Stream.of("java", "python", "react")
	      .flatMap(s -> s.chars().boxed())
	      .forEach(System.out::print);
		 
		 
		 
		 Stream.of("A", "B", "C").peek(p -> System.out.println(p+" Peek Example"))
	      .flatMap(s -> Stream.of(s, s.toLowerCase()))
	      .forEach(System.out::println);
		 
		 List<Integer> numbersList = Arrays.asList(5, 4, 3, 2, 1);
		 int sum = numbersList.stream()
		                  .reduce(10, (a, b) -> a + b);
		 System.out.println(sum);
		 
		 
		 List<String> words = Arrays.asList("one", "two", "three", "four", "five");
		 Map<Integer, List<String>> result1 = words.stream()
		              .collect(Collectors.groupingBy(String::length));
		 System.out.println(result1);
		 
		 System.out.println("No of Available Processors: "+Runtime.getRuntime().availableProcessors());
		 
		 List<String> wordsList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		 
		 Map<Integer, List<String>> wordLenght = wordsList.stream().collect(Collectors.groupingBy(s ->s.length()));
		 
		 System.out.println("word lenght:: "+wordLenght);
		 
		 
		 List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 
		 int sumOfEvn = numList.stream().filter(n -> n%2==0).mapToInt(n -> n*n).sum();
		 System.out.println(sumOfEvn);
		 
		  String concateEv =wordsList.stream().filter(s -> (s.length())%2 ==0).limit(2).collect(Collectors.joining());
		  
		  System.out.println(concateEv);
		  
		  List<String> sentences = Arrays.asList(
	                "Java Stream API provides a fluent interface for processing sequences of elements.",
	                "It supports functional-style operations on streams of elements, such as map-reduce transformations.",
	                "In this exercise, you need to count the total number of words in all sentences."
	        );
		  
		  Long uniCount =  sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).distinct().count();
		  System.out.println("Total words count"+uniCount);
		  
		  List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
		  
		  OptionalInt longestLg =   names.stream().mapToInt(s -> s.length()).max();
		  System.out.println("Longest Legnth: "+longestLg.getAsInt());
	}

}
