package com.java.prototype;

public class Employee  implements Prototype{
	
	private String name;
	private int id;
	
	private String address;
	
	private double salary;
	
	
	
	public Employee(String name, int id, String address, double salary) {
		this.name =name;
		this.id =id;
		this.address =address;
		this.salary =salary;
	}
	
	public void showRecord() {
		System.out.println(id+"\t"+name+"\t"+address+"\t"+salary);
	}

	@Override
	public Prototype getClone() {
		
		return new Employee(name, id, address, salary);
	}

	
	
}
