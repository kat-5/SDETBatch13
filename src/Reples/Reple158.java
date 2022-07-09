package Reples;

public class Reple158 {


    public static void main(String[] args) {
        Child child=new Child("Fairfax");
        child.display();

    }
}

class Parent {
    String city;
    Parent(String city) {
        this.city = city;
    }
    public void display(){
        System.out.println("City name " + this.city);

        }
    }


class Child extends Parent{

    Child(String city){
        super(city);


    }
}