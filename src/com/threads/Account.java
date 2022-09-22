package com.threads;

public class Account {
    private int accno;
    private  double balance;

    public Account(int accno, double balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    // amt < balance
    // T1 on instance a1
    // T2 on instance a1
    // T3 on instance a2
    public synchronized void withdraw(double amt) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" in withdraw");
        double bal = getBalance();
        if(amt < bal)
        {
            System.out.println(Thread.currentThread().getName()+" balance "+bal);
            bal = bal - amt;
            Thread.sleep(500);
            balance = bal;
        }
        else
            System.out.println("cannot withdraw");
        System.out.println(Thread.currentThread().getName()+" in withdraw ends" );
    }
    public void deposit(double amt) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" in deposit");
        double bal = getBalance();
        bal = bal + amt;
        Thread.sleep(500);
        balance = bal;
        System.out.println(Thread.currentThread().getName()+" in deposit ends");

    }
}
