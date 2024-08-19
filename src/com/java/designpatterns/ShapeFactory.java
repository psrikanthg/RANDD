package com.java.designpatterns;

import java.util.HashMap;

public class ShapeFactory {

	 public static final HashMap  hashMap = new HashMap();
	 
	 public static Shape getCircle(String colour) {
		 Circle circle = (Circle)hashMap.get(colour);
		 
		 if(circle == null) {
			 
			 circle = new Circle(colour);
			 hashMap.put(colour, circle);
			 System.out.println("Creating circle of color : " + colour);
			 
		 }
		 return circle;
	 }
	
}
