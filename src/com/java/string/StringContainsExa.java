package com.java.string;

import java.util.ArrayList;

/*
  syntax is public boolean contains(CharSequence sequence)
   *  join() method added in java1.8
   *  public static String join(CharSequence delimiter, CharSequuence... elements) throws nullpointer exception
   *  if delimiter or element is null
 */ 
public class StringContainsExa {
	
	String name ="public";
	String empty = "";
	public static void main(String... args){
		
		StringContainsExa name = new StringContainsExa();
		String s ="public boolean contains(CharSequence sequence)";
		
		System.out.println("squence contains string is"+s.contains("squence")); // not found returns false
		
		System.out.println("r contains string is"+s.contains("r"));//found returns true
		System.out.println("( contains string is"+s.contains("("));
		
		//System.out.println("null conatins string is +"+s.contains(null));//throws Run time Exception called
		//Runt time Exception
		
		System.out.printf(" %s contains word 'public' "+s.contains(name.name), s);//works with out any issues
		
		
		System.out.printf(" \n %s \"\" conatins string is "+s.contains(""), s);//if we passed like this, it returns true
		
		System.out.printf("\n  by passing new String conatins string is "+s.contains(new String("public")), s); //This also works fine
		
		//Declare CharSequence
		java.lang.CharSequence charSequence ="boolean";
		
		System.out.printf(" \n  %s by passing CharSequence variable %n"+s.contains(charSequence), s);
		
		ArrayList<String> arrayList = new ArrayList<String>();
	    arrayList.add(0, "srikanth"); //as arraylist is growable, it moves elements to other position.
		arrayList.add(0, "srikanth");
		arrayList.add(0, "srikanth");
		arrayList.add(0, "srikanth");
		
		System.out.println(arrayList.get(0));
		
		System.out.println(" size is "+arrayList.size()+" "+arrayList);
	}

}
