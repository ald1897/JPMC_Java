package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetProductDemo {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
//        products.add(new Product(1,"a",1.00));

        Product p1 = new Product(1,"pencil", 1.00);
        Product p2 = p1;

        products.add(p1);
        p1.setPrice(10.00);
        System.out.println(p1);
        System.out.println(p2);
        products.add( new Product(2,"b",2.00));
//        products.add(new Product(2,"a",1.00));
        products.add(p2);
        System.out.println(products.size());



    }
}
