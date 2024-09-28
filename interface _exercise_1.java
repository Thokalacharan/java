//Exercise 1: Basic Interface Implementation
//Objective: Create an interface and implement it in a class.
//1. Define an Interface:
//o Create an interface named Animal with methods:
//▪ void makeSound();
//▪ void eat();


interface animal {
    void makeSound();
    void eat();
}

class Dog implements animal {
    public void makeSound() {
        System.out.println("Dog makes sound");
    }
    public void eat() {
        System.out.println("Dog can eat");
    }
}

class Cat implements animal {
    public void makeSound() {
        System.out.println("Cat makes sound");
    }
    public void eat() {
        System.out.println("Cat can eat");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.makeSound();
        d.eat();
        c.makeSound();
        c.eat();
    }
}
