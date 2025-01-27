/*
 * Write a class Item with attributes name, quantity, and price. Create a class
 * Inventory to manage a list of items. Add methods to add new items, update
 * quantities, and display the inventory.
 */

package Inventory_Management;

import java.util.ArrayList;

class Item {
    String name;
    int quantity;
    double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}

class Inventory {
    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item i) {
        items.add(i);
    }

    public void updateItem(Item i, int quantity) {
        i.quantity = quantity;
        System.out.println("Successfully Updated Quatity!");
    }

    public void disp() {
        for (Item i : items) {
            System.out.println("Name : " + i.name + " Quantity : " + i.quantity + " Price : " + i.price);
        }
    }
}

public class InverntoryManagement {
    public static void main(String[] args) {
        Item item = new Item("Marie Gold", 50, 10);
        Inventory inv = new Inventory();
        inv.addItem(item);
        inv.disp();
        inv.updateItem(item, 20);
        System.out.println("Updated Quantity : ");
        inv.disp();
    }
}