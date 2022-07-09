package com.Class26;

import java.util.ArrayList;

public class Demo7 {

    public static void main(String[] args) {

        ArrayList<String> subjects= new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add(1,"Jira");

        System.out.println(subjects.indexOf("Java")); //returns the index of Java which is 2
        System.out.println(subjects.size());// tells us the total number id
        subjects.remove("Git");
        System.out.println("subjects = "+ subjects); //to print out an array or array list
        System.out.println(subjects.contains("Selenium"));

        System.out.println("subjects.get(0)= "+ subjects.get(0));
        System.out.println("subjects = "+ subjects);
        subjects.clear();
        System.out.println("subjects = "+ subjects);
    }
}
