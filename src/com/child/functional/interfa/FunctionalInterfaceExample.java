package com.child.functional.interfa;

@FunctionalInterface
public interface FunctionalInterfaceExample {
  
	int randomCalculate(int a, int b);
	
	public int j=0;
	
	
	default void print(int result) {
		System.out.println(result);
	}
}
