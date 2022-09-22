package com.threads;

public class TestAccount {

    public static void main(String[] args) throws InterruptedException {
        Account a1 = new Account(1, 5000);
        Account a2 = new Account(2, 5000);
        AccountThread t1 = new AccountThread("T1", a1);
        AccountThread t2 = new AccountThread("T2", a1);
        AccountThread t3 = new AccountThread("T3", a2);
        t1.start();
        t2.start();
       // t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
    }
}
