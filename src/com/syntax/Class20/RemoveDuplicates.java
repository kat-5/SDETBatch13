package com.syntax.Class20;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set
                = new LinkedHashSet<Integer>();

        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        System.out.print(set);
    }

    public static void main(String[] args)
    {
        int a[] = {10, 20, 10, 30, 40, 40};

        removeDuplicates(a);
    }

}



/*
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 40, 40};
        arr= removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] removeDuplicates(int[] arr) {
        int[] duplicateElementsArr = new int[arr.length];
        int counter=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicateElementsArr[i] = arr[i];
                    counter++;
                }
            }
        }
        int [] arr2=new int[arr.length-counter];
        int counter2=0;
        for(int e:arr){
            if(!isPresent(e,duplicateElementsArr)){
                arr2[counter2++]=e;
            }
        }

        return arr2;
    }

    static boolean isPresent(int element,int [] arr){

        for(int e:arr){
            if(element==e){
                return true;
            }
        }
        return false;
    }
}
*/
//create array without 0