public class main{
    public static void main(String[] args){
        int number1 = 6;
        int number2 = 0;
        int result = 0;
       System.out.println("excution start");
        try{
           result = number1/number2;
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        System.out.println(result);
        System.out.println("excution end");
    }
}
