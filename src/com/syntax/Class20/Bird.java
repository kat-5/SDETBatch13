package com.syntax.Class20;

public class Bird{
    String name;
    String color;
    int age;
    double weight;
    void printInfo(){
        System.out.println("Name "+name+" Color "+color);
    }

    Bird(String name, String color, int age,double weight){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
}

class Parrot extends Bird{
    Parrot(String name, String color, int age,double weight){
       super(name,color,age,weight); //calling the parent class constructor by writing the super();

    }

/*
    void printInfo(){
        System.out.println("Name "+name+"Color"+color);
    } */
}

class Sparrow extends Bird{
    Sparrow(String name, String color, int age,double weight){
        super(name,color,age,weight);
    }
}