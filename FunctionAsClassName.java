class FunctionAsClassName
{
	FunctionAsClassName()
	{
		System.out.println("Default");
	}
	void FunctionAsClassName()
	{
		System.out.println("Function");
	}
	public static void main(String []rg)
	{
		new FunctionAsClassName().FunctionAsClassName();
	}
}