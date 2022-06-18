package com.syntax.class18;

public class Reple119 {
    public static String censorLetter(String x){
        for (int i = 0; i < x.length(); i++) {
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.print(censorLetter("computer science").replace("e", "*"));
        System.out.println();
        System.out.print(censorLetter("trick or treat").replace("t", "*"));
    }
}



