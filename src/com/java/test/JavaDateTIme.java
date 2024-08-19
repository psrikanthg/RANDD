package com.java.test;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class JavaDateTIme {
	
	public static void main(String args[]) {
		
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now().minusDays(1));
		
		/*
		 * String date ="07/02/0022"; String DATE_FORMAT_DD_MM_YYYY = "dd/MM/yyyy";
		 * String DATE_FORMAT_DD_MM_YY = "dd/MM/yy";
		 * System.out.println("Date format iss: "+date.replaceAll("0022", "2022"));
		 * System.out.println(isValidDateFormat(date, DATE_FORMAT_DD_MM_YY));
		 * System.out.println(formatDateFromPattern1ToPattern2(date,
		 * DATE_FORMAT_DD_MM_YYYY, DATE_FORMAT_DD_MM_YYYY));
		 */
		
	}
	
	public static String formatDateFromPattern1ToPattern2(String dateToBeFormatted, String pattern1, String pattern2) {
        SimpleDateFormat format1 = new SimpleDateFormat(pattern1);
        SimpleDateFormat format2 = new SimpleDateFormat(pattern2);
        format1.setLenient(false);
        String date = null;
        try {
            date = format2.format(format1.parse(dateToBeFormatted));
        } catch (ParseException ex) {
            
        }
        return date;
    }
	
	 public static boolean isValidDateFormat(String dateToBeValidated, String datePatternToBeFormatted) {
	        boolean isDateFormatValid = true;
	        DateFormat formatter = new SimpleDateFormat(datePatternToBeFormatted);
	        formatter.setLenient(false);
	        try {
	            formatter.parse(dateToBeValidated);
	        } catch (Exception ex) {
	            isDateFormatValid = false;
	        }
	        return isDateFormatValid;
	    }

}
