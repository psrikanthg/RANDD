package com.java.designpatterns;

public class Casher implements Employee {

	private int id;
	private String name;
	private double salary;
	
	public Casher(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public void print() {
		
		System.out.println("==========================");
		System.out.println("Emp. Id : "+id);
		System.out.println("Emp Name : "+name);
		System.out.println("Emp Salary : "+salary);
		
		System.out.println("==========================");
		
	}

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
