package com.Homework.Class25;

public abstract class Marks {
    /*We have to calculate the average of marks obtained in three subjects by student A and in 4 subjects by
    student B. Create class 'Marks' with an abstract method 'getAverage' that will be returning the average
    of marks. Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A
    takes the marks in three subjects as its parameters and the marks in four subjects
    as its parameters for student B. Test your code
     */

    int i1;
    int i2;
    int i3;
    int i4;

    abstract void getAverage();

    public abstract void getAverage(int i1, int i2, int i3);

    public abstract void getAverage(int i1, int i2, int i3,int i4);
}


    class A extends Marks {

        @Override
        void getAverage() {

        }

        @Override
        public void getAverage(int i1, int i2, int i3) {
            this.i1 = i1;
            this.i2 = i2;
            this.i3 = i3;
            System.out.println((i1+i2+i3)/3);

        }

        @Override
        public void getAverage(int i1, int i2, int i3, int i4) {

        }


    }

    class B extends Marks {


        @Override
        void getAverage() {

        }

        @Override
        public void getAverage(int i1, int i2, int i3) {


        }

        @Override
        public void getAverage(int i1, int i2, int i3, int i4) {
            this.i1 = i1;
            this.i2 = i2;
            this.i3 = i3;
            this.i4 = i4;
            System.out.println((i1+i2+i3+i4)/4);
        }
        }


    class TestMarks{
        public static void main(String[] args) {
            Marks a=new A();
            a.getAverage(45,67,90);
            Marks b=new B();
            b.getAverage(90,89,67,90);
        }
    }

