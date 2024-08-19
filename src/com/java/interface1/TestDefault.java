package com.java.interface1;
interface TestDefault{
	//Illegal combination of 
	// modifiers for the interface method 
	// m3; only one of abstract, default, or 
	// static permitted
  static default void m3(); 
  
}