package com.syntax.class16;

public class Student {
 /*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/

    String Name2;
    int ID;
    static int numStudents=0;


    public static void main(String[] args) {
        com.syntax.class16.Student stu1=new com.syntax.class16.Student();
        stu1.Name2="Oscar";
        stu1.ID=9029;
        stu1.numStudents=1;
        System.out.println(stu1.Name2);
        System.out.println(stu1.ID);
        System.out.println(stu1.numStudents);

        System.out.println();

        com.syntax.class16.Student stu2=new com.syntax.class16.Student();
        stu2.Name2="Lisa";
        stu2.ID=7893;
        stu2.numStudents=2;
        System.out.println(stu2.Name2);
        System.out.println(stu2.ID);
        System.out.println(stu2.numStudents);

        com.syntax.class16.Student stu3=new com.syntax.class16.Student();
        stu3.Name2="Cherry";
        stu3.ID=5674;
        stu3.numStudents=3;
        System.out.println(stu3.Name2);
        System.out.println(stu3.ID);
        System.out.println(stu3.numStudents);
    }

}

