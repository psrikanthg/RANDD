package com.java.DateAndTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//G for ERA and BC/AC
//M month
//w week in year
//W week in Month
//D day in year
//d day in month
public class CustomDatePatterns {
	
	public static void main(String... args){
		
		String datFormats[] = {"D 'day of Year' yyyy", "dd 'day of month' MMMM",
				"w 'weeek in year' yyyy", "W 'week in month' MM", 
				"EEEE ' today day name , in month ' MMM",
				"u"};
	
	     Date toDate  = new Date();
	     
	     for(String formats: datFormats){
	    	 
	    	 System.out.println(new SimpleDateFormat(formats).format(toDate));
	     }
	     
	     //H for 0 -23, h for 1-12, K 0-11, k 1-24
	     //k means 1-24
	     //K means 0-11
	     //H means 0-23
	     //h means 1-12
	     String timeFormats[] = {"k:mm:ss:SSS:zzz", "K:mm:ss:SSS:zzzz, a",
	    		 "HH:mm:ss:SSS:zzz:a", "hh:mm:ss:SSS:zzzz: a"};
	     
		 for(String timeFormat: timeFormats){
			    	 
			    	 System.out.println(new SimpleDateFormat(timeFormat).format(toDate));
			     }
			     
			}
	
	
	
	

}
