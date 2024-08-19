package com.java.test;

public class TestProgram {
	
	public static void main(String args[]) {
		TestProgram tp = new TestProgram();
		System.out.println(tp.test());
	}
	
	public int test() {
	    int i = 1;
	    try {
	      return i;
	    } finally {
	      i = 2;
	    }
	  }
}
