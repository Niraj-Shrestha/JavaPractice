package Polymorphism;

public class MethodOverriding {
    public static void main(String args[]){

            Animal dog = new Dog();
            dog.makeSound();
            Animal cat = new Cat();
            cat.makeSound();
            Animal duck = new Duck();
            duck.makeSound();
    }
}

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

class Duck extends Animal{
}