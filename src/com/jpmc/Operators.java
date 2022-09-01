package com.jpmc;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        /**
         * 1. unary : ++ -- - ! 1 operand
         * 2. binary : 2 operands
         * Arithmetic + - * / %
         * relational / comparison < > <= >= == !=
         * logical && ||
         * bitwise & | ^ => binary numbers
         * 3. ternary ?: 3 operands
         */
        int a = 10;
        int p = ++a + 2*10; // 11 + 20
        // p = 10 + 11 * 10 + 12/2
        System.out.println(p);
        System.out.println(a);
        /**
         * if an expression consists of same data types , result is of the same data type
         * if an expression consists of mixed data types , result is of the higher data type
         */
        System.out.println(5/2); // quotient
        System.out.println(5.0/2); // quotient
        char x = 'a';
        int y = x; // allowed [lower to higher]
        System.out.println(y);
        double d = 242.634;
        int z = (int)d; // not allowed [higher to lower] - typcasting
        System.out.println(z);
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age ");
        int age = sc.nextInt();
        String res = 2 + age >= 18 ? "can vote": "cannot vote";
        System.out.println(res);

    }
}
