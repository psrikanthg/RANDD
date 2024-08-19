package com.java.test;

public interface Interfac1 {
	
	private void show1() {
		System.out.println("Interface can have private methods");
	}
	
	public static void display() {
		System.out.println("Interface can have static methods in interface");
	}
	
	default void show() {
		System.out.println("Interface 1");
	}

}
