package com.syntax.Class20;

public class GrandParent {

    String name="Anyatula";
}

class Parent extends GrandParent{

    void printInfo(){

        System.out.println("Name of my father is "+name);
    }
}

class Child extends Parent{

    void printInfo(){
        System.out.println("Name of my Grandpa is "+name);

    }
}

class GrandChild extends Child{


}