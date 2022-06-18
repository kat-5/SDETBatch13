package com.syntax.class16;

public class StaticDemo {

    static int noOfEmployees=10;
    String name;

    static void method1(){
        System.out.println(noOfEmployees);


    }

    void method2(){
        System.out.println(noOfEmployees); // because each object will be having a separate copy of this variable
        // java gets confused like abdulsamad which value to print
        System.out.println(name);
    }

    public static void main(String[] args)  {
        StaticDemo st=new StaticDemo();
        st.name="omid";
        System.out.println(st.name);

        StaticDemo st2=new StaticDemo();
        st2.name="rachid";

    }

}
