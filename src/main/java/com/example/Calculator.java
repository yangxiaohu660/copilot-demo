package com.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int addResult = calculator.add(3, 5);
        System.out.println("3 + 5 = " + addResult);
        
        int subtractResult = calculator.subtract(10, 4);
        System.out.println("10 - 4 = " + subtractResult);
        
        double dividedResult = calculator.divide(10, 2);
        System.out.println("10 / 2 = " + dividedResult);
    }
}
