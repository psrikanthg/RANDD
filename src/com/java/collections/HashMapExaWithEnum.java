package com.java.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.java.enums.EnumExample;

import static java.lang.System.out;


public class HashMapExaWithEnum {
	
	public static void main(String ...args){
		
		java.util.Map<Object, String> map = new java.util.HashMap<Object, String>();
		
		map.put(EnumExample.BAR, "enum can also used");
		
		map.put("srikanth", "enumbs value");
		
		java.util.Set<Map.Entry<Object, String>> objects = map.entrySet();
		
		
		Iterator<java.util.Map.Entry<Object, String>> set = objects.iterator();
		
		while(set.hasNext()){
			
			java.util.Map.Entry<Object, String> values =  (java.util.Map.Entry<Object, String>)set.next();
			
			
			out.println(values.getKey());
			out.println(values.getValue());
			
		}
		
		for(java.util.Map.Entry<Object, String> ma: map.entrySet()){
			
			out.println(ma.getKey());
			out.println(ma.getValue());
		}
		
		
		
		java.util.List<Integer> inter = new java.util.LinkedList<Integer>();
		java.util.List<Double> doubles = new java.util.LinkedList<Double>();
		
		out.println(inter.getClass());
		out.println(doubles.getClass());
	}

}
