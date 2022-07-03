package com.Homework.Class25;

public class Vehicle {

    /*Create a Class Vehicle that would have the following fields: vehiclePrice and method calculateSalePrice()
     which should be returning a price of the Vehicle.

Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of
calculateSalePrice() method in which returned price calculated as following: if weight>2000 then returned price car
should include 10% discount, otherwise 20% discount.


The Sedan class has field as length and also does it is own implementation of calculateSalePrice(): if length of
sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */

    double vehiclePrice;

    void calculateSalePrice(){
        System.out.println("The vehicle price is "+vehiclePrice);

    }
}
class Truck extends Vehicle {
    void calculateSalePrice(double weigth) {
        if (weigth > 2000) {
            System.out.println(vehiclePrice * .90);
        } else {
            System.out.println(vehiclePrice * .80);
        }
    }
}

class Sedan extends Vehicle {

    void calculateSalePrice(double length) {
        if (length > 20) {
            System.out.println(vehiclePrice * .95);
        } else {
            System.out.println(vehiclePrice * .90);
        }
    }
}