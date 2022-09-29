package com.test;

import org.junit.jupiter.api.*;

public class Test1 {

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each");

    }
    @AfterEach
    public void afterEach() {
        System.out.println("After Each");

    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");

    }
    @AfterAll
    public static void afterAll() {
        System.out.println("After All");

    }

    @Test
    public void test1() {
        System.out.println("Test1");
        Assertions.assertEquals(10,10);


    }
    @Test
    public void test2() {
        System.out.println("Test2");
        Assertions.assertEquals(10,10);


    }
}
