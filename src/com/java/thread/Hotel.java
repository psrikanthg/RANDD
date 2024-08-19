package com.java.thread;
public class Hotel  {
    
    private static void book() {
        System.out.print("book");
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1);
        book();
        
        Vehicle v = new Car();
        Car c = (Car) v;
        
        v.printSound();
        c.printSound();
    }
}


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

