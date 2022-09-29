package com.test1;

import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    public static void beforeALl(){
        System.out.println("before all");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("before each");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("after each");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }
    @Test
    public void test1()
    {
        System.out.println("test 1");
        Assertions.assertEquals(10,10);
    }
    @Test
    public void test2()
    {
        System.out.println("test 2");
        Assertions.assertEquals(10,12);
    }
}
