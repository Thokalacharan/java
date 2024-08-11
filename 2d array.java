import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        int arr[][]=new int[2][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("enter the value in row = "+(i+1)+" and column = "+(j+1));
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
