package com.java.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubPortion {
	
	public static void main(String args[]) {
		ArrayList<String> list_Strings = new ArrayList<>();
		
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  
		  System.out.println("Original List: "+list_Strings);
		  
		  List<String> list_subString = list_Strings.subList(0, 3);
		  
		  System.out.println("List of first Three Elements: "+list_subString);
		
	}

}
