package com.syntax.class18;

public class Homework5 {
    //Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    // Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with
    // different marks. Your program should print an average mark of each students name.
    //NOTE: please use different names for instance and local variables.

    public void Students(String name,int grade1, int grade2, int grade3 ){
        int average;
        average=((grade1+grade2+grade3)/3);

        System.out.println(name+"'s average grade is "+average);
    }

    public static void main(String[] args){
        Homework5 student1=new Homework5();
        student1.Students("Julian",90,80,70);
        Homework5 student2=new Homework5();
        student1.Students("Carlos",60,50,70);
        Homework5 student3=new Homework5();
        student1.Students("Mark",90,90,100);
        Homework5 student4=new Homework5();
        student1.Students("Chris",90,60,80);
        Homework5 student5=new Homework5();
        student1.Students("Duran",90,80,70);

        }
    }

