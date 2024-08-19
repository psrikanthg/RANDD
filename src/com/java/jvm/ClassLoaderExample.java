package com.java.jvm;

public class ClassLoaderExample {
	
	public static void main(String args[]) {
		
		//Application/System classloader will load this class
		Class c = ClassLoaderExample.class;
		System.out.println(c.getClassLoader());

		//Each thread has a private JVM stack, created at the same time as thread.


		
	  ////If we print the classloader name of String, it will print null because it is an
	  //in-built class which is found in rt.jar, so it is loaded by Bootstrap classloader  
	  System.out.println(String.class.getClassLoader());//it prints null 
	
	}

}
