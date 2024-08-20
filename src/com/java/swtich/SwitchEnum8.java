package com.java.swtich;

public class SwitchEnum8 {
	
	public static void main(String args[]) {
		
		Days days = Days.SUNDAY;
		switch (days) {
	    case MONDAY:
	        System.out.println("Weekdays");
	        break;
	    case TUESDAY:
	        System.out.println("Weekdays");
	        break;
	    case WEDNESDAY:
	        System.out.println("Weekdays");
	        break;
	    case THURSDAY:
	        System.out.println("Weekdays");
	        break;
	    case FRIDAY:
	        System.out.println("Weekdays");
	        break;
	    case SATURDAY:
	        System.out.println("Weekends");
	        break;
	    case SUNDAY:
	        System.out.println("Weekends");
	        break;
	    default:
	        System.out.println("Unknown");
		
	   }
	}
}
