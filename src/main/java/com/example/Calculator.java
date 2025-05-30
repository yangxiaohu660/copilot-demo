package com.example;

/**
 * A simple calculator class with basic operations.
 */
public class Calculator {

    /**
     * Adds two integers and returns the result.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Handles two integers and returns the result.
     * This method is a generic handler for two numbers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the result of handling a and b
     */
    public int handle(int a, int b) {
        // Since the specific operation is not defined in the requirements,
        // we'll implement a simple operation (for example, multiplication)
        return a * b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        System.out.println("3 + 5 = " + result);
        
        int handleResult = calculator.handle(4, 5);
        System.out.println("handle(4, 5) = " + handleResult);
    }
}
