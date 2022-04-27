class PConstructor
{
	int x,y;
	PConstructor(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	void show()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String []arg)
	{
		PConstructor p=new PConstructor(299,399);
		p.show();
	}
}