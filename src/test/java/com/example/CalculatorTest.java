package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(3, 5));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-2, calculator.add(-5, 3));
    }
    
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.multiply(3, 5));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-15, calculator.multiply(-3, 5));
        assertEquals(15, calculator.multiply(-3, -5));
    }
}