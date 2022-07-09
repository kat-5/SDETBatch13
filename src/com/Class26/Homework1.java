package com.Class26;

import java.util.ArrayList;

public class Homework1 {
    public static void main(String[] args) {


    /*
    Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */

        ArrayList<String> names = new ArrayList<>();
        names.add("Carl");
        names.add("Lyle");
        names.add("Laura");
        names.add("Nikki");
        names.add("Mel");
        System.out.println("Array list is empty ="+names.isEmpty());
        System.out.println("Array list contains Nikki ="+names.contains("Nikki"));
        System.out.println("Array list size = "+names.size());
        System.out.println(names);

        }
    }


