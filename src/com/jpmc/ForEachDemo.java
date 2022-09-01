package com.jpmc;

public class ForEachDemo {
    public static void main(String[] args) {
        String fruits [] = {"apples", "oranges", "peaches", "grapes", "melon"};
        System.out.println(fruits.length);

        for (String fruit:fruits) {
            System.out.println(fruit);
        }
    }

}
