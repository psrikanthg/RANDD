package com.java.array;

import java.util.ArrayList;

public class CloneArrayList {
	
	public static void main(String args[]) {
		ArrayList<String> c1 = new ArrayList<>();
		 c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
         
         System.out.println("Original Array List: "+c1);
         ArrayList<String> c2 = (ArrayList<String>)c1.clone();
         System.out.println("Cloned Array List: "+c2);
         
	}

}
