import java.util.Scanner;
public class largestnumber{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter first number");
        double num1=sc.nextInt();
         System.out.println("enter second number");
        double num2=sc.nextInt();
         System.out.println("enter third number");
        double num3=sc.nextInt();
        double t = num1;
        {
            if (num2>t) 
            {
                t= num2;
            }
            if(num3>t)
            {
                t= num3;
            }
        System.out.println("the largest number "+t);    
        }
    
        
    }
    
}
