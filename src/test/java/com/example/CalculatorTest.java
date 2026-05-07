package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(4, 3));
        assertEquals(7, calculator.subtract(4, -3));
        assertEquals(-1, calculator.subtract(-4, -3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(2, 0));
        assertEquals(0, calculator.multiply(0, 3));
        assertEquals(-6, calculator.multiply(2, -3));
        assertEquals(6, calculator.multiply(-2, -3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(-2.0, calculator.divide(6, -3));
        assertEquals(2.0, calculator.divide(-6, -3));
        assertEquals(0.0, calculator.divide(0, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(1, 0);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(-5, 0);
        });
    }
}
