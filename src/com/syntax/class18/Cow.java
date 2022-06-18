package com.syntax.class18;

public class Cow {
    String breed;  /// instance variable
    String color;
    int age;
    double weight;

    Cow(String breed, String color, int age, double weight) {
        //When we have same name variables as local and as instance inside a class
//always local variables are preferred over instance variables by java in block of code

        this.breed=breed;  // helps access instance variables with same name as local

        breed = breed;
        color = color;  // local variable
        age = age;
        weight = weight;
    }

    String getCowInfo() {
        return "Breed " + breed + " Color " + color + " Age " + age + " weight" + weight;
    }

}