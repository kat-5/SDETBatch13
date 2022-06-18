package com.syntax.class17;

public class TeacherClass {

    public static void mail(String[] args){
        Teacher teacher=new Teacher();
        teacher.name="Zombie";
        teacher.schoolName="Marvard";
        teacher.printInfo();

        /*Because printInfo is public we can call it in other classes and
        because its the part of Teacher Class it can access the private fields
        in turn let us access those fields
         */
        teacher.printInfo();

    }
}
