package com.Class26;
import java.util.ArrayList;

public class Homework2 {
    /*
    Create an arraylist of cars and retrieve all the values using 3 different ways. */
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Kia");
        cars.add("Tesla");
        cars.add("Toyota");
        cars.add("VW");
        System.out.println("=================================");
        System.out.println(cars.get(0));
        System.out.println(cars.get(1));
        System.out.println(cars.get(2));
        System.out.println(cars.get(3));
        System.out.println("=================================");
        System.out.println(cars);
        System.out.println("=================================");
        for (int i = 0; i < 5; i=i+1){
            System.out.println(cars.get(i));

        }
    }
}