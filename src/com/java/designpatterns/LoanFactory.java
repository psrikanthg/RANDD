package com.java.designpatterns;

public class LoanFactory  extends AbstractFactory{

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		
		if(loan ==null) {
			return null;
		}
		
		if(loan.equalsIgnoreCase("HomeLoan")) {
			return new HomeLoan();
		}
		if(loan.equalsIgnoreCase("EducationLoan")) {
			return new EducationLoan();
		}
		if(loan.equalsIgnoreCase("BusinessLoan")) {
			return new BusinessLoan();
		}
		
		return null;
	}

	
	
}
