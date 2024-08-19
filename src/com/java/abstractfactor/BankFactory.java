package com.java.abstractfactor;

public class BankFactory implements AbstractFactory {

	@Override
	public Bank getBank(String bank) {
	 
		  if(bank ==null) {
			  return null;
		  }
		  
		  if(bank.equals("SBI")) {
			  return new SBI();
		  }
		  
		  if(bank.equals("ICICI")) {
			  return new ICICI();
		  }
		  
		  if(bank.equals("HDFC")) {
			  return new HDFC();
		  }
		  
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		// TODO Auto-generated method stub
		return null;
	}

}
