//* if u have done constructor chaining then the complete code of init block will be insert into that constructor as first line in which u have not used "this()" as first line*/ 

class IniteBlock
{
	{
		System.out.println("First");
	}
	IniteBlock()
	{
		this(10);
		System.out.println("Default");
	}
	IniteBlock(int x)
	{
		this(20,x);
		System.out.println("One Argument "+x);
	}
	IniteBlock(int y,int z)
	{
		System.out.println("Sum: "+(y+z));
	}
	{
		System.out.println("Second");
	}
	public static void main(String []arg)
	{
		new IniteBlock();
	}
}