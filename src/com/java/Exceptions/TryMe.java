package com.java.Exceptions;
class A {
    public void doA() {
        B b = new B();
        b.dobB();
        System.out.print("doA");
    }
}

class B {
    public void dobB() {
        C c = new C();
        c.doC();
        System.out.print("doB");
    }
}

class C {
    public void doC() {
        if (true)
            throw new NullPointerException();
        System.out.print("doC");
    }
}

public class TryMe {

    public static void main(String args[]) {
        try {
        	
        	int i =10;
        	while(i++<=10){
        		i++;
        		
        	}
        	System.out.println(i); //
            A a = new A();
            a.doA();
        } catch (Exception ex) {
            System.out.print("error");
        }
        
        System.exit(0);
    }
}