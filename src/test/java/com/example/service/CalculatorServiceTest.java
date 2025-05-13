package com.example.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    @Test
    public void testAdd() {
        CalculatorService calc = new CalculatorService();
        assertEquals(10, calc.add(5, 5));
    }

    @Test
    public void testSubtract() {
        CalculatorService calc = new CalculatorService();
        assertEquals(2, calc.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        CalculatorService calc = new CalculatorService();
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    public void testDivide(){
        CalculatorService calc = new CalculatorService();
        assertEquals(5, calc.divide(10, 2));
    }

    @Test
    public void testDivideByZero() {
        CalculatorService calc = new CalculatorService();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }
}
