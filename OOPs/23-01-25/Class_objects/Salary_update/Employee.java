/*
 * Write a Java program to create a class called "Employee" with a name, job
 * title, and salary attributes, and methods to calculate and update salary.
 */

class EmpDetails {
    private String name;
    private String job;
    private int salary;

    public EmpDetails(String name, String job, int salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void hike(double percent) {
        salary += salary * (percent / 100);
    }

    public void printEmpDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + job);
        System.out.println("Salary: " + salary);
    }
}

public class Employee {

    public static void main(String[] args) {
        EmpDetails emp1 = new EmpDetails("John", "HR", 60000);
        EmpDetails emp2 = new EmpDetails("Julie", "SDE", 50000);

        emp1.printEmpDetails();
        emp2.printEmpDetails();

        emp2.hike(5);
        System.out.println("Updated : ");
        emp2.printEmpDetails();

    }
}