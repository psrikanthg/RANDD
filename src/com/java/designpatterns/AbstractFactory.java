package com.java.designpatterns;

public abstract class AbstractFactory {
 
	//just define an interface or abstract class class for creating families of related (or dependent) objects 
	//without specifying their concrete sub classes.
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);
	
}
