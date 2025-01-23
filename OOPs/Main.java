/*Write a Java program to create a class called "Dog" with a name and breed attribute. 
Create two instances of the "Dog" class, set their attributes using the constructor 
and modify the attributes using the setter methods and print the updated values. */

class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rocky", "GermanShepherd");
        Dog dog2 = new Dog("Julie", "Beagle");

        System.out.println("Dog 1 : \nName : " + dog1.getName() + "\nBreed : " + dog1.getBreed());
        System.out.println("Dog 2 : \nName : " + dog2.getName() + "\nBreed : " + dog2.getBreed());

        System.out.println("New Dog Details : ");

        dog2.setBreed("Siberian Husky");
        dog1.setName("Jacky");

        System.out.println("Dog 1 : \nName : " + dog1.getName() + "\nBreed : " + dog1.getBreed());
        System.out.println("Dog 2 : \nName : " + dog2.getName() + "\nBreed : " + dog2.getBreed());
    }

}
