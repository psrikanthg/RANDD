package com.java.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * public String split(String regex)
 * 
 * public String split(String regex, int limit) 
 * returns array of strings
 * 
 * limit: limit the number of strings in array. if it is zero it will returns all the strings matching regex
 * throws PatternSytanxException  if pattern for regular expression is invalid
 * 
 * 
 */
public class SplitEx {
	
	public static void main(String... args){
		
		String sp ="java is oops programing languages";
		
		String cr[] = sp.split("\\s"); 
		System.out.println(Arrays.toString(cr));
		//string is array type. we have length not length() method
		for(int i=0; i<cr.length; i++){
			
		}
		
		for(String s1 :cr){
			
			System.out.println("spliting with space "+s1);
		}
		
		
		
		String s0[] = sp.split("\\s", 0); //if it is zero returns all strings
		
		for(String str: s0){
			
			System.out.println(str);
		}
		
		
		String s1[] = sp.split("\\s", 1); //only one words, starting from first space
		
		for(String str: s1){
			
			System.out.println("spliting with space with range limit is 1 "+str);
		}
		
		 String s2[] = sp.split("\\s", 2); //only two words, starting from first space
			
			for(String str: s2){
				
				System.out.println("spliting with space with range limit is 2 "+str);
			}
			
			
			/*String test = "This is a test string";  mock test
			String[] tokens = test.split("\s");
			System.out.println(tokens.length);*/
			
			String test = "This is a test string";
			String[] tokens = test.split("\\s");
			System.out.println(tokens.length);  
			
			
			         Object myObj = new String[]{"one", "two", "three"};
			        
			         {
			           for (String s : (String[])myObj) System.out.print(s + ".");
				      }
			         
			         LinkedList<String> list = new LinkedList<String>();
			         list.add("BbB1"); //65
			         list.add("bBb2"); //97, 98
			         list.add("bbB3");
			         list.add("BBb4"); //65
			         Collections.sort(list);
			         for (String str : list) {
			             System.out.print(str + ":");
			         }
			         
			         
			         
			         List lists = new LinkedList<String>();
			         lists.add("one");
			         lists.add("two");
			         lists.add("three");
			         
			         Collections.reverse(list);
			         Iterator iter = list.iterator();
			         //Can only iterate over an array or an instance of java.lang.Iterable, not through for each
			        // for (Object o : iter) {
			            // System.out.print(o + " ");
			        // }
			
		}

}
