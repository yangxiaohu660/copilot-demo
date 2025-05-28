package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        System.out.println("3 + 5 = " + result);
    }
}
