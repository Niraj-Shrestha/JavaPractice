package Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Output: Dog barks
        cat.makeSound(); // Output: Cat meows
        dog.doSomething();
        cat.doSomething();
    }
}

// Abstract class representing an Animal
abstract class Animal {
    // Abstract method to make a sound
    public abstract void makeSound();

    public void doSomething(){
        System.out.println("Print from superclass animal");
    }
}

// Concrete subclass representing a Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Concrete subclass representing a Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}
