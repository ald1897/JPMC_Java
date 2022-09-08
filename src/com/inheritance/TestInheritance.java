package com.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
//        Item item = new Item();
//        Item item1 = new Item(1,0,"");
//        System.out.println();

//        Book b1 = new Book();
//        Fiction f1 = new Fiction();
        // item is a reference variable of type Item, item is pointing to object of one of its child class
//        Item item = new Book(1,500,"Book descr", "Book Title");
//        display(item);

        Audio audio = new Audio(1,5,"audio", "melody");
        display(audio);


    }

    public static void display(Item item) {
        System.out.println(item);
    }
}
