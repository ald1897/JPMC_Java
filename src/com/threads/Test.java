package com.threads;

public class Test {
    /**
     * main starts main thread
     * main ends main thread
     * T1 starts processsing
     * T1 : 1
     * T1 : 2
     * T1 : 3
     */
    public static void main(String[] args) throws InterruptedException {
        // the thread thats by default running is the main thread
        // main => parent thread
        System.out.println(Thread.currentThread().getName()+" starts main thread");
        MyThread t1 = new MyThread();
        t1.setName("T1");
        t1.setPriority(Thread.MIN_PRIORITY);
        // should call start()

        MyThread t2 = new MyThread();
        t2.setName("T2");
        // should call start()
        t2.setPriority(Thread.MAX_PRIORITY);
        MyRunnableThread  r1 = new MyRunnableThread();
        Thread t3 = new Thread(r1);
        t3.setName("T3");

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        System.out.println(Thread.currentThread().getName()+" ends main thread");
    }
}
