package com.github.alinaivanov96;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple Addition")
    void testAdd() {
        assertEquals(3, calculator.add(1, 2), "Adding 1 and 2");
    }

    @Test
    @DisplayName("Simple Subtraction")
    void testSubtract() {
        assertEquals(2, calculator.subtract(4, 2), "Subtract 2 and 4");
    }

    @Test
    @DisplayName("Simple Division")
    void testDivide() {
        assertEquals(2, calculator.divide(4, 2), "Divide 4 and 2");
    }

    @Test
    @DisplayName("Simple Multiply")
    void testMultiply() {
        assertEquals(8, calculator.multiply(4, 2), "Multiply 4 and 2");
    }

    @Test
    @DisplayName("Division by zero should throw an ArithmeticException")
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }


}//end CalculatorTest()
