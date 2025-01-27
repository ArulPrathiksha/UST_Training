package Inheritance.Method_Hiding;

/*
 * Create a class Parent with a static method staticMethod() and a non-static method instanceMethod(). 
 * Create a subclass Child that defines a static method with the same name (staticMethod()) and overrides the instanceMethod().
 * Demonstrate how method hiding works for the static method.
 * Show how overriding behaves for the non-static method when using parent and child references.
 */
class Parent {
    public static void staticMethod() {
        System.out.println("Parent Class => Static Method");
    }

    public void instanceMethod() {
        System.out.println("Parent Class => Non-Static Method");
    }
}

class Child extends Parent {
    public static void staticMethod() {
        System.out.println("Child Class => Static Method");
    }

    public void instanceMethod() {
        System.out.println("Child Class => Non-static Method");
    }
}

public class Hiding {
    public static void main(String[] args) {
        // Method hiding
        Parent.staticMethod();
        Child.staticMethod();
        System.out.println();
        Parent parent = new Parent();
        parent.instanceMethod();
        System.out.println();
        Child child = new Child();
        child.instanceMethod();

    }
}
