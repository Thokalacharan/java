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

interface flyable {
    void fly();
}
interface swimmable{
    void swim();
}
class duck implements flyable,swimmable {
    public void fly (){
        System.out.println("duck can't fly");
    }
    public void swim(){
        System.out.println("duck can swim");
    }
}
public class interfaces {
    public static void main(String[] args ){
        duck d = new duck();
        d.fly();
        d.swim();
    }
}


Exercise 4: Interface for Calculations
Objective: Create an interface for different calculation strategies.
1. Define an Interface:
o Create an interface Calculator with a method double calculate(double a, double b);
2. Implement Different Calculation Strategies:
o Create classes Add, Subtract, Multiply, and Divide that implement the Calculator
interface.
o Provide the logic for addition, subtraction, multiplication, and division.
3. Test the Implementations:
o In a main class, create instances of each calculation class and call their calculate
method with sample inputs.


    interface calculator{
    double calculate(double a,double b);
}
class add implements calculator {
     public double calculate(double a, double b) {
         return a+b;
     }
}
class subtract implements calculator{
    public double calculate(double a, double b) {
        return a-b;
    }
}
class division implements calculator {
    public double calculate(double a, double b) {
        return a/b;
    }
}
class multiply implements calculator {
    public double calculate(double a, double b) {
        return a*b;
    }
}
public class main {
    public static void main(String[] args){
        add a = new add();
        subtract s = new subtract();
        division d = new division();
        multiply m = new multiply();
        System.out.println("addition"+ a.calculate(2,5));
        System.out.println("subtract"+ s.calculate(2,5));
        System.out.println("division"+ d.calculate(2,2));
        System.out.println("multiply"+ m.calculate(2,5));
    }
    
}

