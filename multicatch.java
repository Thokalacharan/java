public class Main {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 0;
        int result = 0;
        System.out.println("Execution start");

        try {
            result = number1 / number2;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } catch (Exception e) {
            // This block will catch any other exceptions not previously caught
            System.out.println(e);
        } finally {

            System.out.println("Finally block executed");
        }

        System.out.println("Result: " + result);
        System.out.println("Execution end");
    }
}
