package com.syntax.Class23;

public class Animal {
//public final class Animal { when we use final keyword with a class no other class can inheret from it

    Animal() {
        System.out.println("All the animal eat");
    }

    //class Panda extends Animal{
    void eat() {
        //final void eat()  same with method
        System.out.println("all the animal eat");

    }
}

  class Panda extends Animal {
        void eat() {
            System.out.println("Parent");
        }

        Panda() {
            System.out.println("Child");

        }
    }


class Tester {
        public static void main(String[] args) {
            new Panda();

        }
    }
