package com.interfaces;

public class Neft implements Payment, Notification{
    @Override
    public void pay() {
        System.out.println("Neft payment logic");
    }

    public void sendMessage() {
        System.out.println("send Neft message");
    }

}
