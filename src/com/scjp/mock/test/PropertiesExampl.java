package com.scjp.mock.test;

import java.util.Properties;

public class PropertiesExampl {
	
	public static void main(String args[]){
		Properties p = System.getProperties();
		System.out.println(p.getProperty("key1"));
	}

}
