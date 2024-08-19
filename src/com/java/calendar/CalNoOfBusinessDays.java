package com.java.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalNoOfBusinessDays {
	
	public static void main(String args[]) throws ParseException{
		String oldDate = "11/10/2016";
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date dd = dateFormat.parse(oldDate);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dd);
		System.out.println("Call nof of biles"+cal.getTime());
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		System.out.println(" today date is "+calendar.getTime());
		Calendar  cc = (Calendar)calendar.clone();
		Calendar daysAdded = addBusinessDays(cal, 7);
		System.out.println("days added is "+daysAdded.getTime());
		if(cc.compareTo(daysAdded) == 0){
			
			System.out.println("both dates are same...");
		}
	}
	
	public static Calendar addBusinessDays(Calendar date, int noDays){
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.SECOND, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.setTime(date.getTime());
		
		
		for(int i =0; i<noDays; i++){
			calendar.add(Calendar.DATE, 1);
			if(calendar.get(Calendar.DAY_OF_WEEK) == 7){
				calendar.add(Calendar.DATE, 2);
			}
			
		}
		
		
		return (Calendar) calendar.clone();
	}

}
