package Object_Arrays;

/*
 * Write a class EmployeeDetails with attributes name and salary. 
 * Create an array of Employee objects, initialize them, and display the details of all employees.
 */

class EmployeeDetails {
    private String name;
    private double salary;

    public EmployeeDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void dispDetails() {
        System.out.println("Name : " + name + " Salary : " + salary);
    }

}

public class Employee {
    public static void main(String[] args) {
        EmployeeDetails[] employees = new EmployeeDetails[3];
        employees[0] = new EmployeeDetails("John", 20000);
        employees[1] = new EmployeeDetails("Priya", 50000);
        employees[2] = new EmployeeDetails("Ram", 55000);
        for (EmployeeDetails emp : employees) {
            emp.dispDetails();
        }

    }
}
