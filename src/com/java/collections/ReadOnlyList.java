package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyList {
	
	public static void main(String args[]) {
		
		ArrayList<String> originalList = new ArrayList<String>();
		
		    originalList.add("John");
	        originalList.add("Carlos");
	        originalList.add("David");
	        originalList.add("Ian");
	        originalList.add("Daniel");
	        
	     System.out.println("Original List");  
	     System.out.println(originalList);   
	     
	     List<String> readList = Collections.unmodifiableList(originalList);
	     
	     System.out.println("Ready Only List");
	     
	     System.out.println(readList);
	     
	     try {
	    	 readList.add("hello");
	    	readList.remove("John");
	    	readList.set(1, "NameChanged");
	     }catch (UnsupportedOperationException e) {
			System.out.println("modification on read only list not allowed");
		}
	        
	     originalList.add("Anytime");
	     originalList.remove("John");
	     originalList.set(1, "NameChanged");
	     
	     System.out.println("Modification to original list reflect in read only list");
	     
	     System.out.println("read only list: ");
	     System.out.println(readList);
		
	}

}
