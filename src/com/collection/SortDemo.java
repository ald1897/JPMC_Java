package com.collection;

import com.packages.p1.C;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("Alex","Jen","Ella","Theo");
//        System.out.println(names);
//        //sorts in ascending order
//        Collections.sort(names);
//        System.out.println(names);
//        Collections.sort(names, new StringDesc()) ;
//        System.out.println(names);
//        Collections.reverse(names) ;
//        System.out.println(names);

        List<Product> products = Arrays.asList(
                new Product(1,"pencil",20.00),
                new Product(2,"mouse",20.00),
                new Product(3,"keyboard",25.00),
                new Product(4,"desk",233.00),
                new Product(5,"cup",2.00));
        for(Product p : products) {
            System.out.println(p);
        }
//        Collections.sort(products, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getProdname().compareTo(o2.getProdname());
//            }
//        });
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        });
        Collections.reverse(products);
        System.out.println();

        for(Product p : products) {
            System.out.println(p);
        }



    }
}

class StringDesc implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}