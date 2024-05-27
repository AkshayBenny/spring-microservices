package com.akshay.Quiz.Application;

public class Tyre {
    private String brand;

    public String getTyre(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Tyre brand: " + brand;
    }
}
