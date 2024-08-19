package com.java.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class GenericDeclartions {
	
	public static void main(String ...args){
		
		java.util.Set<Integer> integers = new LinkedHashSet<Integer>();
		
		java.util.LinkedHashSet<Integer> hashSet = new HashSet();
		
		java.util.SortedSet<String> set = new TreeSet<String>();
		
		java.util.SortedMap<String> set2 = new NavigableMap();
	}

}
