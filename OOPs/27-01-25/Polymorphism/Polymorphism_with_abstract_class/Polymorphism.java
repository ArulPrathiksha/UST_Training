package Polymorphism.Polymorphism_with_abstract_class;

/*
* Create an abstract class Appliance with an abstract method operate().
* Derive subclasses:
    WashingMachine that implements operate() to print "Washing clothes."
    Refrigerator that implements operate() to print "Cooling items."
* Write a program to:
    Create an array of Appliance references.
    Store objects of WashingMachine and Refrigerator in the array.
    Use a loop to call operate() for each object. 
*/
abstract class Appliance {
    abstract void operate();
}

class WashingMachine extends Appliance {
    public void operate() {
        System.out.println("Washing clothes ..");
    }
}

class Refrigerator extends Appliance {
    public void operate() {
        System.out.println("Cooling items ..");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Appliance appliance[] = new Appliance[2];
        appliance[0] = new WashingMachine();
        appliance[1] = new Refrigerator();
        for (Appliance app : appliance) {
            app.operate();
        }
    }
}
