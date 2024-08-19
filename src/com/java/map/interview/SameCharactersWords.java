package com.java.map.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SameCharactersWords {
	
	
	public static void main(String args[]) {
		
		String arr[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };
		
		
		Map<String, List<String>>  map = new HashMap<>();
		
		for(int i =0; i<arr.length; i++) {
			char arrChar[] =  arr[i].toCharArray();
			Arrays.sort(arrChar);
			String sorted = String.valueOf(arrChar);
			
			if(map.containsKey(sorted)) {
				
				List<String> addedValues = map.get(sorted);
				
				if(!addedValues.contains(arr[i]) && !addedValues.contains(sorted)) {
					addedValues.add(arr[i]);
					map.put(sorted, addedValues);
				}else {
					addedValues.add(arr[i]);
					map.put(sorted, addedValues);
				}
			}else {
				ArrayList<String> add = new ArrayList<>();
				add.add(arr[i]);
				map.put(sorted, add);
			}
			
		}
		
		map.values().stream().filter(f -> f.size()>1).collect(Collectors.toList()).forEach(System.out::println);
		
		
	}

}
