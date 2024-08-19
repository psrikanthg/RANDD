package com.java.designpatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//this is treated as a Composite 
public class BankManager  implements Employee{
        
    private int id;
    private String name;
    private double salary;
    List<Employee> employeeList = new ArrayList<>();
    
    public BankManager(int id, String name, double salary) {
    	this.id=id;
    	this.name =name;
    	this.salary = salary;
    }
    
    
	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void print() {
		System.out.println("Emp ID: "+id);
		System.out.println("Emp Name: "+name);
		System.out.println("Emp Salary: "+salary);
		
		Iterator<Employee> emp = employeeList.iterator();
		while(emp.hasNext()) {
			Employee emp1 = emp.next();
			emp1.print();
		}
		
	}

	@Override
	public void addEmployee(Employee e) {
		employeeList.add(e);
		
	}

	@Override
	public void removeEmployee(Employee e) {
		employeeList.remove(e);
		
	}

	@Override
	public Employee getChild(int i) {
		return employeeList.get(i);
	}

	
	
}
