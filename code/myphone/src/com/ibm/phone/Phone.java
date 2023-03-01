package com.ibm.phone;

public class Phone {
    //属性
    String brand;
    double price;

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void call(){
        System.out.println("打电话");
    }
    public void playGame(){
        System.out.println("打游戏");
    }

    public String toString() {
        return "Phone{brand = " + brand + ", price = " + price + "}";
    }
}
