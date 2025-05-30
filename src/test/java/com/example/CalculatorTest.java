package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.add(3, 5));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-2, calculator.add(-5, 3));
    }
    
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.subtract(10, 4));
        assertEquals(0, calculator.subtract(5, 5));
        assertEquals(-8, calculator.subtract(-5, 3));
        assertEquals(8, calculator.subtract(5, -3));
    }
}