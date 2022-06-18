package com.syntax.class16;

public class GoogleEmployees {

    String name;
    double salary;
    static int noOfEmployees;
    String companyName= "Google";

    void displayEmployeeInfo() {
        System.out.println("Name " + name + " Salary "+salary+ " Company Name " + companyName+" Total employees "+noOfEmployees);

    }
    public static void main(String[] args) {
        GoogleEmployees emp1=new GoogleEmployees();
        emp1.name="Oleg";
        emp1.salary=250000;
        emp1.noOfEmployees=1;


        GoogleEmployees emp2=new GoogleEmployees();
        emp2.name="Sameer";
        emp2.salary=250001;
        emp2.noOfEmployees=2;
        emp2.displayEmployeeInfo();
    }
}
