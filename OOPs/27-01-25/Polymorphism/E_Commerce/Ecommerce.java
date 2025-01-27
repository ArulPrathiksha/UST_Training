package Polymorphism.E_Commerce;

/*
 * Design a base class Product with attributes productName and price, and a method calculateDiscount() that returns a generic discount of 5%.
 * Derive subclasses:
    * Electronics that overrides calculateDiscount() to return 10%.
    * Clothing that overrides calculateDiscount() to return a variable discount based on season.
 * Write a program that:
    * Creates a list of Product references storing objects of Electronics and Clothing.
    * Calculates the total price after applying discounts for all products using polymorphism.
 */
class Product {
    String productName;
    int price;

    public Product(String name, int price) {
        this.productName = name;
        this.price = price;
    }

    public double calculateDiscount() {
        double discount = price - (price * 0.05);
        return discount;
    }

    public void disp() {
        System.out.println(
                "Product\t: " + productName + "\nPrice\t: " + price + "\nDiscounted Price: " + calculateDiscount()
                        + "\n");
    }
}

class Electronics extends Product {
    public Electronics(String name, int price) {
        super(name, price);
    }

    public double calculateDiscount() {
        double discount = price - (price * 0.1);
        return discount;
    }
}

class Clothing extends Product {
    String season;

    public Clothing(String name, int price, String season) {
        super(name, price);
        this.season = season;
    }

    public double calculateDiscount() {
        // System.out.println("Enter Season :\n1.Wedding\n2.Pongal\n3.Diwali");
        double discount;
        switch (season) {
            case "Wedding":
                discount = price - (price * 0.2);
                break;
            case "Pongal":
                discount = price - (price * 0.3);
                break;
            case "Diwali":
                discount = price - (price * 0.4);
                break;
            default:
                discount = price - (price * 0.05);
                break;
        }
        return discount;
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Product prod[] = new Product[3];
        prod[0] = new Electronics("Phone", 50000);
        prod[1] = new Clothing("Saree", 5000, "Pongal");
        prod[2] = new Clothing("Kurti", 3000, "Diwali");
        double total = 0;
        for (Product i : prod) {
            i.disp();
            total += i.calculateDiscount();
        }
        System.out.println("Total : " + total);
    }
}
