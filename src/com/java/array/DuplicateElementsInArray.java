package com.java.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsInArray {
	
	public static void main(String args[]) {
		
		Integer arr[] = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8};
		
		 List<Integer> list = new ArrayList<>();
		 
		 Collections.addAll(list, arr);
		 
		 Set<Integer> set = new HashSet<>(list);
		 System.out.println("List: "+list.size());
		 System.out.println("set: "+set.size());
	}

}
