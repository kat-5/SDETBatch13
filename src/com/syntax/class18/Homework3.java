package com.syntax.class18;

public class Homework3 {

    //Create a method that will accept a String as a parameter and return a
    // new String that consist only of vowels. Method should be available
    // inside the class only where it was declared and executed by calling it is name.

    public static void star(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
                    s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I'
                    || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                System.out.print(s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Homework3 lost = new Homework3();
        lost.star("Lucifer");

    }

    //Asghar way private only accesible inside that class

    private static String getVowels(String input){

        return input.replaceAll("[^aeiou]","");

    }

    //public static void main(String[] args){
        //System.out.println(getVowels("Emre");
    // }
}