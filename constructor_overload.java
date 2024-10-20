import java.util.*;
class Abs{
    A(){
        System.out.println("normal constructor");
    }
   A(int n){
                System.out.println(" constructor overloading and number"+n);

    }
    


    public static void main(String[] args){
        A obj1 = new A();
        A obj2 = new A(87);
    
}
}
