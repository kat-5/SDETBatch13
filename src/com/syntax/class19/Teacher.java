package com.syntax.class19;
public class Teacher {
     //Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
    // ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
    String name;
    String gender;
    String topic;

    void printInfo() {
        System.out.println("Name " + name + " Gender " + gender + " Topic " + topic);
    }
}
    class MathTeacher extends Teacher{
       MathTeacher(String name,String gender, String topic){
           this.name=name;
           this.gender=gender;
           this.topic=gender;
       }
    }

    class ChemistryTeacher extends Teacher{
        ChemistryTeacher(String name,String gender, String topic){
            this.name=name;
            this.gender=gender;
            this.topic=gender;
        }

    }

    class PianoTeacher extends Teacher{
            PianoTeacher(String name,String gender, String topic){
            this.name=name;
            this.gender=gender;
            this.topic=topic;
        }

    }






