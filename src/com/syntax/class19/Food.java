package com.syntax.class19;
public class Food {
    //Homework1

    // Write program for multilevel inheritance where class C
    // inherits from class B and Class B inherits from Class A.

    //Class A
        String type;
        String name;
        double weight;
        void printInfo() {
            System.out.println("Type "+type+" Name " + name + " weight " + weight);
        }
    }
    //Class B
    class Fruit extends Food {
        Fruit(String type,String name, double weight){
            this.type=type;
            this.name=name;
            this.weight=weight;
        }
        public Fruit() {
        }
    }
//class c
    class Apple extends Fruit {
        Apple(String type,String name, double weight) {
            this.type=type;
            this.name = name;
            this.weight=weight;
        }
    }




