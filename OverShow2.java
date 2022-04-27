/*same no. of arguments*/
class OverShow2
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
	static void show(int x, char c)
	{
		System.out.println("INT & CHAR type arguments:");
		System.out.println(x);
		System.out.println(c);
	}
	public static void main(String []arg)
	{
		//show(10,20l);
		show(100l,200);
		//show(20,'k');
	      //show(500,300);
	}
}
