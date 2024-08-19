package com.java.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * 
 * 
 */
public class DateFormats {
	
	
	public static void main(String... args){
		Logger logger = Logger.getLogger(DateFormats.class.getName());
		logger.log(Level.INFO, "My Loges"+logger.getName());
		logger.log(Level.WARNING, "My Loges"+logger);
		logger.log(Level.OFF, "My Loges"+logger);
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("today date is "+new SimpleDateFormat("F").format(calendar.getTime())); //throws Runt time exception
		System.out.println(" Week in year is "+new SimpleDateFormat("w").format(calendar.getTime()));
		//w means gives number of week in year
		
		System.out.println(" Week in year is "+new SimpleDateFormat("W").format(calendar.getTime()));
		//W means gives number of week in Month
		System.out.println(" Day in month is "+new SimpleDateFormat("d").format(calendar.getTime()));
		//d means day in month
		
		
		System.out.println(" Day in Year is "+new SimpleDateFormat("D").format(calendar.getTime()));
		//D means Day in year
		
		System.out.println(" Day name in week is "+new SimpleDateFormat("E").format(calendar.getTime()));
		//E means Day name in week
		
		//System.out.println(" Day number in week is "+new SimpleDateFormat("u").format(calendar.getTime())); //u is not date specifier
		//u means Day number in week(1-7)
		
		System.out.println(" Day name in week is "+new SimpleDateFormat("F").format(calendar.getTime()));
		//F means Day of week in month 1 week 2n week 3 rd week
		
		String s1 ="11/21/2016";
		String s2 ="11/23/2016";
		
		Date d1 = null;
		Date d2 = null;
		
		try {
			d1 = new SimpleDateFormat("MM/dd/yyyy").parse(s1);
			d2 = new SimpleDateFormat("MM/dd/yyyy").parse(s2);
			
			if(d2.after(d1)){
				System.out.println("d2  after d1");
			}
		} catch (ParseException exception) {
			
		}
		
	}
	
	public static void show1(){
		
		System.out.println("show one called..");
		
	}
	
	public static void display(){
		
		System.out.println("dispaly is called..");
	}

}
