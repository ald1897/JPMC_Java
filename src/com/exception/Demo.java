package com.exception;

public class Demo {

    public static double calculate(int no) throws Exception {
        if (no <= 0){
            //unchecked exception
            //throw new RuntimeException("no cannot be negative");
            //checked exception

            throw new Exception("no cannot be -ve");

        }
        return Math.sqrt(no);
    }
    public static void main(String[] args) throws Exception {
        // errors => out of memory error, stack overflow error
            // exception =>
        /**
         * educational website or app
         * 1. math
         * 2. english
         * 3. logic building
         * 4. history
         *
         */
        System.out.println(calculate(10));
        System.out.println(calculate(-12));
        System.out.println("main begins");

        int a = 12, b = 0;
        int arr[] = {1,2,3,4,5};
        String errmsg = "";
        String s = null;

        try {
            System.out.println(a/b);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by 0");
        }

        try{
            for(int i=0;i<arr.length; i++) {
                System.out.println(arr[i]);
                System.out.println(arr[2]);
                System.out.println(s.toLowerCase());
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array is out of range ");
            errmsg = "\nArray out of range";
        }
        catch(Exception e){
            System.out.println("string cannot be null");
            System.exit(0);
        }
        System.out.println(errmsg);
        System.out.println("main ends");
    }
}
