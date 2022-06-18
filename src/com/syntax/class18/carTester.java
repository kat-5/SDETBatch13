package com.syntax.class18;

public class carTester {

    public static void main(String[] args){

        Car car1=new Car("Audi", "Etron","Black");
        car1.printInfo();
        Car car2=new Car("Toyota", "Corolla","white");
        car2.printInfo();

        Car car=new Car("Tesla");
        car.printCarModel();

    }
}
