package com.java.test;

public enum Coffee {
	
	 ESPRESSO, MOCHA, LATTE;
    public String toString() {
        return String.valueOf(ESPRESSO);
    }
    public static void main(String[] args) {
        System.out.println(Coffee.ESPRESSO);
    }

}
