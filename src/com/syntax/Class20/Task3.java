package com.syntax.Class20;

public class Task3 {

    //Write a Java program called Teacher.  Identify features and behaviour of that Class.
    // Create 3 subclasses MathTeacher,
    // ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    // Test all 4 classes

public static void main(String [] args){
    ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
    chemistryTeacher.name="Adem";
    chemistryTeacher.favoriteChemSubject="Organic";
    chemistryTeacher.teachesChem();
}
}

class Teacher{
    String name;
    String typeofTeacher;
   public void teach(){
        System.out.println(name+" Teaches "+typeofTeacher);
    }
}

class MathTeacher extends Teacher{
    String favoriteMathSubject;
    public void teachesMath(){
        System.out.println(name+" "+"Teaches Math and his favorite math subject is "+favoriteMathSubject);

    }
}

class ChemistryTeacher extends Teacher{
    String favoriteChemSubject;
    public void teachesChem(){
        System.out.println(name+" "+"Teaches Math and his favorite Chemistry subject is "+favoriteChemSubject);


    }
}

class PianoTeacher extends Teacher {
    String favoritePianoModel;

    public void teachesPiano() {
        System.out.println(name + " " + "Teaches Math and his favorite piano model is " + favoritePianoModel);


    }
}
