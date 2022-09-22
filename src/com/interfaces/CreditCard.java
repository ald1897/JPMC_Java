package com.interfaces;

public class CreditCard implements Payment, Notification{

    @Override
    public void pay() {
        System.out.println("cc payment logic");
    }

    public void sendMessage() {
        System.out.println("send CC message");
    }
}
