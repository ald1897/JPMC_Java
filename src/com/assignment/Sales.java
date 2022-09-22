package com.assignment;

public class Sales {

    private double price;
    private double commission;
    private double discount;
    private double finalPrice;

    public Sales(double price, double commission, double discount) {
        this.price = price;
        this.commission = commission;
        this.discount = discount;
    }

    public double getCommissionDollars() {
       return this.commission*this.price;
    }

    public double getDiscountDollars() {
        return this.discount*this.price;
    }

    public double getFinalPrice(){
        this.finalPrice = (this.price+this.getCommissionDollars())-this.getDiscountDollars();

        return this.finalPrice;
    }
}
