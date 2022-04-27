class MyThis2
{
	int x=10;
	void getData(int x,MyThis2 z)
	{
		System.out.println(x);
		System.out.println(z.x);
	}
	public static void main(String []ars)
	{
		MyThis2 mt=new MyThis2();
		System.out.println(mt.x);
		mt.getData(20,mt);
	}
}