package com.java.map.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnModifiedArrayList {
	
	public static void main(String args[]) {
		List<String> fruitList = new ArrayList<>();
		
		    fruitList.add("Mango");  
	        fruitList.add("Banana");  
	        fruitList.add("Apple");  
	        fruitList.add("Strawberry");  
	        fruitList.add("Pineapple");  
	        
	    List<String> unModifediList = Collections.unmodifiableList(fruitList);
	    unModifediList.add("INDIA"); //throws run time exception unsupported operation exception.
	    System.out.println(fruitList);
	    
	    //Map does not allow null keys but allows number of null values
	    //hashMap, linkedHashMap allow null keys n null values
	    //HashMap does not maintain any order
	    //linkedHashMap extends HashMap class, it maitains insertion order
	    //treamMap does not allow any null key or value
	    //Map can not be traversed, so you need to convert to set using entrySet or keySet()
	    
	    
	    //ArrayList Maintains insertion order, not synchronized
	    //LinkedList maintains insertion order
	    //linkedList maintains insertion order
	    
		
	}

}
