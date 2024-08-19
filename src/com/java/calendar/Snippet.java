package com.java.calendar;


import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Snippet {
	public static void main(String... args){
		
		DateFormat df = DateFormat.getDateInstance();
		df.setLocale(Locale.US); // Compile fails
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2009);	
		c.set(Calendar.MONTH, 5);
		c.set(Calendar.DAY_OF_MONTH, 1);
		String formattedDate = df.format(c.getTime());
		System.out.println(formattedDate);
		
	}
	
}

