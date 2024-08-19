package com.java.streams.interview;

import java.util.Arrays;

public class AnyMatchExa {
	
	public static void main(String args[]) {
		
		//Any match always returns false if stream is empty, can not evaluate predicate condition
		boolean b = Arrays.asList().stream().anyMatch(e ->true);
		System.out.println(b);
		
		
	}

}
