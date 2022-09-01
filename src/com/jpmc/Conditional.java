package com.jpmc;

import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        /**
         * if-else
         * switch-case
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age ");
        int age = sc.nextInt();
        if(age>=18)
            System.out.println("can vote");
        else
            System.out.println("cannot vote");
        System.out.print("enter amount on the bill");
        double amount = sc.nextDouble();
        double discamt = 0.0;
        if(amount <= 1000)
            discamt = 0.0;
        else if(amount >1000 && amount <=5000)
            discamt = 0.05;
        else if(amount >5000 && amount <=10000)
            discamt = 0.10;
        else //if(amount >10000)
            discamt = 0.20;
        double totalamount = amount - amount * discamt;
        System.out.println(totalamount);
        sc.nextLine();
        System.out.print("enter name");
        String name = sc.nextLine();
        System.out.println("Welcome "+name);

        /**
         * roll a dice 1 to 6
         * list of states, cities, countries
         */
        System.out.print("enter dice value");
        int dice = sc.nextInt(); // 1 to 6
//        if(dice==1)
//            System.out.println("Move 1 step");
        // exact equality comparison ==
        switch (dice){
            case 1: // dice==1
                System.out.println("Move 1 step");
                break;
            case 2:
                System.out.println("Move 2 step");
                break;
            case 3:
                System.out.println("Move 3 step");
                break;
            case 4:
                System.out.println("Move 4 step");
                break;
            case 5:
                System.out.println("Move 5 step");
                break;
            case 6:
                System.out.println("Move 6 step");
                break;
            default:
                System.out.println("roll again");
        }

        char ch ='a';
        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("its a vowel");
            default:
                System.out.println("consonant");
                break;
        }


    }
}
