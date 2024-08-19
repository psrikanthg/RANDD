package com.java.string;


//overriding toString uses
public class Student {
	
	int rollno;
	
	String name;
	String city;
	
	Student(int rollno, String name, String city){
		this.rollno=rollno;
		this.name = name;
		this.city = city;
	}
	
	public static void main(String args[]) {
		
		  Student s1=new Student(101,"Raj","lucknow");  
		   Student s2=new Student(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  gives hashCode of s1
		   System.out.println(s2);//compiler writes here s2.toString()  gives hashCode
		   
		   //to get desired result you have to override toString() method
		   
	}

}
