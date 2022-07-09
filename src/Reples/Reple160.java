package Reples;

public class Reple160 {

    public static void main(String[] args) {


        Reple rep = new Reple();
        rep.display(100);
        Reple rep2 = new Reple();
        rep.display("Syntax Technologies");
        Reple rep3 = new Reple();
        rep.display(100.09);
    }
}

class Reple{

    void display(){


    }
    void display(int a){
        System.out.println(a);
    }
    void display (String b){
        System.out.println(b);
    }
    void display (double c){
        System.out.println(c);

    }
}