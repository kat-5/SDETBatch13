package com.syntax.class16;

public class AccessModifiersDemo {
    //privateString password="pass123";
    int ssn=123456;
    public String name="Bilal";

    public static void main(String[] args){
        AccessModifiersDemo ac=new  AccessModifiersDemo();
       // System.out.println(ac.password);
        System.out.println(ac.ssn);
        System.out.println(ac.name);

    }
}
