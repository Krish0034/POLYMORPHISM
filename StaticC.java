class StaticC
{
	static int x;
	static
	{
		System.out.println("Static Block");
		x=new java.util.Scanner(System.in).nextInt();
	}
}
class StaticTest1
{
	public static void main(String []arg)
	{
		System.out.println("Main from Test1");
		System.out.println(StaticC.x);
		System.out.println("After static from test1");
	}
}
class StaticTest2
{
	public static void main(String []as)
	{
		System.out.println("Main from Test2");
		System.out.println(StaticC.x);
		System.out.println("After static from test2");
	}
}