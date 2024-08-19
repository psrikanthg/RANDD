package com.java.test;

public class MultiCarAlarm implements Vechicle, Alarm {

	@Override
	public String brand() {
		return null;
	}
	
	@Override
	public String turnAlarmOn() {
		return Vechicle.super.turnAlarmOn();
	}
	     
	@Override
	public String turnAlarmOff() {
		return Vechicle.super.turnAlarmOff();
	}

	
}
