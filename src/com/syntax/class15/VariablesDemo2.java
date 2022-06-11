package com.syntax.class15;

public class VariablesDemo2 {

    int num=10; //instance
    /* whenever you have to share some info in more
    than one method of a class use instance variables
     */

    void method(){
        System.out.println(num);
    }
    void method2(){
        System.out.println(num);

    }
}
