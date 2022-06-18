package com.syntax.class16;

public class Homework {

    /* Create a Class called SyntaxEmployee:
       Create three  variables  empID , salary and set the CEO to “Sumair”
       Create two objects of the class SyntaxEmployee
       Set the value of eID, salary for each of the objects
       Print out the eID , salary and  CEO for each of the objects
*/
    public class SyntaxEmployee {

        String empID;
        double salary;

        String ceo = "Sumair";


        void displayEmployeeInfo() {
            System.out.println("Name " + empID + " Salary " + salary + " CEO" + ceo);

        }
    }

        public static void main(String[] args) {
            com.syntax.class16.Homework emp = new com.syntax.class16.Homework();
          //  emp.empID = "7849D";
           // emp.salary = 250000;


            com.syntax.class16.Homework emp5 = new com.syntax.class16.Homework();
           // emp5.empID = "5467D";
           // emp5.salary = 200000;

        }
    }



    /* Create a Class called Students
       Create three  variables  Name , ID  and  numberOfStudents
       Create three objects of the Students Class
       Set the value for  studentName , studentID and increment  the numberOfStudents for each object
       Print out  total number of students
*/
