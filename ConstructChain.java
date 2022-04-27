class ConstructChain
{
	ConstructChain()
	{
		this(100);
		System.out.println("Default ");
	}
	ConstructChain(int x,int y)
	{
		this(x,y,500);
		System.out.println("Two Argument "+x+y);
	}
	ConstructChain(int x)
	{
		this(300,x);
		System.out.println("One Argument "+x);
	}
	ConstructChain(int x,int y,int z)
	{
		
		System.out.println("Therd Argument "+(x+y+z));
	}
	public static void main(String []arg)
	{
		new ConstructChain();
	}
}