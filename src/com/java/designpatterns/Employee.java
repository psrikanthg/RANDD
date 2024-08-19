package com.java.designpatterns;
//this is Employee Interface i.e Component
public interface Employee {
  
	public int getId();
	public String getName();
	public double getSalary();
	public void print();
	
	public void addEmployee(Employee e);
	public void removeEmployee(Employee e);
	
	public Employee getChild(int i);
	
}
