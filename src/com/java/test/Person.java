package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		
		this.name =name;
		this.age =age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String args[]) {
		
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("abc", 27));
		personList.add(new Person("mno", 26));
		personList.add(new Person("pqr", 28));
		personList.add(new Person("xyz", 25));
		System.out.println("Before sorting Person List");
		personList.forEach(person -> System.out.println(person.getName()+ " "+person.getAge()));
		
		Collections.sort(personList, (Person p1, Person p2) ->{
			return p1.getAge() - p2.getAge();
		});
		
		System.out.println("After sorting Person List");
		personList.forEach(person -> System.out.println(person.getName()+ " "+person.getAge()));
		
		
	}
	

}
