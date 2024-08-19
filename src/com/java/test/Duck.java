package com.java.test;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;



public class Duck implements Comparable<Duck>{
	
	String name;
	String colour;
	int age;
	
	
	public Duck(String name, String colour, int age) {
		this.name=name;this.colour=colour; this.age=age;
	}
	
	
	
	@Override
	public int compareTo(Duck o) {
		
		return this.name.compareTo(o.name);
	}


	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
    public static void main(String args[]) {
		List<Duck> ducks = Arrays.asList(new Duck("Jerry", "Yellow", 3), 
				new Duck("George", "brown", 4),
				new Duck("Kramer", "Mottled", 6),
				new Duck("Elaine", "white", 2),
				new Duck("Hey", "Mottled", 2),
				new Duck("Louie", "white", 4),
				new Duck("Dewey", "brown", 6));
		
		//list all duck names
		ducks.stream().map(Duck::getName).forEach(d->System.out.print(d+" "));
		//avg age of ducks a whole number
		OptionalDouble avgAge =  ducks.stream().mapToInt(d ->d.getAge()).average();
		System.out.println("Avg age: "+avgAge.getAsDouble());
		
		//count how many ducks Mottled colour
		long sum = ducks.stream().filter(d->d.getColour().equals("Mottled")).count();
		System.out.println("Mottled ducsk count:"+sum);
		
		ducks.stream().filter(d-> d.getColour().equals("Mottled")).map( d->d.getName()).forEach(System.out::println);
		
		//Group By Colours
		ducks.stream().collect(Collectors.groupingBy(Duck::getColour)).forEach((c, d)->{
			
			System.out.println("Ducks who are "+c+" :");
			d.forEach(d1->System.out.println(d1.getName()+ " "));
		});
		
		
		List<Integer> myInts = Arrays.asList(5, 10, 7, 2, 8);
		OptionalInt minInt = myInts.stream().mapToInt(i->i).min();
		System.out.println("Minum int:"+minInt.getAsInt());
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

}
