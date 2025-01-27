package Polymorphism.Overloading;

/*
 * Create a class Calculator with the following overloaded methods:
    * add(int a, int b) to add two integers.
    * add(double a, double b) to add two floating-point numbers.
    * add(int a, int b, int c) to add three integers.
 * Write a program to demonstrate compile-time polymorphism by calling all three methods with appropriate arguments.
 */
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("3 + 4 = " + calc.add(3, 4));
        System.out.println("4.8 + 5.2 = " + calc.add(4.8, 5.2));
        System.out.println("1 + 7 + 2 = " + calc.add(1, 7, 2));
    }
}
