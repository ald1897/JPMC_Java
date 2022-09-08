package com.packages.p2;
import com.packages.p1.A;

public class D extends A {

        public void display() {
            System.out.println(pro);
            System.out.println(pub);
            //Wont work outside package
//          System.out.println(def)
            //wont work outside original class
//          System.out.println(pri);
        }
}
