package com.test;

import com.packages.p1.C;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class CalcTest {
    Calculator calc = new Calculator();
    int expected;
    @BeforeEach
    public void beforeEach () {
        System.out.println("before each");
//        calc = new Calculator();
        expected = 10;
    }
//
//    @Test
//    public void testAddReturnsValue () {
////        Calculator calc = new Calculator();
////        int expected = 10;
//        int actual = calc.add(5,5);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testMinusReturnsValue () {
////        Calculator calc = new Calculator();
////        int expected = 0;
//        int actual = calc.minus(15,5);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testMultiplyReturnsValue () {
////        Calculator calc = new Calculator();
////        int expected = 25;
//        int actual = calc.multiply(2,5);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testDivideReturnsValue () {
////        Calculator calc = new Calculator();
////        int expected = 1;
//        int actual = calc.divide(100,10);
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void testPowerReturnsValue () {
////        Calculator calc = new Calculator();
////        int expected = 3125;
//        int actual = calc.power(10,1);
//        Assertions.assertEquals(expected, actual);
//    }
    @Test
    public void testMinusDurationTime() {
        assertTimeout(Duration.ofMillis(1800), () -> calc.minus(3,2));

    }

//    @AfterEach
//    public void afterEach() {
//        calc = null;
//    }
}
