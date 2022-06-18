package com.syntax.class18;

public class Homework8 {

    //Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize
    // those variables. Print name & address of given  student using displayInfo method.
    String name;
    String address;
    void student(String x, String y){
       x=name;
       y=address;

    }
    public void displayInfo() {

        System.out.println(name+" lives at "+address);
    }
    public static void main(String[] args) {

        Homework8 ex=new Homework8();
        ex.name="Roy";
        ex.address="123 Manson Pl";
        ex.displayInfo();
    }
    }


