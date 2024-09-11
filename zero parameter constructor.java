class Box {
	double height,width,depth;
	Box()
	{
		height= 2;
		width= 1;
		depth=1;
	}
	double volume()
	{
		return(height*width*depth);
	}
}
class constructor {
	public static void main (String[] args) {
	 Box b1 = new Box();
	 Box b2 = new Box();
	 System.out.println("volume1 = "+b1.volume());
	 System.out.println("volume2 = "+b2.volume());
	 }
}	 

					
