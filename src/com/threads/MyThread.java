package com.threads;
/*
multi-threading
by default is a single threaded application
Create a thread , there are 2 ways
1. using Thread class
    a. your class extends Thread
    b. override the run() => is the place where the task that his thread will do is defined, thread execution starts
    c. create object of your class
    d. start the thread using starts() => it internally calls the run method
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starts processsing");
        if(Thread.currentThread().getName().equals("T1"))
            for (int i = 1; i < 6; i++) {
                System.out.println(Thread.currentThread().getName() + " : "+i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        if(Thread.currentThread().getName().equals("T2"))
            for (char ch='A'; ch<='E';ch++) {
                System.out.println(Thread.currentThread().getName() + " : "+ch);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        System.out.println(Thread.currentThread().getName() + " ends processsing");

    }
}