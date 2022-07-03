package com.syntax.Class21;

public class Info {
    // Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.

    static void info(int i){
        System.out.println(i);

    }
    static void info(int i,String n){
        System.out.println(i+" "+n);

    }

    static void info(int i,String n,int a){
        System.out.println(i+" "+n+" "+a);

    }

    public static void main(String [] args){

            info(2);
            info(2,"haha");
            info(2,"haha",4);
        }
    }

