package com.java.array;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayListElements {
	
	public static void main(String args[]) {
		
		ArrayList<String> c1 = new ArrayList<>();
		
		 c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
         
         System.out.println("Array List Before Swap");
         
         c1.forEach(System.out::println);
         
         Collections.swap(c1, 0, 2);
         
         System.out.println("After swapping 0 n 2 elements");
         c1.forEach(System.out::println);
	}

}
