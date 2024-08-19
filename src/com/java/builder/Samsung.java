package com.java.builder;

public class Samsung extends Company {

	@Override
	public double price() {
		return 25.50;
	}

	@Override
	public String pack() {
		return "Samsung";
	}

}
