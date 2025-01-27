package Abstraction.Gadgets;

/*Write an abstract class Device with attributes brand and price, and abstract methods features() and usage(). 
Implement subclasses Mobile and Laptop. */
abstract class Device {
    String brand;
    int price;

    public Device(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    abstract void features();

    abstract void usage();

    public void disp() {
        System.out.println("Brand : " + brand + "\nPrice : " + price);
    }
}

class Mobile extends Device {

    public Mobile(String brand, int price) {
        super(brand, price);
    }

    public void features() {
        switch (brand) {
            case "Apple":
                System.out.println("Dynamic Island\nFace ID");
                break;
            case "Samsung":
                System.out.println("AI features\nS-Pen");
                break;
            case "Oneplus":
                System.out.println("Fast charging");
                break;
            default:
                System.out.println("Camera , Call , Dual SIM");
                break;
        }
    }

    public void usage() {
        System.out.println("Used for Communication\nEntertainment\nProductivity");
    }
}

class Laptop extends Device {

    public Laptop(String type, int price) {
        super(type, price);
    }

    public void features() {
        System.out.println("High processing power, Keyboard, Large display, Multitasking.");
    }

    public void usage() {
        System.out.println("Professional Work\nGaming\nStreaming\nSoftware Development");
    }
}

public class Gadgets {
    public static void main(String[] args) {
        Device device1 = new Mobile("Samsung", 150000);
        Device device2 = new Laptop("HP", 60000);
        System.out.println("DEVICE 1 : ");
        device1.disp();
        System.out.println("FEATURES : ");
        device1.features();
        System.out.println("USAGE : ");
        device1.usage();
        System.out.println("\nDEVICE 2 : ");
        device2.disp();
        System.out.println("FEATURES : ");
        device2.features();
        System.out.println("USAGE : ");
        device2.usage();
    }
}
