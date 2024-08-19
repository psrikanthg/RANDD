package com.java.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ModifyKeySet {
	
	public static void main(String args[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>(){{
			  put(1, 10);
			  put(2, 20);
		}};
		
		 Set<Integer> set = map.keySet().stream().filter(key -> key != 2).collect(Collectors.toSet());
		 System.out.println("Set Keys: "+set);
		 System.out.println(map.get(2));
		 
		 Set<Integer> keys =map.keySet();
		 
		 keys.remove(1);
		 
		  System.out.println(map.get(1));
		
	}
	
	
}
