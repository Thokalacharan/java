
class Method {
    static int a = 10;

    public static void display() {
        System.out.println("static method");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Method.a);
        Method.display();              
    }
}
