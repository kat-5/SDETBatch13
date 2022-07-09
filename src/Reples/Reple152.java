package Reples;

public class Reple152 {
    public static void main(String[] args) {
        Child child=new Child("Vienna");

    }
}


class Parent2 {

    void Parent2(String city) {
        System.out.println(city);

    }

    void Parent() {
        System.out.println("Parent Constructor");
    }
}

    class Child2 extends Parent{
      Child2(String city){
          super(city);

        }
    }



