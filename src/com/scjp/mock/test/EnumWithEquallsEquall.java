package com.scjp.mock.test;

public class EnumWithEquallsEquall {
	enum Month{JAN, FEB, MAR};
	
	public static void main(String args[]){
		
		Month m1= Month.JAN;
		Month m2 = Month.JAN;
		Month m3 = Month.MAR;
		
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1 == m3);
		System.out.println(m1.equals(m3));
		
	}
	
	
	
	
}
