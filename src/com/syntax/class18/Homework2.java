package com.syntax.class18;

public class Homework2 {
    //Create a method that will take a String as a parameter and returns
    // reversed String.
    // Method should be available to all classes within your project and \
    // accessible by class name.

    public static void Rever (String str) {

        String nstr="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks");

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.println("Reversed word: "+ nstr);
    }

    public static void main(String[] args){

        Homework2 lol= new Homework2();
        lol.Rever("Greeks");
    }

    //Asghar way with method chaining

    public static String reverseString(String strs) {
        return new StringBuilder(strs).reverse().toString();
    }

    //public static void main (String[] args){
       // System.out.println(Task2.reverseString("Monday"));
       // }

}
