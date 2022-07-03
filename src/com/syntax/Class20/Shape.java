package com.syntax.Class20;

import static java.lang.Math.PI;

public class Shape {

    /*Write program: Shape class has a constructor that takes the radius and has
    a subclass as  circle class. In circle class create a method to calculate the area
    of circle. Test your code
     */

    double Area;
    double diameter;

    void Radius() {

        double Area =(PI /4*(diameter * diameter));

    System.out.println(Area);
   }

     static class Circle extends Shape{
        Circle(double diameter){
        this.diameter=diameter;

        }
     }

    public static void main(String[] args){
        Circle circle=new Circle( 9);
        circle.Radius();

    }

    }
