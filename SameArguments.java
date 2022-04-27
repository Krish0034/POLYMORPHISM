class SameArguments
{
	static void show(int x,long y)
	{
		System.out.println("Int Long Arguments.");
	}
	static void show(long x,int y)
	{
		System.out.println("Long Int Arguments.");
	}
	public static void main(String []arg)
	{
		//show(10,10l);
		//show(10l,10);
		show(10,10);
	}
}