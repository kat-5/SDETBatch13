package com.syntax.class16;

public class Dog {

    String name;    // only can hold one variable
    String color;


    public static void main(String[] args){

        Dog dog1=new Dog(); //creating an object of dog class
        dog1.name="Tommy";
        dog1.color="Pink";

        Dog dog2=new Dog();
        dog2.name="Fido";
        dog1.color="Black";

        Dog dog3=new Dog();
        dog3.name="Jajajaja";
        dog3.color="White";


        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);
    }
}
