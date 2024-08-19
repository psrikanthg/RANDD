package com.java.abstractfactor;

public interface AbstractFactory {
	
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);

}
