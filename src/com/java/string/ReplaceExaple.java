package com.java.string;
import static java.lang.System.out;
public class ReplaceExaple {
	
	public static void main(String args[]){
		
		String s="A.B.C!";
		
		out.println(s.replace("\\.", ",").replace("!", ","));
		
	}

}
