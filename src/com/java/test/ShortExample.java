package com.java.test;
import java.util.HashSet;
import java.util.Set;

public class ShortExample {
	
	public static void main(String args[]) {
		
		Set<Short> shortSet = new HashSet<>();
		for(short i=0; i< 100; i++) {
			shortSet.add(i);
			shortSet.remove(i-1);
			
			
		}
		shortSet.remove(1);
		
		System.out.println(shortSet.size()+" "+shortSet);
	}

}
