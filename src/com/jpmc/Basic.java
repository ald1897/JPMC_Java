package com.jpmc;

public class Basic {
    public static void main(String[] args) {
        /**
         * 8 standard/primitive/basic data types
         * byte - 1 byte
         * char - 2 bytes store a single character[alphabets, numbers, symbols...]
         * ''
         * To store integers
         * short - 2 bytes  -32768 to 32767, 0 to 65536
         * int - 4 bytes -2147483648 to 2147483648
         * long  - 8 bytes
         * To store decimal values
         * float - 4 bytes, precision
         * double - 8 bytes, precision
         * boolean - true or false
         * String = sequence of alphanumeric characters ""
         */
        /**
        variables - store data and the data can vary
         1. can start with alphabet[lower or upper], _ or $
         2. cannot start with number or any other special symbol
         3. it can contain alphabets, number, _ $
         4. it cannot contain even spaces
         */
        // create a variable with the name as age to store integer values
        short age; // variable declaration
        age = 10;// initialization
        System.out.println(age);
        // create a variable with the name as price to store decimal values
        double amount=12567.4567;
        double discount=0.13;
        double price = amount - discount * amount ;
        //price = amount - discount * amount; // expression
        System.out.println(amount - discount * amount);
        System.out.println(String.format("%.2f",price));
    }
}
