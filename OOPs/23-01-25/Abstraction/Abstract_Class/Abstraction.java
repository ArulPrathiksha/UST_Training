package Abstraction.Abstract_Class;

/*
 * Write an abstract class Employee with a constructor to initialize name and employeeId. 
 * Add an abstract method calculateSalary(). Create a subclass Manager that implements calculateSalary().
 */

abstract class Employee {
    String name;
    int empID;

    public Employee(String name, int empID) {
        this.name = name;
        this.empID = empID;
    }

    abstract void calculateSalary();

    abstract void disp();
}

class Manager extends Employee {
    String position;
    int experience;
    double salary;

    public Manager(String name, int empID, String pos, int exp) {
        super(name, empID);
        this.position = pos;
        this.experience = exp;
    }

    public void calculateSalary() {
        if (experience == 0) {
            salary = 30000;
        } else if (experience >= 10) {
            salary = 100000;
        } else if (experience >= 7) {
            salary = 70000;
        } else {
            salary = 50000;
        }
    }

    public void disp() {
        System.out.println("Name : " + name + " Salary : " + salary);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Employee emp1 = new Manager("John", 1, "HR", 7);
        Employee emp2 = new Manager("Priya", 1, "SDE", 10);
        emp1.calculateSalary();
        emp1.disp();
        emp2.calculateSalary();
        emp2.disp();
    }
}
