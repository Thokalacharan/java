import java.util.Scanner; 
 class primenumbers {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the number");
              int n=sc.nextInt();
         System.out.println("enter the prime number 1 to "+n+" are:");
         for(int i=2;i<=n;i++)
         {
             Boolean isprime=true;
                for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    isprime=false;
                    break;
                }
            }    
            if(isprime) {
                System.out.println(i+" ");
            }
     }
     }
     
 }
