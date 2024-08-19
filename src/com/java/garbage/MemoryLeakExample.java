package com.java.garbage;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
  private static List<Object> list = new ArrayList<>();
  
  public static void main(String args[]) {
	  
	  for(int i=0; i<10000; i++) {
		  list.add(new Object());
	  }
  }
	 
}
