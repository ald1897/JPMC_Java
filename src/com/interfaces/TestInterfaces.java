package com.interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        Payment obj = new CreditCard();
        obj.pay();


        obj = new Neft();
        obj.pay();

    }
}
