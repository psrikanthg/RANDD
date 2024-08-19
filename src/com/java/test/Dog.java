package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Dog {
	
	private String name;
	private int weight;
	private int age;
	
	public Dog(String name, int weight, int age) {
		this.name=name;
		this.weight=weight;
		this.age=age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public static void main(String args[]) {
		
		Dog boi = new Dog("boi", 30, 6);
		Dog clover = new Dog("clover", 35, 12);
		
		DogQuerier dq = d->d.getAge()>9;
		System.out.println("is boi older than 9"+dq.test(boi));
		System.out.println("is clover older than 9"+dq.test(clover));
		
		DogQuerier dq1 = d->{
			System.out.println("Dog Name: "+d.name);
			return d.getAge()>9;
		};
		
		System.out.println("is boi older than 9"+dq1.test(boi));
		System.out.println("is clover older than 9"+dq1.test(clover));
		
		Function<Integer, Integer> id = Function.identity();
		System.out.println(id.apply(42));
		
		List<String> dogName =Arrays.asList("Dong1", "Dog2", "Dong3");
		dogName.forEach(t-> System.out.println(t));
		
		dogName.forEach(System.out::println);
		
		
		
		
		
	}
	

}
