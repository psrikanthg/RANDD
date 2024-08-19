package com.java.map.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class CollectionsExampl {
	
	public static void main(String args[]) {
		List<Integer> list = List.of(46, 67, 24, 16, 8, 12);
		System.out.println("Maximum Element of List "+Collections.max(list));
		System.out.println("Minimum Element of List "+Collections.min(list));
		
		List<String> strList = new ArrayList<String>();
		strList.add("Viru");    
		strList.add("Saurav");    
		strList.add("Mukesh");    
		strList.add("Tahir");   
		strList.forEach(System.out::println);
		
		
		//String[] obj =strList.toArray(new String[strList.size()]);
		//System.out.println(Arrays.toString(obj));
		
		  Collections.sort(strList, Collections.reverseOrder());
		  strList.sort(Comparator.naturalOrder());
		//strList.stream().forEach(System.out::println);
		
		//listiterator is used to travel elements in both directions, forward n backward direction
		
		ListIterator<String> listIt = strList.listIterator();
		
		/*
		 * while(listIt.hasNext()) {
		 * System.out.println("Index: "+listIt.next()+" "+listIt.nextIndex()); }
		 */
		while(listIt.hasPrevious()) {
			System.out.println("index: "+listIt.previousIndex()+" Element: "+listIt.previous());
		}
		
		
	        
	}

}
