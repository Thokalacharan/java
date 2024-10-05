Exercise 1: Shape Interface
Objective: Understand interfaces and method implementation.
• Task: Create an interface Shape with a method getArea(). Implement this interface in
three classes: Rectangle, Circle, and Triangle. Each class should provide its own
implementation of the getArea() method.

interface shape {
    double getarea();
}
class rectangle implements shape{
    double length;
    double width;
    rectangle(double length,double width) {
        this.length=length;
        this.width=width;
    }
public double getarea() {
        return length*width;
    }
}
class circle implements shape{
    double r;
    circle(double r) {
        this.r=r;
    }
  public  double getarea(){
        return 3.14*r*r;
    }
}
class triangle implements shape {
    double l;
    double h;
    double b;
    triangle(double l,double h,double b){
        this.l=l;
        this.h=h;
        this.b=b;
    }
    public double getarea(){
        return l*h*b;
    }
}
public class main{
    public static void main(String[] args) {
        rectangle r = new rectangle(2,2);
        circle c = new circle(2);
        triangle t = new triangle(2,2,2);
       System.out.println("circle = "+ c.getarea());
       System.out.println("rectangle = "+ r.getarea());
       System.out.println("triangle = "+ t.getarea());
    }
}

Exercise 2: Animal Interface
Objective: Explore interface methods and class implementation.
• Task: Define an interface Animal with a method bark(). Create a class Dog that
implements this interface and overrides the bark() method to print "Dog is barking".

    interface animal {
    void bark();
}
class dog implements animal {
    public void bark() {
        System.out.println("dog is barking");
    }
}
public class main{
    public static void main(String[] args){
        dog d = new dog();
        d.bark();
    }
}
