package com.Class26;

import java.util.ArrayList;

public class Homework3 {

/*  Create an arrayList of words. Remove every word that ends with “e”. */

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("bed");
        words.add("sofa");
        words.add("chair");
        words.add("table");
        words.add("desk");

        for (int i = 0; i < words.size(); i=i+1){
             if(words.get(i).endsWith("e")){
             words.remove(i);
            }
        }

        System.out.println(words);
    }
}
