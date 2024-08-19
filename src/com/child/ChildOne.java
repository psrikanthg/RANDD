package com.child;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.java.abstractex.Shape;




public class ChildOne  {
	
	Shape f = new Shape();
	
	
	
	
	public static void main(String args[])throws ParseException{
		
		String oldDate = "11/07/2016";
		
		
		Date d = new SimpleDateFormat("MM/dd/yyy").parse(oldDate);
		
		System.out.println("date is dd"+d);
		System.out.println(" Hello...dddd");
		
	}

}
