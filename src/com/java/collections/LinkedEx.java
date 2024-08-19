package com.java.collections;
import static java.lang.System.out;
import static java.util.Collections.sort;

public class LinkedEx {

	String name;
	int age;
	
	public LinkedEx(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public static void main(String ...args){
		//manipulation with linkedlist is faster than arraylist because of no shifting
		//linked list act as a list and queue both implements the list and interface
		java.util.LinkedList<String> linkedList = new java.util.LinkedList<String>();
		
		linkedList.add("e");
		linkedList.add("b");
		linkedList.add("c");
		sort(linkedList);
		out.println(linkedList);
		out.println(linkedList.size());
		
		java.util.LinkedList<LinkedEx> exs = new java.util.LinkedList<LinkedEx>();
		
		exs.add(new LinkedEx("sriknath", 29));
		exs.add(new LinkedEx("bubby", 25));
		out.println(" srikanth object contains "+exs.contains(new LinkedEx("sriknath", 29)));
		out.println(exs.size());
		out.println(exs.remove(new LinkedEx("sriknath", 29)));
		
		java.util.Vector<String> vector = new java.util.Vector<String>(); //vector uses iterator and enumaration
		//vector is synchronized. 
		//vector is legacy
		//vector implements list interface, extends abstractList
		vector.add("Abc");
		vector.add("srikanth");
		vector.add("Abc");
		vector.add("srikanth");
		vector.addElement("lohit");
		
		out.println(vector.size());
		out.println(vector.removeAll(vector));
		out.println(vector.size());
		
	}
}
