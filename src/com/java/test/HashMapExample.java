package com.java.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
	
	public static void main(String args[]) {
		
		Map<String, Integer> hashMap = new HashMap<>();
		System.out.println("Hash Map does not maintain inserting order");
		//not thread safe
		//it allows one null key
		//it uses linked list to store data
		//offers O(1) insertion n retrieval time
		hashMap.put("ab", 12);
		hashMap.put("d", 12);
		hashMap.put("c", 12);
		hashMap.put("b", 12);
		hashMap.put("z", 12);
		hashMap.put("y", 12);
		hashMap.put(null, 13);//it omits this one
		hashMap.put(null, 14);
		hashMap.forEach((k, v)-> System.out.println(" Key: "+k+" value: "+v));
		
		System.out.println("Linked hash Map maintains insertion order");
		Map<String, Integer> linkedMap = new LinkedHashMap<>();
		linkedMap.put("srikanth", 36);
		linkedMap.put("Bhavani", 31);
		linkedMap.put("Tapas", 7);
		linkedMap.put("Tarush", 4);
		linkedMap.put("Anjaneyulu", 56);
		linkedMap.forEach((k, v) -> System.out.println("Key : "+k+" "+"value: "+v));
		
		//tree map maintains sorting order
		//it doest not allow null keys but allows mulitple null values
		System.out.println("TreeMap example:: ");
		Map<String, Integer> treeMp = new TreeMap<>();
		treeMp.put("srikanth", 36);
		treeMp.put("Bhavani", 31);
		treeMp.put("Tapas", 7);
		treeMp.put("Tarush", 4);
		treeMp.put("Anjaneyulu", 56);
		//treeMp.put(null, 56);//throws run time exception ie null pointer exception
		treeMp.forEach((k, v) -> System.out.println("Key : "+k+" "+"value: "+v));
		
		//how to convert hashMap to synchronized map
		Map<String, Integer>   synchHashMap = Collections.synchronizedMap(hashMap);
		             
		
		
		
	}

}
