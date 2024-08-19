package com.java.test;
import java.util.ArrayList;
import java.util.List;

public class TwoListEquals {
	
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		
		if(list.equals(list1)) {
			System.out.println("both are equalls::");
		}else {
			System.out.println("both are not equalls::");
		}
	} 

}
