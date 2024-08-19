package com.java.abstractfactor;

public class LoanFactory implements AbstractFactory {

	@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loan) {
		if(loan == null) {
			return null;
		}
		
		if(loan.equals("HomeLoan")) {
			return new HomeLoan();
		}
		
		if(loan.equals("EducationLoan")) {
			return new EducationLoan();
		}
		
		if(loan.equals("Business")) {
			return new BusinessLoan();
		}
		
		
		
		return null;
	}

}
