package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class PersistentExample {

	  private Map<String, String> hasMap = new HashMap<String, String>();
	  
	  public void PersistentExample(){
		  
		  hasMap.put("Moncky", "srikanth");
		  hasMap.put("Moncky", "etst");
	  }
	  
	  public int size(){
		  return hasMap.size();
	  }
	  
	  public static void main(String args[]){
		  
		  PersistentExample per = new PersistentExample();
		  System.out.println(per.size());
	  }
}
