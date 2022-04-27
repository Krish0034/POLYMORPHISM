/*If u want to initialized data member of each object with the same value then alwayes use default constructor*/
class Temp3
{
	int x,y;
	Temp3()
	{
		x=10;
		y=20;
	}
	void show()
	{
		System.out.println("x="+x+"y="+y);
		
	}
	public static void main(String []args)
	{
		Temp3 t=new Temp3();
		Temp3 t1=new Temp3();
		t.show();
		t1.show();
	}
}