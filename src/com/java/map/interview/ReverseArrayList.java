package com.java.map.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	
	public static void main(String args[]) {
		
		List<String> list = new ArrayList<>();
		list.add("Mango");
		list.add("Banana");
		list.add("Mango");
		list.add("Apple");
		System.out.println("Before Reverse");
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println("After Reverse ");
		System.out.println(list);
		
		
		ArrayList<String> firstList=new ArrayList<String>();  
		//adds elements to the array list  
		firstList.add("Apple");  
		firstList.add("Pears");  
		firstList.add("Guava");  
		firstList.add("Peach");  
		//second array list      
		ArrayList<String> secondList=new ArrayList<String>();  
		//adds elements to the array list  
		secondList.add("Apple");  
		secondList.add("Pears");  
		secondList.add("Papaya");  
		secondList.add("Peach");  
		
		secondList.removeAll(firstList);  
		
		System.out.println(secondList);  
		
		//how to comapre two arrays using below ways
		/*
		 * 1 equals 2 removeAll() 3. retainAll() 4. ArrayList.contains(); 5.
		 * contentEquals() 6. using stream
		 */
		
	}

}
