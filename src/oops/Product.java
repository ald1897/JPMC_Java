package oops;

import org.w3c.dom.ls.LSOutput;

public class Product {
    private int id;
    private String name;
    private double price;
    private String description;

    private double discount;

    //setDetaills - takes params to init the privates

    //calc discount (double discperc) calcs price of item after discount and returns price

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }


    public void setDetails(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public double calcDiscount(double discPercent) {
        this.discount = this.price*(discPercent/100);
        return this.price - this.discount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString(){
        return "Product: " + this.name + " ID: " + this.id + " Price: " + this.price + " Description: " + this.description;
    }
}
