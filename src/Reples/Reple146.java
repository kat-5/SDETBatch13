package Reples;

public class Reple146 {
    public static void main(String[] args) {
        Employees employ=new Employees();
        employ.print();
        Employees employ2=new Employees("Joe","Smith", 12345, "01/01/1970", 35000);
        employ2.print();
    }
}
    class Employees {

        String name;
        String lastName;
        int employeeId;
        String startDate;
        int Salary;


        Employees() {

        }

        Employees(String name, String lastName, int employeeId, String startDate, int Salary) {
            this.name = name;
            this.lastName = lastName;
            this.employeeId = employeeId;
            this.startDate = startDate;
            this.Salary = Salary;
        }

        void print() {
            System.out.println(name +" "+ lastName+" "+employeeId+" "+startDate+" "+Salary);

        }
    }



