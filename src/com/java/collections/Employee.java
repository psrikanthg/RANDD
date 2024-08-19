package com.java.collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Employee {
	
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public int hashCode(){
		
		return 2;
	}
	
	
	public static void main(String args[]){
		
		Employee  employee = new Employee();
		employee.setFirstName("srikanth");
        employee.setLastName("goud");
		Employee  s = new Employee();
		
		s.setFirstName("srikanth");
		s.setLastName("goud");
		
		TreeSet<Employee> set = new TreeSet<Employee>();
		//set.add(employee); throws run time error called, classcast exception
	    //set.add(s); //Employee cannot be cast to class java.lang.Comparable
		System.out.println(set);
		
		HashSet<Employee> set2 = new HashSet<Employee>();
		
		set2.add(employee);
		set2.add(s);
		System.out.println(set2.size());
		
		 
	}

}
