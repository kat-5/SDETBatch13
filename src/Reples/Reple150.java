package Reples;

public class Reple150 {
    public static void main(String[] args) {
     Person employee= new Employee();
     employee.name="Joe";
     employee.lastName="Smith";
     employee.age=35;
     employee.PrintThis();

     Person student= new Student();
     student.name="Adam";
     student.lastName="Smith";
     student.age=15;
     student.PrintThis();

     Person retiree= new Retiree();
     retiree.name="Frank";
     retiree.lastName="Smith";
     retiree.age=15;
     retiree.PrintThis();
    }


    }
    class Person {
        String name;
        String lastName;
        int age;

        void PrintThis() {
        }
    }

    class Employee extends Person {
        int salary=35000;

        void PrintThis() {
            System.out.println(name +" "+ lastName +" "+ age+" "+salary);


        }
    }

        class Student extends Employee {
            int grade=10;

            void PrintThis() {
                System.out.println(name +" "+ lastName +" "+ age+" "+grade);
            }
        }

        class Retiree extends Student {
            String seniorActivity="tour";

            void PrintThis() {
                System.out.println(name +" "+ lastName +" "+ age+" "+seniorActivity);
            }
        }



