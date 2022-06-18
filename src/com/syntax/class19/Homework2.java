package com.syntax.class19;
public class Homework2  {

    //Write program to inherit class A that has method printF which
    // is static and call or reuse that method into class B

         //Class A
          static String name;
           static String printF() {
                   return name;
            }
    }
        //Class B
        class ClassB {
                public static void main(String[] args) {
                        Homework2.name = "John";
                        String name = Homework2.printF();
                        System.out.println("Student name is : "+name);
                }
        }
