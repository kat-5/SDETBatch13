package com.syntax.class18;

public class reple118CreateSpacesString {

    public static String spaceOut(String x) {
        for (int i = 0; i < x.length(); i++) {
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.print(spaceOut("hello").replace("", " "));
        System.out.println();
        System.out.print(spaceOut("technology").replace("", " "));
    }
}