package com.interfaces;

//relationship between 2 classes

/**
 * 1 .interfaces are created with keyword interface
 * 2. they are by default abstract ( no keyword needed)
 * 3. interfaces have only abstract methods => they do not have implementations
 * 4. interfaces can ahve only static constatnt fields
 * 5. cannot instantiate the interface
 * 6. interfaces are implemeneted by other classes
 * 7. More than 6 methods, make it public
 *
 *
 */
public interface Payment {
    public void pay();
//    default void sendMessage(){
//        System.out.println("default implementation");
//    }

}

interface Notification{
    void sendMessage();
}