package com.test;

public class Calculator {
    public int add (int a, int b) {
        return a+b;
    }
    public int minus (int a, int b) {

        return a-b;
    }
    public int multiply (int a, int b) {
        return a*b;
    }
    public int divide (int a, int b) {
        return a/b;
    }
    public int power (int a, int b) {
        return (int) Math.pow(a, b);
    }

}