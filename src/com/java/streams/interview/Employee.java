package com.java.streams.interview;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee implements Comparator<Employee> {
	
	private long id;
	private String name;
	private int age;
	private String gender;
	private String department;
	int yearofJoining;
	private LocalDate dateOfBirth;
	private double salary;
	
	
	public Employee(long id, String name, LocalDate dateOfBirth, double salary, int age, String gender, String department, int yearofJoining) {
		this.id=id;
		this.name=name;
		this.dateOfBirth =dateOfBirth;
		this.salary =salary;
		this.age=age;
		this.gender=gender;
		this.department = department;
		this.yearofJoining=yearofJoining;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		
		return "id: "+id+" name: "+name+"dateOfBirth :  "+dateOfBirth+" salary: "+salary;
	}
	
	@Override
	public int compare(Employee arg0, Employee arg1) {
		
		return arg0.getDateOfBirth().compareTo(arg1.getDateOfBirth());
	}
	
	
	public static void main(String args[]) {
		
		
		
		getListOfEmployeesObjectsNull().stream().sorted(Comparator.nullsFirst(new DateOfBirthComparator())).forEach(System.out::println);	
	    System.out.println("Date Of Birth Object is Null");
		getListOfEmployeesDateOfBirthIsNull().stream().sorted(new DateOfBirthComparator()).forEach(System.out::println);
	    System.out.println("with Lambda syntax");
	    
	    getListOfEmployeesDateOfBirthIsNull().stream().sorted(Comparator.comparing(Employee::getDateOfBirth, Comparator.nullsFirst(Comparator.naturalOrder()))).forEach(System.out::println);
	 
	    //Sorting Null with natural orders
	    List<String> names = Arrays.asList("C", null, "B", "D", null, "A", "E");
	    System.out.println("Primitives with sorting::");
	    names.stream().sorted(Comparator.nullsLast(Comparator.naturalOrder())).collect(Collectors.toList()).forEach(System.out::println);
	    
	    
	    
	    //linkedhash map preserve the ordering of elements in which they are inserted
	    
	    Integer[] numbers = new Integer[] { 15, 11, 9, 55, 47, 18, 1123, 520, 366, 420 };
	    Arrays.sort(numbers);
	    System.out.println("Sorting Arrays: "+Arrays.toString(numbers));
	    
	    Arrays.sort(numbers, Comparator.reverseOrder());
	    System.out.println("Reverse Order: "+Arrays.toString(numbers));
	    
	    Collections.sort(getListOfEmployeesDateOfBirthIsNull(), Comparator
                .comparing(Employee::getName)
                .thenComparing(Employee::getDateOfBirth));
	    //get higest salary employee in org
	    List<Employee> emplList = getListOfEmployeesDateOfBirthIsNull();
	    Comparator<Employee> cm1=Comparator.comparing(Employee::getName);  
	    Collections.sort(emplList, cm1);
	    System.out.println("=============Sort By Name::================ ");
	    emplList.forEach(e -> System.out.println(e.getName()));
	    
	   Employee emp = emplList.stream().max(Comparator.comparing(Employee::getSalary)).get();
	   System.out.println("Highest Salary: "+emp.getSalary());
	    
	   Optional<Employee> higestPaidSalary = emplList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
	   System.out.println("Higest Salary Emp: "+higestPaidSalary.get().name+" "+higestPaidSalary.get().salary);
	   
	    Map<String, Double> avgAges =emplList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getAge)));
	   
	    //Avg age of Each Department
	    Map<String, Double> avgAge =emplList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getAge)));
	    System.out.println("Avg Age of Student in Each Department");
	    System.out.println(avgAge);
	    
	    //Senior Most Employee
	     Optional<Employee> seniorEmp= emplList.stream().sorted(Comparator.comparing(Employee::getYearofJoining)).findFirst();
	     System.out.println("Senior Most Employee");
	     System.out.println(seniorEmp.get().name+" "+seniorEmp.get().getYearofJoining());
	     
	     //given list of employees, find most youngest in org
	     Optional<Employee> yooungEmp =  emplList.stream().min(Comparator.comparing(Employee::getAge));
	     System.out.println("Most Yougest Emloyee");
	     System.out.println(yooungEmp.get().name+"  "+yooungEmp.get().getAge());
	      
	     //find no of Male n FeMale Employee in the list
	     Map<String, Long> noMaleFem = emplList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
	     System.out.println("No of Male & FeMale Employees");
	     System.out.println(noMaleFem);
	     
	     //sum of All employee salaries
	     Double totalSalries = emplList.stream().mapToDouble(e -> e.getSalary()).sum();
	     System.out.println(totalSalries);
	
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearofJoining() {
		return yearofJoining;
	}

	public void setYearofJoining(int yearofJoining) {
		this.yearofJoining = yearofJoining;
	}

	public static List<Employee> getListOfEmployeesObjectsNull(){
		List<Employee> empList =new ArrayList<>();
		    empList.add(new Employee(1, "A", LocalDate.of(1992, 1, 1), 30000d, 5, "Male", "IT", 2012));
		    empList.add(null);
		    empList.add(new Employee(3, "C", LocalDate.of(1992, 9, 1), 50000d, 5, "Male", "IT", 2012));
		    empList.add(null);
		    empList.add(new Employee(5, "E", LocalDate.of(1992, 8, 1), 60000d, 5, "Male", "IT", 2012));
		
		return empList;
	}
	
	public static List<Employee> getListOfEmployeesDateOfBirthIsNull(){
		List<Employee> empList =new ArrayList<>();
	    empList.add(new Employee(3, "C", LocalDate.of(1992, 8, 1), 50000d, 5, "Male", "IT", 2012));
	    empList.add(new Employee(4, "D", LocalDate.of(2001, 3, 11), 50000d, 15, "Male", "CS", 2010));
	    empList.add(new Employee(5, "E", null, 60000, 25, "female", "IT", 2015));
	    empList.add(new Employee(1, "A", LocalDate.of(1991, 1, 1), 30000d, 35, "Male", "EC", 2016));
	    empList.add(new Employee(2, "B", null, 20000d, 45, "female", "IT", 2019));
		
		return empList;
	}
	

}
