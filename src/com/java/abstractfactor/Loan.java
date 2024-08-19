package com.java.abstractfactor;

public abstract class Loan {
	
	protected double rate;
	
	abstract void rateOfInterest(double rate);
	
	public int years;
	
	public void calculateLoanPayment(double loanAmount, int years) {
		int n;
		
		n = years*12;
		
		rate = rate/1200;
		
		double EMI;
		
		EMI = (rate*Math.pow((1+rate), n))/((Math.pow((1+rate),n))-1)*loanAmount;
	}
	

}
