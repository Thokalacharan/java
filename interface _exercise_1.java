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


/* Exercise 2: Interface with Default Methods
Objective: Use default methods in an interface.
1. Define an Interface:
o Create an interface named Vehicle with methods:
▪ void start();
▪ void stop();
▪ Add a default method: default void honk() { System.out.println("Honk!"); }
2. Implement the Interface:
o Create classes Car and Bike that implement the Vehicle interface.
o Implement the start() and stop() methods and call the default honk() method.
3. Test the Implementation:
o In a main class, create objects of Car and Bike and test their methods. */

interface vehicle {
    void start();
    void stop();
    default void honk(){
        System.out.println("honk");
    }
}

class car implements vehicle {
    public void start() {
        System.out.println("start the car");
    }
    public void stop() {
        System.out.println("stop the car");
    }
}

class bike implements vehicle {
    public void start() {
        System.out.println("start the bike");
    }
    public void stop() {
        System.out.println("stop the bike  ");
    }
}

public class Main {
    public static void main(String[] args) {
        car c = new car();
        bike b = new bike();
        c.start();
        c.stop();
        b.start();
        b.stop();
        c.honk();
        b.honk();
    }
}


/* Exercise 3: Multiple Interfaces
Objective: Implement multiple interfaces in a single class.
1. Define Interfaces:
o Create an interface Flyable with a method void fly();
o Create another interface Swimmable with a method void swim();
2. Implement the Interfaces:
o Create a class Duck that implements both Flyable and Swimmable.
o Provide implementations for both methods.
    3. Test the Implementation:
o In a main class, create a Duck object and call both methods. */



