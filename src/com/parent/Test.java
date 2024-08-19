package com.parent;
class Vehicle {
    public void printSound() {
        System.out.print("vehicle");
    }
}

class Car extends Vehicle {
    public void printSound() {
        System.out.print("car");
    }
}

class Bike extends Vehicle {
    public void printSound() {
        System.out.print("bike");
    }
}

public class Test {
    public static void main(String[] args) {
        Vehicle v = new Car();
        Bike b = (Bike) v; //gives run time error, car can not cast to class bike
        //Exception in thread "main" java.lang.ClassCastException: class com.parent.Car cannot be cast to class com.parent.Bike
        
        v.printSound();
        b.printSound();
        
        String s = "srikanth";
        String s2 ="false";
        
        if(s != null && s2!= null && (s.equals("sr") |s2.equals("true"))){
        	
        	System.out.println("both are true");
        }
    }   
}