//program to find the data types of a values without initialization

public class proram{
	public static void main(String[] args){
	float a=5,b=4,c=2,d;
	double r1,r2;
	d=((b*b)-4*a*c);
	if(d==0)
	{
		System.out.println("roots are real and equal");
		r1=-b/(2*a);
		r2=-b/(2*a);
		System.out.println(r1);
		System.out.println(r2);
	}
	else if(d>0)
	{
		System.out.println("roots are real and distinct");
		r1=(-b+Math.sqrt(d))/(2*a);
		r2=(-b-Math.sqrt(d))/(2*a);
		System.out.println(r1);
		System.out.println(r2);
		
	}
	else 
		System.out.println("roots are complex");
		}
	}
