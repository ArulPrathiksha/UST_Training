package Polymorphism.Overriding;

/*
 * Write a base class Animal with a method sound() that prints "Animal makes a sound."
 * Create subclasses:
 * Dog that overrides sound() to print "Dog barks."
 * Cat that overrides sound() to print "Cat meows."
 * Write a program to demonstrate runtime polymorphism by creating an Animal reference pointing to objects of Dog and Cat, and calling the sound() method.
 */
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();
    }
}
