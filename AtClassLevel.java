class AtClassLevel
{
	int x=10;
	int y=10;
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String []args)
	{
		AtClassLevel a1=new AtClassLevel();
		AtClassLevel a2=new AtClassLevel();
		a1.show();
		a2.show();
	}
}