package com.java.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstLettersOccurence {
	
	
	public static void main(String args[]) {
		
		String str = "Java is an Object Programming";
		char[] charList =  str.toCharArray(); 
		Map<Character, Integer>  map = new HashMap();
		
		int isFirstOccurence = 0;
		str.chars().forEach(c -> System.out.println((char)c));
		
		String firstOcc = "gainjavaknowledge";
		
		String []array = firstOcc.split("");
		
		Map<String, Long>  occLetters =  Arrays.stream(array).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(occLetters);
		
		String myString = "Hello Hello Hello, Srikanth";
		
		Map<String, Long>  duplicateWords =  Arrays.stream(myString.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("No of Words "+duplicateWords);

		for(int i =0; i< charList.length; i++){
			
			if(map.containsKey(charList[i])){
		      map.put(charList[i], isFirstOccurence);
		      break;
			}else{
			   map.put(charList[i], isFirstOccurence);
			}

		}
		
	}

}
