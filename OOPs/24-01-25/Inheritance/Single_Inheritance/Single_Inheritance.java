package Inheritance.Single_Inheritance;

/*
 * Create a base class Employee with attributes name and salary, and a method displayDetails() to print these details. 
 * Create a subclass Manager that adds an attribute department and overrides the displayDetails() method to include the department information.
 * Write code to demonstrate inheritance and the overridden method.
 * Use a Manager object to access both inherited and subclass-specific attributes.
 */
class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("EMPLOYEE CLASS : \nName => " + name + "\nSalary => " + salary);
    }

}

class Manager extends Employee {
    String dept;

    public Manager(String name, int salary, String dept) {
        super(name, salary);
        this.dept = dept;
    }

    public void displayDetails() {
        System.out.println("MANAGER CLASS :\nName => " + name + "\nSalary => " + salary + "\nDepartment => " + dept);
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Employee emp = new Employee("Jack", 50000);
        Manager manager = new Manager("Jack", 50000, "Marketing");
        emp.displayDetails();
        System.out.println();
        manager.displayDetails();
    }
}
