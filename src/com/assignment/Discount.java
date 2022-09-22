package com.assignment;

public class Discount {
     int cost;
     String name;
     Double dc;
     Double amt;

    public void input(int cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public void cal(double dc) {
        this.dc = dc;
        this.amt = this.cost- (this.cost*this.dc);

    }

    public void display() {
        System.out.println( "Discount{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", dc=" + dc +
                ", amt=" + amt +
                '}');

    }

    @Override
    public String toString() {
        return "Discount{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", dc=" + dc +
                ", amt=" + amt +
                '}';
    }
}
