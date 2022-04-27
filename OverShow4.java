/*different return types (no play any role in overloading)*/
class OverShow4
{
	static void show(int x)
	{
		System.out.println("NO Return Type:"+x);
		
	}
	/*static int show(int x)
	{
		System.out.println("INT Return Type:"+x);
		return x;
		
	}*/
	public static void main(String []afg)
	{
		show(10);
		//int z=show(20);
	}
}