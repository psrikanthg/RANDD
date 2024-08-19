package com.java.designpatterns;

public class FactoryCreator {
	
	public AbstractFactory getFactory(String choice) {
		
		if(choice.equalsIgnoreCase("Bank")) {
			return new BankFactory();
		}
		
		if(choice.equalsIgnoreCase("Loan")) {
			return new LoanFactory();
		}
		
		return null;
		
	}

}
