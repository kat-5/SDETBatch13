package Reples;

public class Reple159 {
    public static void main(String[] args) {
        Overload over=new Overload(30,10);

    }
}


class Overload{

    Overload(int a,int b,int c,int d){
        System.out.println(a-b-c-d);
    }
    Overload(int a,int b,int c){
        System.out.println(a-b-c);
    }
    Overload(int a,int b){
        System.out.println(a-b);
    }
}