package com.syntax.class18;

public class Homework1 {
    //Create a method that will accept an array as
    // parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the
    // creating an instance of the class.

    public static void sum(int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum+=arr[i];

        System.out.println("sum of array values : " + sum);
    }
    public static void main(String args[])
    {
        int arr[] = {3, 1, 2, 5, 4};


        sum(arr);

    }
}
