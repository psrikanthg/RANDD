package com.java.test;

public interface Vechicle {

	 String brand();
	 default String turnAlarmOn() {
		 return "Turning the vehice alarm on.";
	 }
	 
	 default String turnAlarmOff() {
		 return "Turning the Vechicle Alaram off.";
	 }
}
