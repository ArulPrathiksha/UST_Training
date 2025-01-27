package Inheritance.Multilevel_Inheritance;

/*
 * Write a base class Vehicle with attributes make and model and a constructor to initialize them. 
 * Create a subclass Car that adds an attribute numDoors and a constructor to initialize all attributes using super(). 
 * Further, derive a class ElectricCar that adds batteryCapacity and initializes all attributes, chaining constructors across three levels.
 * Create an object of ElectricCar and print all its details.
 */
class Vehicle {
    String make;
    String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

class Car extends Vehicle {
    int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }
}

class ElectricCar extends Car {
    String batteryCapacity;

    public ElectricCar(String make, String model, int numDoors, String batteryCapacity) {
        super(make, model, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void disp() {
        System.out.println("ELECTRIC CAR DETAILS : ");
        System.out.println("Make : " + make + "\nModel : " + model + "\nNo. of Doors : " + numDoors
                + "\nBattery Capacity : " + batteryCapacity);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("India", "Hyundai", 4, "16kWh");
        electricCar.disp();
    }
}
