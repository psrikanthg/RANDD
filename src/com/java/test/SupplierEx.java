package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierEx {
	
	public static void main(String args[]) {
		
		Supplier<Integer> avg = () -> 42;
		System.out.println("Answer to Everything: "+avg.get());
		
		List<String> dogNames =  Arrays.asList("boi", "clover", "zooey");
		
		Consumer<String> printNames = name->System.out.println(name);
		dogNames.forEach(printNames);
	}

}
