package com.java.test;

public class MethodOverloading {

	 public static void print(String str) {
		 System.out.println("str");
	 }
	 
	 public static void print(Object object) {
		 System.out.print("object");
	 }
	 
	 public static void main(String args[]) {
		 print(null);
	 }
}
