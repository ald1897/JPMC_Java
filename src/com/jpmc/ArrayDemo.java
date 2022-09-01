package com.jpmc;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        /**
         * 1. it is used to store more than 1 value of same data type
         * 2. it uses the syntax of []
         * 3. to access any element we use index and they are only integers
         * 4. index always starts at 0
         * 5. bag [2 pounds]
         */
//
//        System.out.println();
//        System.out.println("Square of values in array");
//        for (int i=0; i<x.length;i++) {
//            System.out.println((x[i]+" : " +x[i]*x[i]));
//        }

        /*
 /*
        take size n of array as input form the user.
        initialize the array with user input values => cost of n items
        print the total i have to pay for the items purchased
        for every 3rd item in the array, giving a discount of 10%
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many items:");
        int n = sc.nextInt();
        int cost[] = new int[n];
        for(int i = 0; i < cost.length; i++) {
            System.out.println("Enter Cost of item " +(i+1));
            cost[i] = sc.nextInt();

        }

        double total = 0.0;
        int k = 1;
        for (int i = 0; i < cost.length; i++) {
            double disc = 0.0;
            if (k % 3 == 0) {
                disc = cost[i] * 0.1;
            }
            total += (cost[i] - disc);
            System.out.println(total);
            k++;
        }
        System.out.println(total);
    }
}
