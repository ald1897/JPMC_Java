package com.test1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    Calculator calculator;
    int expected;
    @BeforeEach
    public void beforeEach()
    {
        calculator = new Calculator();
        expected = 10;
    }
    @Test
    public void testAddReturnsValue()
    {
        int actual = calculator.add(5,5);
        assertEquals(expected, actual);
    }
    @Test
    public void testSubReturnsPosValue()
    {
        int actual = calculator.sub(15,5);
        assertEquals(expected, actual);
    }
    @Test
    public void testSubReturnsNegValue()
    {
        expected = -10;
        int actual = calculator.sub(5,15);
        assertEquals(expected, actual);
    }
    @Test
    public void testSubResponseWithinTime()
    {
        assertTimeout(Duration.ofMillis(1500), ()-> calculator.sub(3,2));
    }
    @Test
    public void testSqrtThrowsException()
    {
        assertThrows(Exception.class, ()-> calculator.sqrt(-3));
    }
    @AfterEach
    public void aftereach()
    {
        calculator = null;
    }
}
