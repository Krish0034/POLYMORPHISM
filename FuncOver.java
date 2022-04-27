class FuncOver
{
	 void show(int x)
    {
		System.out.println("No return type");
		
	}	
	 int show(int y)
	{
		return 20;
	}
	public static void main(String []ar)
	{
		FuncOver f=new FuncOver();
		f.show(10);
		f.show(30);
	}
}