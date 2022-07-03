package com.syntax.Class20;

public class Reple131 {
    String s;
    public static String thirdLetter(String s){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i+=3){
            if (i< s.length())
                result.append(s.charAt(i));
        }
        return result.toString();


    }


    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}