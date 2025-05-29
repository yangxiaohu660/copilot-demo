package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(3, 5);
        System.out.println("3 + 5 = " + addResult);
        
        int multiplyResult = calculator.multiply(3, 5);
        System.out.println("3 * 5 = " + multiplyResult);
    }
}
