package com.syntax.class18;

public class Car {
// constructors have to have different number of parameters.
    private String make;
    private String model;
    private String color;

    public Car(){

    }
    public Car(String carMake, String carModel,String carColor){

       make=carMake;
       model=carModel;
       color=carColor;
    }

    public Car(String carModel) {
        model=carModel;
    }

        void printCarModel () {
            System.out.println("Model " + model);
    }


    void printInfo(){

        System.out.println("CarMake"+make+" Model "+model+" Color "+color);

//it is not allowed to have two constructors in a class with same number
// of parameters and same type
    }
}
