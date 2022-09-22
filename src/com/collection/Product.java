package com.collection;

// product objects must be compreable to each other
import java.io.Serializable;

public class Product implements Comparable<Product>, Serializable {
    private Integer pid;
    private String prodname;
    private Double price;

    public Product(Integer pid, String prodname, Double price) {
        this.pid = pid;
        this.prodname = prodname;
        this.price = price;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProdname() {
        return prodname;
    }

    public void setProdname(String prodname) {
        this.prodname = prodname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", prodname='" + prodname + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getPid().compareTo(o.getPid());
    }


}
