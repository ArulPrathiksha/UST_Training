package Abstraction.Multilevel_abstraction;

/*
 * Write an abstract class Appliance with abstract methods turnOn() and turnOff(). 
 * Create another abstract class KitchenAppliance that adds an abstract method cook(). 
 * Finally, implement a concrete class Microwave with implementations for all abstract methods.
 */

abstract class Appliance {
    abstract void turnOn();

    abstract void turnOff();
}

abstract class KitchenAppliance extends Appliance {
    abstract void cook();
}

class Microwave extends KitchenAppliance {
    String brand;
    String recipe;

    public Microwave(String brand, String recipe) {
        this.brand = brand;
        this.recipe = recipe;
    }

    public void turnOn() {
        if (recipe == "Pancake") {
            System.out.println("Microwave ON for 2 Minutes");
        } else if (recipe == "Brownie") {
            System.out.println("Microwave ON for 2 Minutes");
        } else if (recipe == "Eggs") {
            System.out.println("Microwave ON for 5 Minutes");
        } else {
            System.out.println("Microwave is turned ON..");
        }
    }

    public void turnOff() {
        System.out.println("\nMicrowave turned OFF..");
    }

    public void cook() {
        System.out.println("\nCooking " + recipe + "..wait for a moment !!!");
    }
}

public class Multilevel_abstraction {
    public static void main(String[] args) {
        Microwave microwave = new Microwave("Samsung", "Brownie");
        microwave.turnOn();
        microwave.cook();
        microwave.turnOff();

    }
}
