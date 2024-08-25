import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number ");
        int n = scanner.nextInt();

        int sum = 0;

       
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum = i++;
            }
        }

        
        if (sum == n) {
            System.out.println(" is perfect number");
        } else {
            System.out.println("not perfect" );
        }
    }
}
