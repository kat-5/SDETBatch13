package com.Class26;
import java.util.ArrayList;

public class Homework4 {

    /* Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. */

    public static void main(String[] args) {

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("soda");
        drinks.add("water");

        for (int i = 0; i < drinks.size(); i = i + 1) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.remove(i);
                drinks.add(i, "water");

            }
        }
        System.out.println(drinks);
    }
}


