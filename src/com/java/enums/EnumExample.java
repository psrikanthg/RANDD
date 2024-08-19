package com.java.enums;

import java.text.ParseException;

import com.java.interface1.InterEx;
//enum can implement interface

public  enum EnumExample implements InterEx {
  BAR, BEER, WINE;

private EnumExample() {
	
}
	
@Override
public void show()  {
	// TODO Auto-generated method stub
	
}

@Override
public void display() throws ParseException {
	// TODO Auto-generated method stub
	
 }

public static void main(String args[]) {
	EnumExample enu = new EnumExample();
}
}
