//* if u have not done constructor chaining then the complete code of init block will be insert into the every constructor of ur class as a first line*/

class InitBlock
{
	int x;
	{
		x=10;
		System.out.println("InitBlock");
		
	}
	InitBlock()
	{
		System.out.println("Default");
		System.out.println(x);
	}
	InitBlock(int y)
	{
		System.out.println("parametrized: "+x+y);
	}
	public static void main(String []arg)
	{
		new InitBlock();
		new InitBlock(38);
	}
}