package com.inheritance;
// declares as abstract when the object is ambiguous and can only be applied on a class or method
// if a class is abstract
// 1. object of the class cannot be created
// 2. it may or may not have an avstract method
// 3. But if a class has even 1 abstract method it must declare theh class as abstract too
// 4. the class that inherits the abstract class should provide the implementation of the abstract method or declare itself as abstract

public abstract class Item {
    private int itemId;
    private double price;
    private String description;

    //constructor
    public Item() {
        System.out.println("Item Class default constructor");
    }

    public abstract double calculateSP();

    public Item(int itemId, double price, String description) {
        System.out.println("Item Class params constructor");

        this.itemId = itemId;
        this.price = price;
        this.description = description;
    }

    // getters and setters

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // to string
    @Override
    public String toString() {
        return "itemId=" + itemId +
                ", price=" + price +
                ", description='" + description + '\'';
    }
}
