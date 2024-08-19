package com.java.map.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameCharacterWords {
	
	public static void main(String args[]) {
		
		String arr[] = { "abcd", "java", "dcba", "ajav", "xyz", "epam", "pame", "aepm" };
		
		Map<String, List<String>> maps = new HashMap<>();
		
		for(String str :arr) {
			
			char ch[] = str.toCharArray();
			Arrays.sort(ch);
			
			String str1 = String.valueOf(ch);
			
			if(maps.containsKey(str1)) {
				
				List<String> listStr = maps.get(str1);
								
				if(!listStr.contains(str) && !listStr.contains(str1)) {
					listStr.add(str);
					maps.put(str1, listStr);
				}else {
					listStr.add(str);  
					maps.put(str1, listStr);
				}
				
			}else {
				List<String> list = new ArrayList<String>();
				list.add(str);
				maps.put(str1, list);
			}
			
			
		}
		
		System.out.println(maps);
		
	}

}
