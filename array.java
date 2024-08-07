import java.util.Scanner;
class array {
	public static void main(String[] args) {
	        int i;
		int arr[]=new int[20];
		Scanner p=new Scanner(System.in);
		System.out.println("enter the elements");
		for(i=0;i<5;i++)
		{
			arr[i]=p.nextInt();
		}
		System.out.println("elements order");
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i] +" ");
		}
	}
}			
	
