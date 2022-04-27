class DConstructor
{
	int x;
	int y;
	DConstructor()
	{
		x=10;
		y=20;
	}
	void Show()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String []arg)
	{
		DConstructor d=new DConstructor();
		d.Show();
	}
}