package com.inheritance;

import oops.Address;

public class Furniture {
    private int itemId;
    private String title;
    private double price;
    private String description;

    //constructor
    public Furniture(int itemId, String title, double price, String description) {
        this.itemId = itemId;
        this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return "Book{" +
                "itemId=" + itemId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
