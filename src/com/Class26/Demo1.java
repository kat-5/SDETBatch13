package com.Class26;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        String name="Aladin";
        String name2="Reza";
        String name3="Ahmed";
       /* int size=10;
        String [] arr=new String[size];*/
        String [] names={"Aladin","Reza","Ahmed"};
        System.out.println(names.length);//3
        names=new String[4];
        names[0]="Aladin";
        names[1]="Reza";
        names[2]="Ahmed";
        names[3]="Zameer";
        System.out.println(names.length);//4
        ArrayList<String> syntaxStudents=new ArrayList<>();
        System.out.println(syntaxStudents.size());//0
        syntaxStudents.add("Riaz");
        System.out.println(syntaxStudents.size());//1
        syntaxStudents.add("karla james bond");
        syntaxStudents.add("Ivan 007");
        System.out.println(syntaxStudents.size());//3
        ArrayList<Integer> number=new ArrayList<>();
        //object datatype of primitive datatype int
        number.add(1);
        for(int i=1;i<10;i=i+2){
            number.add(i);
        }

       System.out.println(number); //[1,3,5,7,9]


    }
}