package com.syntax.Class23;

public class Student {
    void study() {
        System.out.println("Study");
    }

    void grade() {
        System.out.println("Grade");
    }
}
    class SyntaxStudent extends Student {

        @Override
        void study() {
            System.out.println("Student at Syntax");
        }
        @Override
        void grade() {
            System.out.println("Grade A");
        }

        void batch() {
            System.out.println("This is batch 13");
        }
    }

        class CollegeStudent extends Student {
            @Override
            void study() {
                System.out.println("Student at College");
            }
            @Override
            void grade() {
                System.out.println("Grade A");
            }

            void degree() {
                System.out.println("computer science degree");

            }
        }

        class SchoolStudent extends Student {

            @Override
            void study() {
                System.out.println("Student at School");
            }
            @Override
            void grade() {
                System.out.println("Grade A");
            }

            void topic() {
                System.out.println("General education");
            }

        }




