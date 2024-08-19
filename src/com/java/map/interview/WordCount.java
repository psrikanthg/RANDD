package com.java.map.interview;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {
	
	public static void main(String args[]) {
		//count the number of occurrences of given word in list of strings.
		 List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
		 String word = "java";
		 long wordCount =strings.stream().flatMap(s -> Arrays.stream(s.split(" "))).filter(s -> s.equals(word)).count();
		 System.out.println(word+" occured "+wordCount);
		 
		 
		 //String to a java.time.LocalDate
	      LocalDate localDate = LocalDate.parse("2021-05-24");
	      System.out.println(localDate);
	      System.out.println("=============Map Exmaple ==========================");
	      Map<String,String> map = new HashMap<String,String>(); 
          map.put("Effective Java", "Kathy Sierra");
          map.put("Spring in Action", "Craig Walls");
          map.put("Hibernate in Action", "Gavin King");
          map.put("Pro Angular", "Freeman");
          map.put("Pro Spring Boot", "Felipe Gutierrez");
          
        //Only modify if key already exists in the map
          map.computeIfPresent("Effective Java", (key, value) -> "Joshua Bloch");
          
        //Only modify if key doesn't exist in the map

          map.computeIfAbsent("Core Java", (value) -> "Kathy Sierra");
          
          map.entrySet().iterator().forEachRemaining(System.out::println);
          
          Stream.of(map.entrySet().toArray())
          .forEach(System.out::println);
          
          System.out.println("==================Map Entryset Stream For Each =======================");
          map.entrySet().stream().forEach(System.out::println);
          
			/*
			 * //how to initialize the set Set<String> set = new HashSet<>() { {
			 * add("California"); add("Chicago"); add("New York"); } };
			 */
          
          //Supplier Example, does not take any argument, but return values
          Supplier<String> sup =  ()-> "Hellow Learners";
          System.out.println(sup.get());
          
          //Consumer takes arguments but returns nothing
          Consumer<String> con = (String s) -> System.out.println(s);
          con.accept("Welcome to Consumpers");
          
          //predicate takes one argument retursn boolean value
          Predicate<Integer> prd =  (Integer i) -> i>5;
          System.out.println(prd.test(3));
          System.out.println(prd.test(10));
          
          //function takes argument, produce the result, used for mapping or transforming input to output
          Function<Integer, String> inttoStr = (Integer i) -> "Number: "+i;
          System.out.println("Function Apply Example: "+inttoStr.apply(47));
          
          //UnaryOperator has only abstract method T apply(T t)
          //this is special case of Function interface, where input n output are same the same type
          //it is used to transform an input into an output of the same type
          UnaryOperator<Integer> square = num -> num*num;
          System.out.println("Square of 5"+square.apply(5));
          
          //BinaryOperator has only one abstract method but it takes two arguments
          //T apply(T t, T u), it is special case of BiFunction interface where two inputs arguments
          //output are the same type
          //it is used for binary operation that combines two inputs into single single result
          
          BinaryOperator<Integer> add =(a, b) -> a+b;
          System.out.println("Binary Operator Example: "+add.apply(5, 6));
          
          //BiFunction takes two arguments
          BiFunction<Integer, Integer, Integer> biFon = (a, b) -> a*b;
          System.out.println("BiFunction Example:: "+biFon.apply(20, 30));
          
          
          //sort the strings by their length
          List<String> names = Arrays.asList("Kartik", "batra", "karan", "Rishi", "Jon");
          names.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList()).forEach(System.out::println);
	
          Stream.of(1, 1, 3, 2, 4, 3)
          .peek(System.out::print)
          .limit(3)
          .distinct()
          .forEach(System.out::print);
	
	}

}
