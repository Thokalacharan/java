import java.util.*;
class Binary
{
  public static void main(String args[])
  {
     int a[]={1,2,3,4,5};
     int low=0,mid,high=4;
     int count=0,key=3;
     while(low<=high)
     {
      mid=(low+high)/2;
      if(key==a[mid])
        {
        count=1;
        break;
        }
        else if(key<a[mid])
        {
         high=mid-1;
        }
        else
        {
         low=mid+1;
       	}
     }
	 if(count==1)
	 {
	  System.out.println("key is found");
	 }
	 else
	 {
	   System.out.println("key is not found");
	 } 
       
  }
}		
