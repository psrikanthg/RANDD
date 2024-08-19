package com.java.abstractfactor;

public class FactoryCreator {
	
	public static AbstractFactory getFactory(String choice) {
		if(choice.equals("Bank")) {
			return new BankFactory();
		}
		
		if(choice.equals("loan")) {
			return new LoanFactory();
		}
		
		return null;
	}

}
