package com.syntax.Class21;

public class Three {
      //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private static void lucas(){

        System.out.println("nana");
    }
    private static void lucas(int n){

        System.out.println("n");
    }
    private static void lucas(String s){
        System.out.println("s");
    }

    public static void main(String [] args){
        lucas();
        lucas(4);
        lucas("blue");
    }
}
