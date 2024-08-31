import java.util.Scanner;
class armstrong {
    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        System .out. println("enter the number");
        int num = sc.nextInt();
        
        int o= num;
        int sum= 0;
        while (num >0) {
            int digit = num%10;
            sum+=digit*digit*digit;
            num/=10;
        }
        if (sum==o){
             System.out.println("is armstrong");
             
        }
        else
        {
            System.out.println("is not  armstrong");
        }
        
    }
    
}
