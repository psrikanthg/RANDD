package com.java.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeys {
	
	public static void main(String args[]) {
		Map<String, Set<String>> map = new HashMap<>();
        
        
       // map.put("cust1", count1);
        
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
        	
        	if(entry.getValue()!=null && entry.getValue().size() > 0)
             System.out.println(entry.getKey() + " : " + entry.getValue()+" size is::  "+entry.getValue().size());
            
        }
	}

}
