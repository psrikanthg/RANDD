package com.java.test;
import java.math.BigDecimal;

public class ExpotentialConverter {
	
	static String  PATTERN_SCIENTIFIC_NOTAT_TO_LONG = "%.0f";
	 
	public static void main(String args[]) {
		
		BigDecimal bd = new BigDecimal("1.21800008E7");
		long val = bd.longValue();
		System.out.println(val);
		
		System.out.println(String.format(PATTERN_SCIENTIFIC_NOTAT_TO_LONG, Double.parseDouble("1.21800008E7")));
		
		
	}

}
