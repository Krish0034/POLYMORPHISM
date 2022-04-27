class ViaMethod
{
	int x=getX();
	int getX()
	{
		System.out.println("Function "+x);
		return 100;
	}
	ViaMethod()
	{
		System.out.println("Constructor "+x);
	}
	public static void main(String... arg)
	{
		new ViaMethod();
	}
}