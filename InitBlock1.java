/**u can have more than one "init block" in a single class and they are executed in a ordeer, in which they are defined in the class.**/
class InitBlock1
{
	int y,x;
	{
		x=10; //this.x=10;
		System.out.println("First Init Block");
	}
	InitBlock1()
	{
		//this(this.x,this.y);
		System.out.println("Default constructor"+x);
	}
	{
		System.out.println("Second Init Block");
		y=20;
	}
	InitBlock1(int x,int y)
	{
		System.out.println("Arguments Constructor lo: "+(x+y));
		System.out.println("Arguments Constructor: "+(this.x+this.y));
	}
	public static void main(String []ar)
	{
		new InitBlock1();
	}
}