class FunOver
{
	static void show()
	{
		System.out.println("Zero Arguments");
	}
	static void show(int x)
	{
		System.out.println("One Arguments");
	}
	static void show(int x,int y)
	{
		System.out.println("Two Arguments");
	}
	static void show(int x,int y,int z)
	{
		System.out.println("Three Arguments");
	}
	public static void main(String... ar)
	{
		show();
		show(10);
		show(10,20);
		show(10,10,10);
	}
}