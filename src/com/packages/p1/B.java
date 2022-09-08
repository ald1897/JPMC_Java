package com.packages.p1;

public class B {
    public void display(){
        A a1 = new A();
        System.out.println(a1.pro);
        System.out.println(a1.pub);
        System.out.println(a1.def);
        //Private wont work outside original class
//        System.out.println(a1.pri);
    }
}
