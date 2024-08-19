package com.scjp.mock.test;

import java.util.Map;
import java.util.TreeMap;

public class StringArrayMapExample {
	
	public static void main(String args[]){
		
		String words[] =  new String[]{"aaa", "bbb", "ccc", "ccc", "bbb"};
		
		Map<String, Integer> m = new TreeMap<String, Integer>();
		
		Map<String, String> m1 = new TreeMap<String, String>();
		
		for(String word :words){
			
			Integer freq = m.get(word);
			
			m.put(word, freq == null? 1:freq+1);
			
		}
		
		System.out.println(m);
		
     for(String word :words){
			
			String freq = m1.get(word);
			
			m1.put(word, freq == null? "1":freq+"1");
			
		}
		
		System.out.println(m);
		
		String s ="ANAL";
		System.out.println(s.contains("ANAL"));
	}

}
