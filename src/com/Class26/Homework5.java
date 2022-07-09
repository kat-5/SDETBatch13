package com.Class26;
import java.util.ArrayList;

public class Homework5 {
    /*
    Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList.
     */
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<500 ;i++){
            if(i%2==0);
            numbers.add(i);
        }

    for (int i=0;i< numbers.size();i++) {
        if (numbers.get(i) % 5 == 0) {
            numbers.remove(i);
        }
    }
        System.out.println(numbers);
    }
}

