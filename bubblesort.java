import java.util.*;
class bubble
{
 public static void main(String[] args)
 {
	int i,j,temp;
	int a[]={4,5,7,2,3};
	for(i=0;i<5;i++)
	{
		for(j=0;j<5-i-1;j++)
		{	
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	for(i=0;i<5;i++)
	{
		System.out.println(a[i]);
	}
}
}	
