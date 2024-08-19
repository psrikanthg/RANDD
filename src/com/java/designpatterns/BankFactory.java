package com.java.designpatterns;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		if(bank == null) {
			return null;
		}
		if(bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		}
		if(bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		if(bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		}
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
