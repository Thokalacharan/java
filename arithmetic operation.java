import java.util.Scanner;
public class simplecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        double num1=sc.nextInt();
        System.out.println("enter the second number");
        double num2=sc.nextInt();
        System.out.println("choose an operation:");
        System.out.println("1.add(+)");
        System.out.println("2.subtract(-)");
        System.out.println("3.multiply(*)");
        System.out.println("4.divide(/)");
        System.out.println("enter your choice(1-4)");
        int choice = sc.nextInt();
        switch(choice)
        {
        case 1:
            System.out.println("result:"+(num1+num2));
            break;
        case 2:
            System.out.println("result:"+(num1-num2));
            break;
        case 3:
            System.out.println("result:"+(num1*num2));
            break;
        case 4:
            if(num2!=0) {
                System.out.println("result:"+(num1/num2));
            }
            else
            {
                System.out.println("error cannot divide by zero");
            }
            break;
        default:
            System.out.println("invalid choice please select valid choice");
        }
    }
}
