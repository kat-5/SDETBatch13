package com.syntax.class18;

public class Homework6 {

    //Write a java class that have 4 constructors with 4 different access
    // levels of constructors(private,public,default,protected) and create
    // 4 objects of this class:
    // 1 - inside same class; 2 - from outside the class;
    // 3 - from different class inside different package  and observe result.
    String professor;
    int numStudents;

    void HomeworkVo() {
    }
    public void HomeworkPu() {
    }
    private void HomeworkPri() {
    }
    protected void HomeworkPro() {
    }

    public static void main(String[] args) {

        Homework6 stu1=new Homework6();
        stu1.numStudents=1;
        Homework6 stu2=new Homework6();
        stu1.numStudents=2;
        Homework6 stu3=new Homework6();
        stu1.numStudents=3;
        Homework6 stu4=new Homework6();
        stu1.numStudents=4;

        System.out.println(stu1.numStudents);
    }

}


