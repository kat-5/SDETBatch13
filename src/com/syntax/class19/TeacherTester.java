package com.syntax.class19;

public class TeacherTester {

    public static void main(String args[]) {

            MathTeacher math=new MathTeacher("Dina","Female","Math");
            math.printInfo();

            ChemistryTeacher chem=new ChemistryTeacher("Gale","Male","Chemistry");
            chem.printInfo();

            PianoTeacher piano=new PianoTeacher("Gilian","Female","Piano");
            piano.printInfo();
    }
}
