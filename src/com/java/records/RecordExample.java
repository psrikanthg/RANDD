package com.java.records;

public class RecordExample {
	
	public static void main(String args[]) {
		
		EmployeeRecord  record = new EmployeeRecord(2, "Kabir", 100000);
		System.out.println(record.empName());
		System.out.println(record.empSalary());
		System.out.println(record.empId());
		
	}

}
