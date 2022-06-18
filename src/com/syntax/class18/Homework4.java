package com.syntax.class18;

public class Homework4 {

    //Write a java class that will have a constructor: one with
    // parameters and second without
    // any parameters. Create a separate Test class where you will
    // execute both of the constructors 1 by 1.


    //Ashars way

    Homework4(){
        System.out.println("Constructor 1");
    }

    Homework4(String name){
        System.out.println("Constructor 2");
    }
    public static void main(String[] args) {

        new Homework4();
        new Homework4("Soma");
    }


    int x;

    public Homework4(int y) {

        x = y;
    }

   // public static void main(String[] args) {
      //  Homework4 myObj = new Homework4(5);
        //System.out.println(myObj.x);
  //  }
}




