package com.syntax.Class20;

public class Reple133 {

    String s;

    public static int countA(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'A' ) {
                count++;
            }


        }
        return count;
    }

    //test case below (dont change):
    public static void main(String[] args) {
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}


