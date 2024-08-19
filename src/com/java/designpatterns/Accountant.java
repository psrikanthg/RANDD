package com.java.designpatterns;
//there are many method which are not applicable to accountant, it is leaf node
public class Accountant implements Employee {

	 private int id;
	 private String name;
	 private double salary;
	 
	 public Accountant(int id, String name, double salary) {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
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
		
		System.out.println("============================");
		System.out.println("Emp id: "+id);
		System.out.println("Emp Name: "+name);
		System.out.println("Emp Salary: "+salary);
		
		System.out.println("============================");
		
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
