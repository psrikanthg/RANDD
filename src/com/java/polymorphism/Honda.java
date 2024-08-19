package com.java.polymorphism;

public class Honda extends Bike {

	int speedLimit =100;
	
	public static void main(String args[]) {
		Bike b = new Honda();
		System.out.println(b.speedLimit); //run time poliymorphism not applicable to data members
	}
}
