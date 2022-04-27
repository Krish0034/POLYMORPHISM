class OverShow3
{
	static void show(int x,long y)
	{
		System.out.println("INT & LONG type arguments:");
		System.out.println(x);
		System.out.println(y);
	}
	static void show(long x,int y)
	{
		System.out.println("LONG & INT type arguments:");
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String []afg)
	{
		show(10,20);
		show(200l,50);
		show(200,77l);
	}
}