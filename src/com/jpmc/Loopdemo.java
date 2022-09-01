package com.jpmc;

import java.util.Scanner;

public class Loopdemo {

    public static void main(String[] args) {
        /**
         * for
         * while
         * do-while
         * take 5 numbers as input and print the sum of the 5 numbers
         */
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        for (int i = 1; i <=5 ; i++) {
//            System.out.print("enter value "+i+" ");
//            int no = sc.nextInt();
//            sum += no; // sum = sum + no
//        }
//        System.out.println(sum);
        for(int k=1; k <= 10; k++) {

            for (int i = 1; i <= 10; i++) {
                System.out.print(k * i + "  ");
            }
            System.out.println();

        }

        int j = 1;
        while (j <=10) {
            System.out.println(19*j);
            j++;
        }

        int s = 1;
        do{
            System.out.println(19*s);
            s++;
        } while(s <=10);

    }
}
