package Inheritance.Multiple_Inheritance;
/*
 * Create an interface Printable with a method printDetails(). Create another interface Chargeable with a method calculateCharge().
 * Create a class Product that implements both interfaces.
 * Add attributes like name, price, and quantity, and implement the methods to display product details and calculate total charge.
 * Demonstrate multiple inheritance using interfaces and how the implemented methods work.
 */

interface Printable {
    void printDetails();

}

interface Chargeable {
    void calculateCharge();

}

class Product implements Printable, Chargeable {
    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void printDetails() {
        System.out.println("Name\t: " + name + "\nPrice\t: " + price + "\nQuantity: " + quantity);
    }

    public void calculateCharge() {
        System.out.println("Charge : " + (price * quantity));
    }

}

public class Multiple {
    public static void main(String[] args) {
        Product prod = new Product("Chocolate", 20, 5);
        prod.printDetails();
        prod.calculateCharge();
    }
}
