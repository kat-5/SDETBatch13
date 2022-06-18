package com.syntax.class16;

public class SyntaxEmployee {

    /*Create a Class called SyntaxEmployee: Create three  variables  empID , salary and set the CEO to “Sumair”
    Create two objects of the class SyntaxEmployee Set the value of eID, salary for each of the objects
    Print out the eID , salary and  CEO for each of the objects*/

    String empID;
    double salary;

    static String ceo="Sumair";

    void displayEmployeeInfo() {

        System.out.println("Name " + empID + " Salary "+salary+ " CEO" + ceo);
    }

    public static void main(String[] args) {
        com.syntax.class16.SyntaxEmployee emp1=new com.syntax.class16.SyntaxEmployee();
        emp1.empID="7849D";
        emp1.salary=250000;
        System.out.println(emp1.empID);
        System.out.println("$"+emp1.salary);
        System.out.println(emp1.ceo);

        System.out.println();

        com.syntax.class16.SyntaxEmployee emp2=new com.syntax.class16.SyntaxEmployee();
        emp2.empID="5467D";
        emp2.salary=200000;
        System.out.println(emp2.empID);
        System.out.println("$"+emp2.salary);
        System.out.println(emp2.ceo);
    }

}


