package com.threads;

/**
 * 1. class implements Runnable interface
 * 2. override run()
 * 3. create objet of your class
 * 4. pass this object to thread class constructor
 * 5. start the thread
 */
public class MyRunnableThread  implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" starts");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" ends");
    }
}
