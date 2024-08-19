package com.java.garbage;

import java.util.ArrayList;
import java.util.List;
//Exception in thread "main" java.lang.OutOfMemoryError: Java heap space example
public class OutOfMemoryExample {
	
	public static void main(String args[]) {
		List<int[]>  list = new ArrayList<>();
		
			while(true) {
				list.add(new int[1000000]);
			}
		
		
	}

}
