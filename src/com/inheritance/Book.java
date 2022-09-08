package com.inheritance;

import oops.Address;

// inheritance > class ihereits members of the othher classes by using EXTENDS keyword.

// Types of inheritance
// Single = B extends A
// Multilevel = B extends A , C extends B, D extends C, etc.
// Heirarchal = Parent A, B inheriets A, C inheriets A, D inherits A
// Multiple = Parent A and B, C inherits form both
// Hybrid = Parent class A, B and C extends A, Class D extends B and C


public abstract class Book extends Item {
    private String title;

    //Constructor
    public Book() {
        // super is used to call the sopcnrtuctor of the parent class
//        super();
        System.out.println("Book Class deafult constructor");
    }


    public Book(String title) {
        this.title = title;
    }

    public Book(int itemId, double price, String description, String title) {
        super(itemId, price, description);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" + super.toString() + ", title='" + title + '\'' +
                 "}";
    }
}

class Fiction extends Book{
        @Override
        public double calculateSP() {
            return 1.11;
        }

}
