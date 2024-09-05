import java.util.Scanner;
class strong {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int num = sc.nextInt();

    int o = num;
    int sum = 0;
    while (num > 0) {
      int digit = num % 10;
      int fact = 1;

      for (int i = 1; i <= digit; i++) {
        fact = fact * i;
      }
      sum = sum + fact;
      num /= 10;
    }
    if (sum == o) {
      System.out.println("is strong");

    } else {
      System.out.println("is not  strong");
    }
  }
}
