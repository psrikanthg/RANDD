package com.java.factory;

public class FactoryDesingPattern {
	
	public static void main(String args[]) {
		
		GetPlanFactory plan = new GetPlanFactory();
		
		int units =50;
		
		Plan p = plan.getPlan("Domestic");
		
		
		System.out.println("Bill Amount for "+"Domestic"+" of "+units+" unit is: ");
		  
		p.getRate();
		p.calculateBill(units);
		
		
	}

}
