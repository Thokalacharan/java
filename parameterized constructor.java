class Box {
	double height,width,depth;
	Box(double h,double w,double d)
	{
		height= h;
		width= w;
		depth=d;
	}
	double volume()
	{
		return(height*width*depth);
	}
}
class constructor1 {
	public static void main (String[] args) {
	 Box b1 = new Box(2,1,1);
	 Box b2 = new Box(2,2,1);
	 System.out.println("volume1 = "+b1.volume());
	 System.out.println("volume2 = "+b2.volume());
	 }
}	 

					
