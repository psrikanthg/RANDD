package com.parent;
public class TrickyNum<X extends Object> {
    
    private X x;
    
    public TrickyNum(X x) {
        this.x = x;
    }
    
    private double getDouble() {
        return x.doubleValue(); // compilation exception
    }
    
    public static void main(String args[]) {
        TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
        System.out.print(a.getDouble());
    }
}