package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the Calculator class.
 */
public class CalculatorTest {
    
    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(3, 5));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(-8, 3));
    }
    
    @Test
    public void testHandle() {
        // Since we implemented handle as multiplication
        assertEquals(20, calculator.handle(4, 5));
        assertEquals(0, calculator.handle(0, 5));
        assertEquals(-15, calculator.handle(-3, 5));
        assertEquals(15, calculator.handle(-3, -5));
    }
}