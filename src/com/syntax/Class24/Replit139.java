package com.syntax.Class24;

class Replit139 {
    public static void main(String[] args) {
        Car car=new Car("Toyota" ,"Prius", 4 ,120 ,30000.0);
        car.Display();
        Car car2=new Car("Toyota" ,"Prius",120 ,30000.0);
        car2.Display();
        Car car3=new Car(4,120 ,30000.0);
        car3.Display();
        Car car4=new Car("Toyota" ,"Prius", 4 );
        car4.Display();
    }

}
    class Car{

        String make;
        String model;
        int numberOfDoors;
        int topSpeed;
        double price;

        Car(String make,String model,int numberOfDoors,int topSpeed,double price){
            this.make=make;
            this.model=model;
            this.topSpeed=topSpeed;
            this.price=price;
            this.numberOfDoors=numberOfDoors;


        }
        Car(String make,String model,int topSpeed,double price){
            this.make=make;
            this.model=model;
            this.topSpeed=topSpeed;
            this.price=price;
            this.numberOfDoors=4;
        }

        Car(int numberOfDoors,int topSpeed,double price){
            this.make="uknown";
            this.model="uknown";
            this.topSpeed=topSpeed;
            this.price=price;
            this.numberOfDoors=numberOfDoors;

        }

        Car(String make,String model,int numberOfDoors){
            this.topSpeed=90;
            this.price=0;
            this.make=make;
            this.model=model;
            this.numberOfDoors=numberOfDoors;
        }
        void Display(){
            System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
        }


    }

