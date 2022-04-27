/*Different Number of Argument*/
class OverShow1
{
	static void show()
	{
		System.out.println("NO Arguments");
	}
	static void show(int x)
	{
		System.out.println("One Arguments"+x);
	}
	static void show(int x,int y)
	{
		System.out.println("Two Arguments"+x+y);
	}
	static void show(int x,long z,char c)
	{
		System.out.println("Three Arguments"+x+z+c);
	}
	public static void main(String []arg)
	{
		show();
		show(10);
		show(10,20);
		show(10,25,'k');
	}
}