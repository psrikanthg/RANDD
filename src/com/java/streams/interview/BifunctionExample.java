package com.java.streams.interview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BifunctionExample {
	
	public static void main(String args[]) {
		
		BiFunction<Integer, Integer, Double> fun1 = (a1, a2)-> Math.pow(a1, a2);
		
		System.out.println(fun1.apply(2,  4));
		
		
		 BiFunction<Integer, Integer, Integer> composite1 = (a, b) -> a + b;

	        // Using andThen() method
	        composite1 = composite1.andThen(a -> 2 * a);
	        
	        
	        System.out.println("Composite1 = " + composite1.apply(2, 3));
	        
	        Map<Integer, String> map = new HashMap<>();
	        map.put(1, "Olivia");  
	        map.put(2, "Noah");  
	        map.put(3, "John");  
	        map.put(4, "Alex");  
	        map.put(5, "Emma");  
	        map.put(6, "Amelia");  
	        map.put(7, "Noah");  
	        
	        //get number of occurrences
	        BiFunction<Integer, String, String>  f = (key, value) ->"[key="+key+","
	        		+ " "+value+"("+Collections.frequency(map.values(), value)+")]";
	      
	        
	        map.forEach((k, v)-> System.out.println(f.apply(k, v)));
	        
	        BinaryOperator<Integer> binaryOperator = BinaryOperator.minBy((a, b) -> (a>b)?1:((a==b)?0:-1));
	        System.out.println(binaryOperator.apply(2, 4));
	        
	        BinaryOperator<Integer> mbinaryOperator = BinaryOperator.maxBy((a, b) -> (a>b)?1:((a==b)?0:-1));
	        System.out.println(mbinaryOperator.apply(2, 4));
		
	        
	         //StringBuffer mutable, it has all synchronized, meaning they are all thread-safe
	        //StringBuilder class has no synchronized methods, 
		
	        String str = "Hello, World!";
	        char ch = 'l';
	        str = str.replaceAll(Character.toString(ch), "");
	        System.out.println(str);
		
	}

}
