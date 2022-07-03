package com.syntax.Class20;

public class Reple130 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);
        // should print out 10 1 30 2 50
    }

    static void mystery(int[] array)	{
        //int[] arrays= new int[arr.length];
        for(int i=0; i<array.length; i++){
            //for(int j = i<arr.length; j++)
            if(array[i]%2==0){

                System.out.print(array[i]/2+" ");

            }
            else if(array[i]%2!=0){
                System.out.print(array[i]*10+" ");

            }
        }

    }
}

