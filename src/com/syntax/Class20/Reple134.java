package com.syntax.Class20;

public class Reple134 {

        String s;

        public static int countVowels(String s) {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                    count++;
                }

            }
            return count;
        }

        //test case below (dont change):
        public static void main(String[] args){
            System.out.println(countVowels("obama")); //3
            System.out.println(countVowels("happy friday! i love weekends")); //9
        }
}
