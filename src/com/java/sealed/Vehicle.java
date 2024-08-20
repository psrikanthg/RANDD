package com.java.sealed;

import com.java.test.Vechicle;

public sealed abstract class Vehicle  permits Car, Truck, Motorcycle  {
  
	private final String make;
	private final String model;
	
	public Vehicle(String make, String model) {
		this.make =make;
		this.model =model;
	}
	
	public abstract void displayVehicleInfo();
	
	
}
