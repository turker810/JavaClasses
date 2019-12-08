package com.class28_Super_Keyword;

// Create a Class Car that would have the following fields: 
// carPrice and color and method calculateSalePrice() which should be returning a price of the car.
// Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation 
// of  calculateSalePrice() method in which returned price calculated as following: 
// if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
// The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
// if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount



public class Car {
    double carPrice;
    String color;
    
    Car(double carPrice, String color){
        this.carPrice = carPrice;
        this.color = color;
    }
    public double calculateSalePrice() {
        return this.carPrice;
    }
}
class Sedan extends Car{
    int length;
    
    Sedan(int length, double carPrice, String color){
        super(carPrice, color);
        this.length = length;
    }
    public double calculateSalePrice() {
        if (length>20) {
            return super.carPrice * 0.95;
        }
        else {
            return super.carPrice* 0.90;
        }
    }
}
class Truck extends Car{
    int weight;
    
    Truck(int weight, double carPrice, String color){
        super(carPrice, color);
        this.weight = weight;
    }
    public double calculateSalePrice() {
        if(weight>2000) {
            return super.carPrice * 0.9;
        }
        else {
            return super.carPrice * 0.8;
        }
    }
}


