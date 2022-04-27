class ReturnType
{
	static void show(char x)
	{
		System.out.println("NO return Type.");
		
	}
	static int show(int z)
	{
		System.out.println("With Return Type.");
		return z;
	}
	public static void main(String []arg)
	{
		show('a');
		show(200);
		int a=show(100);
		System.out.println(a);
	}
}