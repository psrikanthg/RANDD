package com.java.collections;

import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import static java.lang.System.out;

public class PersistentSetList {
	public static void main(String args[]){
		
		 Set<Integer> set = new LinkedHashSet<Integer>();
		 List<Integer> list = new ArrayList<Integer>();
		
		 for(int i=-3; i<3; i++){
			 set.add(i);
			 list.add(i);
		 }
		 out.println(set+"  "+list);
		 for(int i=0; i<3; i++){
			 //set.remove(i);
			 list.remove(i);
		 }
		 
		 out.println(set+" "+list);
		
	}
	
	
   
}
