/*Exercise 1: Basic Interface Implementation
Objective: Create an interface and implement it in a class.
1. Define an Interface:
o Create an interface named Animal with methods:
▪ void makeSound();
▪ void eat();
2. Implement the Interface:
o Create two classes, Dog and Cat, that implement the Animal interface.
o In each class, provide implementations for makeSound() and eat().
3. Test the Implementation:
o Create instances of Dog and Cat in a main class and call their methods*/


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
