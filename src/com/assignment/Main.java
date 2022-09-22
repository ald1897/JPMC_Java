package com.assignment;

import java.util.*;

/**
 * X Take input as 6 digit ticket number. Eg : 123454
 * X Then remove the last digit in this case 4 remaining is 12345
 * X This no 12345 if divided by 7 should give the remainder 4 (the last no that we removed).
 * Then compare the remainder with the last digit of the 6 digit ticket no.
 * Display the result if no is valid or not
 * Try for no’s : 147103(should give valid) and 154123 should give invalid
 */


public class Main {
    public static void main(String[] args) {
//        // Take input and assign ticketNumber var
//        Scanner s1 = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Enter Ticket # (empty will stop program): ");
//            String ticketNumber = s1.nextLine();
//
//            if(ticketNumber.isEmpty()) {
//                break;
//            }
//
//            // Limit ticketNumber to 6 digits
//            if (ticketNumber.length() == 6) {
//                int ticketInt = Integer.valueOf(ticketNumber);
//                Ticket t1 = new Ticket(ticketInt);
//                //store last digit in its own value
//                t1.setLastDigit();
//                int last = t1.getLastDigit();
//                //Remove last digit from original ticket number
//                t1.removeLast();
//                // get remainder for 5 digit ticket number
//                int rem = t1.getRemainder();
//
//                // if the reaminder matches lastdigit display valid messsage, else error
//                if (rem == last) {
//                    System.out.println("Valid: " + t1);
//
//                } else {
//                    System.out.println("Invalid: " + t1);
//                }
//            }
//        }
        Scanner ss1 = new Scanner(System.in);

//        while (true) {
//            System.out.println("Enter Item Price: ");
//            double price = Double.valueOf(s1.nextLine());
//            System.out.println("Enter Sales Commission %: ");
//            double commission = Double.valueOf(s1.nextLine());
//            System.out.println("Enter Item Discount: ");
//            double discount = Double.valueOf(s1.nextLine());
//
//            Sales sale = new Sales(price, commission, discount);
//
//            System.out.println(sale.getFinalPrice());

//            System.out.println("Distance Between 2 Cities (0 Ends program): ");
//            int distance = Integer.valueOf(s1.nextInt());
//            if(distance == 0) {
//                break;
//            }
//            Distance d1 = new Distance(distance);
//
//            System.out.println(d1);

//            System.out.println("Enter Number (0 Ends program): ");
//            int number = Integer.valueOf(s1.nextInt());
//            System.out.println("Enter Number (0 Ends program): ");
////            int number2 = Integer.valueOf(s1.nextInt());
//        int result = 1;
//        int power = number2;
//
//        while (power != 0) {
//            result = result * number;
//            // power will get reduced after
//            // each multiplication
//            power--;
//
//        }
//        System.out.println(Math.pow(number, number2));
//        System.out.println(result);
//
//
//        boolean bAgain = true;
////        String sAgain = "";
//        int number = 0;
//        int number2 = 0;
//        int sum = 0;
//        do {
////code to be executed / loop body
////update statement
//            System.out.println("Enter Number (0 Ends program): ");
//            number = Integer.valueOf(s1.nextLine());
//            System.out.println("Enter Number (0 Ends program): ");
//            number2 = Integer.valueOf(s1.nextLine());
//            sum = number + number2;
//            System.out.println("Sum of nums: " + sum);
//
//            System.out.println("Go Again? Y/N");
//            String sAgain = s1.nextLine();
//
//            if (sAgain.toLowerCase().equals("y")) {
//                bAgain = true;
//            } else if (sAgain.toLowerCase().equals("n")) {
//                bAgain = false;
//            } else {
//                System.out.println("Invalid Choice");
//            }
//
//        } while (bAgain == true);
//
//        String s = "4.3756";
//        int n = s.indexOf(".");
//        int character = Integer.parseInt(s.substring(0,n));
//        int mantissa = Integer.valueOf(s.substring(n+1));
//
//        System.out.println("S : " + s);
//        System.out.println("n : " + n);
//        System.out.println("characteristic : " + character);
//        System.out.println("Mantissa : " + mantissa);

//        String s1 = "Java is Fun";
//        String s2 = "amytime";
//        System.out.println(s2.replace("m","n"));
//        System.out.println(s1.concat(" ").concat(s2));
//

//
//               for (int i = 1; i <= number; i++) {
//
//                   //if number is divisible by 0
//                   if (number % i ==0) {
//                       System.out.println(i+ " ");
//
//                   }
//               }'

//        Scanner s1 = new Scanner(System.in);
//        //Take input
//        System.out.println("enter phrase: " );
//        //assign input
//        String phrase = s1.nextLine();
//        //parse string into list
//        List<String> chars = Arrays.asList(phrase.split("(?!^)"));
//        System.out.println(chars);
////
//        //parse into maps
////        Map<String, Integer> letters = new HashMap<>();
////        System.out.println(letters);
//        // itereate over the list store the names as keys and the no of occurences as the value
//        for(String letter : chars) {
//            int count = 1;
//
//            if (){
//                count++;
////                System.out.println(letter);
////                letters.put(letter,i);
//            } else {
////                letters.put(letter,i);
//            }
//        }
////        for(String key : letters.keySet()) {
//            System.out.println(key + " : " + letters.get(key));
//        }
//        System.out.println(letters);
//        go through list and count each element



//            Distance d1 = new Distance(distance);

//            System.out.println();


//
//            if(ticketNumber.isEmpty()) {
//                break;
//            }
//
//            // Limit ticketNumber to 6 digits
//            if (ticketNumber.length() == 6) {
//                int ticketInt = Integer.valueOf(ticketNumber);
//                Ticket t1 = new Ticket(ticketInt);
//                //store last digit in its own value
//                t1.setLastDigit();
//                int last = t1.getLastDigit();
//                //Remove last digit from original ticket number
//                t1.removeLast();
//                // get remainder for 5 digit ticket number
//                int rem = t1.getRemainder();
//
//                // if the reaminder matches lastdigit display valid messsage, else error
//                if (rem == last) {
//                    System.out.println("Valid: " + t1);
//
//                } else {
//                    System.out.println("Invalid: " + t1);
//                }
        Scanner s1 = new Scanner(System.in);
        System.out.println("Item Price: ");
        int price = Integer.valueOf(s1.nextLine());
        System.out.println("Customer Name: ");
        String name = s1.nextLine();
        double dc = 0.0;
        Discount d1 = new Discount();

        d1.input(price,name);

        if (price <= 5000) {
            dc = 0.0;
            d1.cal(dc);
        } else if(price <= 10000) {
            dc = .10;
            d1.cal(dc);
        } else if(price <= 15000) {
            dc = 0.15;
            d1.cal(dc);
        } else if (price >= 15000) {
            dc = .20;
            d1.cal(dc);
        }
        System.out.println("Customer Name  |  Cost  |  Discount  |  Amount");

        System.out.println(d1.name + "  |  " + d1.cost + "  |  " + d1.dc + "  |  " + d1.amt);


    }
        }
