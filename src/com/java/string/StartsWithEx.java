package com.java.string;
/*
 * public boolean startsWith(String str)
 * public boolean startsWith(String str, int offset)
 * 
 * 
 */
public class StartsWithEx {

	 public static void main(String... args){
		 
		 String str ="Split has two methods in it split with limit";
		 
		  if(str.startsWith("two", 10)){
			  System.out.println("starting string from with limt");
		  }
		  
		  if(str.startsWith("Split has")){
			  System.out.println("starting string with out limit");
		  }
		 
			  String se ="Hello string matches";
			  if(se.matches("Matches|matches")){
				  System.out.println("both are coreect");
			  }
	 }
}
