package com.syntax.class16;

public class Tester {

    public static void main(String []args) {
        AccessModifiersDemo ac=new  AccessModifiersDemo();
        //System.out.println(ac.password); //cant access because is private
        System.out.println(ac.ssn);
        System.out.println(ac.name);
    }
}
