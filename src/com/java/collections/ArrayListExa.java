package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

public class ArrayListExa extends java.util.ArrayList<String>{
	
	public static void main(String ...args){
		
		ArrayListExa arrayListExa = new ArrayListExa();
		
		arrayListExa.add("srikanth");
		arrayListExa.add("bubby");
		
		out.println(arrayListExa.size());
		arrayListExa.remove(0);
		
		out.println(arrayListExa.size());
		
		String hello="hello";
		String world ="world";
		StringBuilder builder = new StringBuilder(hello+world);
		builder.append("!");
		java.util.List<String> list = Arrays.asList(hello, world, builder.toString());
		//Arrats.asList returns fixed size list, adding or removing elements throws run time error
		//unsupportedOperationExcetion
		//Arrays.asList is mutable
		//list.set(0, "Java"); //seting elements within list size can
		out.println(list);
		list.remove(0); //throws run time exception called unsupported exception.
		out.println(list);
	}

}
