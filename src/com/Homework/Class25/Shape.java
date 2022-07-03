package com.Homework.Class25;

public interface Shape {
    /*Create an Interface 'Shape' with undefined methods as calculateArea and
     calculatePerimiter. Create 2 classes Circle & Square that implements
     functionality defined in the Shape Interface. Test your code.
     */

    void calculateArea();
    void calculatePerimeter();

}

class Circle implements Shape {

    @Override
    public void calculateArea() {
        System.out.println("Circle area");
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Cicle perimeter");
    }


}
    class Square implements Shape{
        @Override
        public void calculateArea(){
            System.out.println("This calculates the area of the square");
    }

        @Override

        public void calculatePerimeter() {
            System.out.println("This calculates the perimeter of the square");
        }


    }


    class Test {
        public static void main(String[] args) {
            Shape circle = new Circle();
            circle.calculateArea();
            circle.calculatePerimeter();
            Shape square = new Square();
            square.calculateArea();
            square.calculatePerimeter();

        }
    }

