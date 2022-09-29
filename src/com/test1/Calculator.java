package com.test1;

public class Calculator {

    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int x, int y)
    {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x-y;
    }
    public double sqrt(int n) throws Exception {
        if(n<=0)
            throw new Exception("n cannot be 0 or less that 0");
        return Math.sqrt(n);
    }
}
