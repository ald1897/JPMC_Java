package com.assignment;

public class Distance {
    private int distance;

    public Distance(int distance) {
        this.distance = distance;
    }

    public double toMeters(){
        return this.distance*1000;
    }

    public double toFeet(){
        return this.distance*3280.839895;
    }

    @Override
    public String toString() {
        return "Distance{" +
                "distance=" + distance +
                " toMeters=" + this.toMeters() +
                " toFeet=" + this.toFeet() +
                '}';
    }
}
