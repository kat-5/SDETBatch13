package Reples;

public class Reple156 {

    public static void main(String[] args) {
        B b=new B();
        b.display();
    }
}

class A{
    int i=10;
    void display(){
        System.out.println(i);
    }
}
class B extends A{
    int i=20;
    void display(){
        System.out.println(this.i);
        System.out.println(super.i);
    }

}
